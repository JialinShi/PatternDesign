package com.example.observer.observer;
import com.example.observer.subject.Subject;
import com.example.observer.subject.WeatherData;
import java.util.List;

public class StatisticsDisplay implements Observer, Display{
    private int sum_temp;
    private int count;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData subject){
        weatherData = subject;
        weatherData.registerObserver(this);
    }
    @Override
    public void unsubscribe(){
        weatherData.removeObserver(this);
        System.out.println("Unsubscribed from Stats weather updates.");
    }

    @Override
    public void display() {
        System.out.println("Average temp is " + sum_temp/count);
    }

    @Override
    public void update() {
        sum_temp += weatherData.getTemperature();
        count += 1;
        display();
    }
}
