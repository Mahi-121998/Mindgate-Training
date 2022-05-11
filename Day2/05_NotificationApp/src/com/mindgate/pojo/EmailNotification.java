package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class EmailNotification implements Notification   {
		public void sendNotification(String to, String message) {
			System.out.println("Sending Email Notifiacation");
			System.out.println("to :"+to);
			System.out.println("Message :"+ message);

}
	}
