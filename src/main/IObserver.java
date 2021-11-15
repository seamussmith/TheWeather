package main;

public interface IObserver<TData> {
    public void update(TData data);
}
