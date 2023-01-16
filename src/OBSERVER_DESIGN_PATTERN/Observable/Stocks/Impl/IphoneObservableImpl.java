package OBSERVER_DESIGN_PATTERN.Observable.Stocks.Impl;

import OBSERVER_DESIGN_PATTERN.Observable.Stocks.StocksObservableInterface;
import OBSERVER_DESIGN_PATTERN.Observer.Notification.NotificationAlertObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservableInterface {

  List<NotificationAlertObserverInterface> observers = new ArrayList<>();

  public int stockCount = 0;

  @Override
  public void add(NotificationAlertObserverInterface observer) {
    observers.add(observer);
//    notifySubscriber();
  }

  @Override
  public void remove(NotificationAlertObserverInterface observer) {
    observers.remove(observer);
  }

  @Override
  public void notifySubscriber() {
    for(NotificationAlertObserverInterface observer: observers) {
      observer.update();
    }
  }

  @Override
  public void setStockCount(int newStockCount) {
    this.stockCount = newStockCount;
    notifySubscriber();
  }

  @Override
  public int getStockCount() {
    return stockCount;
  }
}
