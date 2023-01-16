package OBSERVER_DESIGN_PATTERN.Observable.Stocks;

import OBSERVER_DESIGN_PATTERN.Observer.Notification.NotificationAlertObserverInterface;

public interface StocksObservableInterface {

  public void add(NotificationAlertObserverInterface observer);

  public void remove(NotificationAlertObserverInterface observer);

  public void notifySubscriber();

  public void setStockCount(int newStockCount);

  public int getStockCount();

}
