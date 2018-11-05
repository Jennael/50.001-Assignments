import java.util.ArrayList;

public class TemperatureAlert implements Subject{
    private int temperature;

    public TemperatureAlert() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (this.temperature>35 || this.temperature<10){
            notifyObservers();
        }
    }

    private ArrayList<Observer> observers = new ArrayList<Observer>();

    @Override
    public void register(Observer o){
        observers.add(o);
    }

    @Override
    public void unregister(Observer o){
        observers.remove(o);
    }

    @Override
    public void notifyObservers(){
        for (Observer o: observers){
            o.update(this.temperature);
        }
    }


}