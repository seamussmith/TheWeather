package main;

import java.util.ArrayList;

public class WeatherStation implements ISubject<WeatherData> {

    private ArrayList<IObserver<WeatherData>> observers = new ArrayList<>();
    private WeatherData weatherData;
    public WeatherData getWeatherData()
    {
        return weatherData;
    }
    public void setWeatherData(WeatherData newData)
    {
        weatherData = newData;
        notifyObservers();
    }
    @Override
    public void registerObserver(IObserver<WeatherData> o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(IObserver<WeatherData> o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(x -> x.update(weatherData));
    }
    
}
