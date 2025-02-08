package User;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class SendNotification extends JFrame {
	private JPanel send,msg;
	private JComboBox c1;
	private JButton sendbtn;
	private JTextArea TA;
	SendNotification(){
		setSize(400,800);
		setLayout(null);
		setTitle("Notification option");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String s1[] = { "SMS", "Email" };
        c1 = new JComboBox(s1);
        send = new JPanel();
        msg=new JPanel();
        send.add(c1);
        c1.setBounds(90, 90, 80, 38);
        send.setBounds(80, 80, 200, 90);
        send.setBorder(BorderFactory.createTitledBorder("Choose option"));
        sendbtn=new JButton("select to send");
        send.add(sendbtn);
        sendbtn.setBounds(190,90,100,50);
        TA=new JTextArea();
		msg.add(TA);
		TA.setBounds(90, 250, 280, 280);
		msg.setBounds(40, 240, 300, 300);
		msg.setBorder(BorderFactory.createTitledBorder("message Area"));
        add(send);
        add(msg);
        setVisible(true);
        addWindowListener(new MyWindowAdapter());
        sendbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String choice=(String)c1.getSelectedItem();
				TA.setText("Write your Message");
				sendbtn.setText("Send");
				sendbtn.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						new NotificationFactoryExecution().sendNotification(choice).executeNotification(choice);

					}
					
				});		
			}
        	
        });
	}
	public static void main(String args[]) {
		new SendNotification();
	}
}
