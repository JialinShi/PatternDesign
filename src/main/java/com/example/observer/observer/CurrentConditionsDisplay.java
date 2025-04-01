package com.example.observer.observer;

import com.example.observer.subject.Subject;
import com.example.observer.subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display{
    private int temp;
    private int humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData subject){
        this.weatherData = subject;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("current temp is "+ temp + "and humidity is "+ humidity);

    }

    @Override
    public void update() {
        this.temp = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
    @Override
    public void unsubscribe(){
        weatherData.removeObserver(this);
        System.out.println("Unsubscribed from current weather updates.");
    }

}
