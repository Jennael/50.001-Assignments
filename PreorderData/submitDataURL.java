import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class submitDataURL {

    private String server = "http://fastqueue.000webhostapp.com/store/preorderrequirements.php/Preorderform.html?num_of_preorder=5&preorder_ready_time=2018-12-10%2009:30:00.000000";
    private ArrayList<String> httpResult;

    public static void main(String[] args){
        submitDataURL posting = new submitDataURL();
        System.out.println(posting.post(""));
    }

    public void HttpConnector(Context context, String server){
        this.context = context;
        this.server = server;
        httpResult = new ArrayList<>();
    }


    public ArrayList<String> post(String details){
        //Log.d(TAG,server+" POST "+details);

        try{
            URL url = new URL(server);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setDoOutput(true);
            String charset = "UTF-8";
            connection.setRequestProperty("Accept-Charset",charset);

            OutputStream os = connection.getOutputStream();
            os.write(details.getBytes(charset));
            int connectionResult = connection.getResponseCode();

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while((line = br.readLine())!=null) {
                httpResult .add(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return httpResult;
        };
    }

}


