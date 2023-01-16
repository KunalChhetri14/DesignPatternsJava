package OBSERVER_DESIGN_PATTERN;

import OBSERVER_DESIGN_PATTERN.Observable.Stocks.Impl.IphoneObservableImpl;
import OBSERVER_DESIGN_PATTERN.Observable.Stocks.StocksObservableInterface;
import OBSERVER_DESIGN_PATTERN.Observer.Notification.Impl.EmailNotificationAlertImpl;
import OBSERVER_DESIGN_PATTERN.Observer.Notification.Impl.PhoneNotificationAlertImpl;
import OBSERVER_DESIGN_PATTERN.Observer.Notification.NotificationAlertObserverInterface;

public class StoreMain {

  public static void main(String args[]) {

    StocksObservableInterface iphoneObservable = new IphoneObservableImpl();

    NotificationAlertObserverInterface observer1 = new EmailNotificationAlertImpl("kunalchhetri14@gmail.com", iphoneObservable);
    iphoneObservable.add(observer1);
    NotificationAlertObserverInterface observer2 = new PhoneNotificationAlertImpl("username1.....", iphoneObservable);

    iphoneObservable.setStockCount(11);
    iphoneObservable.setStockCount(12);
    iphoneObservable.setStockCount(13);
    iphoneObservable.add(observer2);
    iphoneObservable.setStockCount(14);
  }

}
