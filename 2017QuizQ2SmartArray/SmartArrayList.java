
public class SmartArrayList {
    private static final int INIT_CAPACITY = 2;
    private int size=0;  // no of element stored
    private String[] data = new String[INIT_CAPACITY]; // where the element stored

    public SmartArrayList() {
    }

    public void add(int index, String s) {
        // Double the size of array if index requested if at the last location, or array is full or array at the last position is not empty
        if ((index >= 0 && index >= data.length-1) || (this.size >= data.length) || data[data.length-1] != null) {
            String[] newData = new String[data.length*2];
            for (int i=0; i< data.length; i++){
                if (newData != null){
                    newData[i] = data[i];
                }
            }
            data = newData;
        }

        // Shift elements right
        for (int i = data.length-1; i >= index +1; i--){
            data[i] = data[i-1];
        }
        
        // Input string
        data[index] = s;
        size += 1;
    }

    public void add(String s) {
        if (size < data.length){
            for (int i=0; i<data.length; i++){
                if (data[i] == null){
                    data[i] = s;
                    size += 1;
                    break;
                }
            }
        }
    }

    public String get(int index) {
        if (index >= 0 && index<data.length){
            return data[index];
        } else {
            return null;
        }
    }

    public void set(int index, String s){
        if (index>= 0 && index<data.length){
            data[index] = s;
        }
    }

    public void remove(int index) {
        if (index>= 0 && index < data.length){
            for (int i = index ; i < data.length; i++){
                data[i] = data[i+1];
            }
            size -=1;            
        }
    }

    @Override
    public String toString(){
        String out = "";
        for (int i = 0 ; i < data.length; i++){
            out.concat(data[i]);
        }
        return "[" + out + "]";
    }

}
