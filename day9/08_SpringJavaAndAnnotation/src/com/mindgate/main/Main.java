package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.JavaAndAnnotationConfig;
import com.mindgate.pojo.FinanacialYearDetails;
import com.mindgate.pojo.MonthsDetails;



public class Main {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new AnnotationConfigApplicationContext(JavaAndAnnotationConfig.class);
		System.out.println("Application is certed");
		
		FinanacialYearDetails finanacialYearDetails= applicationContext.getBean("finanacial", FinanacialYearDetails.class);
		finanacialYearDetails.setYearId(1);
		finanacialYearDetails.setYearStartDate(LocalDate.of(2022, 04, 19));
		finanacialYearDetails.setYearEndDate(LocalDate.of(2023, 03, 31));
		System.out.println(finanacialYearDetails);
		
		MonthsDetails monthsDetails= applicationContext.getBean("months",MonthsDetails.class);
		monthsDetails.setMonthId(2);
		monthsDetails.setMonthStartDate(LocalDate.of(2022, 05, 01));
		monthsDetails.setMonthEndDate(LocalDate.of(2022, 05, 31));
		monthsDetails.setFinanacialYearDetails(finanacialYearDetails);
		System.out.println(monthsDetails);
		 
		
	}

}
