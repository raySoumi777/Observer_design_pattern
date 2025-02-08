package User;

import Factory.EmailNotification;
import Factory.NotificationFactory;
import Factory.SMSNotification;

public class NotificationFactoryExecution {
	public static NotificationFactory sendNotification(String choice) {
		if(choice.equals("SMS")) {
			return new SMSNotification();
		}else if(choice.equals("Email")) {
			return new EmailNotification();
		}else
			return null;
	}
}
