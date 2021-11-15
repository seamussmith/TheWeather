package main;

public interface ISubject<TData> {
    public void registerObserver(IObserver<TData> o);
    public void removeObserver(IObserver<TData> o);
    public void notifyObservers();
}
