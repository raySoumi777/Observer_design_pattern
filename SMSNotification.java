package Factory;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SMSNotification implements NotificationFactory {

	@Override
	public void executeNotification(String msg) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(new JFrame(), msg+"sent successfully");
	}

}
