package main;

public class App
{
    public static void main(String[] args) 
    {
        WeatherStation station = new WeatherStation();
        station.setWeatherData(new WeatherData(50, 50, 25));
        TemperatureDisplay disp = new TemperatureDisplay(station.getWeatherData());
        station.registerObserver(disp);
        disp.display();
        station.setWeatherData(new WeatherData(64, 9543, 4324));
        disp.display();
    }
}
