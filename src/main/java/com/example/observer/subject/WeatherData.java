package com.example.observer.subject;

import com.example.observer.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
     private List<Observer> observers;
     private int temperature;
     private int humidity;
     private int pressure;

     public WeatherData(){
         observers = new ArrayList<>();
     }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
         observers.remove(o);
    }

    @Override
    public void notifyObservers() {
         for(Observer o:observers){
             o.update();
         }
    }
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(int temp, int humid, int press){
         this.temperature = temp;
         this.humidity = humid;
         this.pressure = press;
         measurementsChanged();
    }

    public int getTemperature(){
        return temperature;
    }
    public int getHumidity(){
        return humidity;
    }
    public int getPressure(){
        return pressure;
    }

}
