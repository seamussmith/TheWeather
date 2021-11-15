package main;

public class App
{
    public static void main(String[] args) 
    {
        WeatherStation station = new WeatherStation();
        station.weatherData(new WeatherData(50, 50, 25));
        TemperatureDisplay disp = new TemperatureDisplay(station.weatherData());
        station.registerObserver(disp);
        disp.display();
        station.weatherData(new WeatherData(64, 9543, 4324));
        disp.display();
    }
}
