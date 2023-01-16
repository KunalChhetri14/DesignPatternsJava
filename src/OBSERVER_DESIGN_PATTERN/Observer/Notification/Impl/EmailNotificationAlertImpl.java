package OBSERVER_DESIGN_PATTERN.Observer.Notification.Impl;

import OBSERVER_DESIGN_PATTERN.Observable.Stocks.StocksObservableInterface;
import OBSERVER_DESIGN_PATTERN.Observer.Notification.NotificationAlertObserverInterface;

public class EmailNotificationAlertImpl implements NotificationAlertObserverInterface {

  String username;
  StocksObservableInterface observable;

  public EmailNotificationAlertImpl(String emailId, StocksObservableInterface stocksObservable) {
    this.username = emailId;
    this.observable = stocksObservable;
  }

  @Override
  public void update() {
    System.out.println("Email is sent to "+ this.username + " with stock count: "+ observable.getStockCount());
  }
}
