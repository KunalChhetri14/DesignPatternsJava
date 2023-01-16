package OBSERVER_DESIGN_PATTERN.Observer.Notification.Impl;

import OBSERVER_DESIGN_PATTERN.Observable.Stocks.StocksObservableInterface;
import OBSERVER_DESIGN_PATTERN.Observer.Notification.NotificationAlertObserverInterface;

public class PhoneNotificationAlertImpl implements NotificationAlertObserverInterface {

  StocksObservableInterface observable;
  String username;

  public PhoneNotificationAlertImpl(String username, StocksObservableInterface observableInstance) {
    this.username = username;
    this.observable = observableInstance;
  }

  @Override
  public void update() {
    System.out.println("The updated value of stock count "+ observable.getStockCount() + " is sent to username: "+ username);
  }
}
