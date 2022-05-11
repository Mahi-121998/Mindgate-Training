package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.NotificationFactory;
import com.mindgate.pojo.EmailNotification;
import com.mindgate.pojo.SMSNotification;
import com.mindgate.service.Notification;

public class NotificationAppMain {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String to;
		String message;
		int choice;
		System.out.println("1.SMS Notification");
		System.out.println("2.Email Notifiaction");
		System.out.println("3.WhatsApp Notification");
		System.out.println("Enter your choice");
		choice=scanner.nextInt();
		
		System.out.println("Enter contact :");
		to= scanner.next();
		scanner.nextLine();

		System.out.println("enter message");
		message=scanner.nextLine();
		Notification notification=NotificationFactory.getNotifiafction(choice);
		notification.sendNotification(to, message);
				
		}

}
