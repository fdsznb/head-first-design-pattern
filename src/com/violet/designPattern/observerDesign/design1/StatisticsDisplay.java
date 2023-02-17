package com.violet.designPattern.observerDesign.design1;

public class StatisticsDisplay implements Observer, DisplayElement{

    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + humidity + " humidity and " + pressure + " pressure");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
