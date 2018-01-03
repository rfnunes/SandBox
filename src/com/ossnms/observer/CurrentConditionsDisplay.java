/*
 * Copyright (C) Coriant
 * The reproduction, transmission or use of this document or its contents 
 * is not permitted without express written authorization.
 * Offenders will be liable for damages.
 * All rights, including rights created by patent grant or 
 * registration of a utility model or design, are reserved.
 * Modifications made to this document are restricted to authorized personnel only. 
 * Technical specifications and features are binding only when specifically 
 * and expressly agreed upon in a written contract.
 *
 */

package com.ossnms.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by pt102933 on 18/10/2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;

    private float temperature;

    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Data) {
            Data data = (Data) arg;
            temperature = data.getTemperature();
            humidity = data.getHumidity();
        }
        display();
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + " F degrees, humidity %" + humidity);
    }
}
