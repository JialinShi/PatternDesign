package com.example.observer.test;

import com.example.observer.observer.CurrentConditionsDisplay;
import com.example.observer.observer.StatisticsDisplay;
import com.example.observer.subject.WeatherData;

public class TestWeatherObserser {

    public static void main(String[] args) {
        WeatherData  weatherdata = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherdata);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherdata);

        weatherdata.setMeasurements(25,80, 100);
        weatherdata.setMeasurements(30,90, 120);
        statisticsDisplay.unsubscribe();
        weatherdata.setMeasurements(15,60, 90);

    }

}
