package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class SMSNotification implements Notification   {
	public void sendNotification(String to, String message) {
		System.out.println("Sending SMS Notifiacation");
		System.out.println("to :"+to);
		System.out.println("Message :"+ message);
		
	}

	

}
