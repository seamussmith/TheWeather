package main;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherStation implements ISubject<WeatherData> {

    private ArrayList<IObserver<WeatherData>> observers;
    private WeatherData currentData;
    private void setWeatherData(WeatherData newData)
    {
        currentData = newData;
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
        observers.forEach(x -> x.update(currentData));
    }
    
}
