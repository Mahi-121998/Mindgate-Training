package com.mindgate.pojo;

import com.mindgate.service.Notification;

public class WhatsAppNotification implements Notification {
	public void sendNotification(String to, String message) {
		System.out.println("Sending WhatsApp Notifiacation");
		System.out.println("to :"+to);
		System.out.println("Message :"+ message);


}
}
