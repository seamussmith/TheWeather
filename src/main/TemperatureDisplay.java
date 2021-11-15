package main;

public class TemperatureDisplay implements IObserver<WeatherData>, IDisplayElement {

    WeatherData data;
    public TemperatureDisplay(WeatherData data)
    {
        this.data = data;
    }
    @Override
    public void update(WeatherData data) {
        this.data = data;
    }
    @Override
    public void display() {
        System.out.println(data.temp());
    }
    
}
