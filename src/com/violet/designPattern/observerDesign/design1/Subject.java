package com.violet.designPattern.observerDesign.design1;


public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
