package com.mindgate.pojo;

import java.time.LocalDate;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("finanacial")
@Scope("prototype")

public class FinanacialYearDetails {
	private int yearId;
	private LocalDate yearStartDate;
	private LocalDate yearEndDate;
	
	
	 public FinanacialYearDetails() {
		// TODO Auto-generated constructor stub
	}

	public FinanacialYearDetails(int yearId, LocalDate yearStartDate, LocalDate yearEndDate) {
		super();
		this.yearId = yearId;
		this.yearStartDate = yearStartDate;
		this.yearEndDate = yearEndDate;
	}

	public int getYearId() {
		return yearId;
	}

	public void setYearId(int yearId) {
		this.yearId = yearId;
	}

	public LocalDate getYearStartDate() {
		return yearStartDate;
	}

	public void setYearStartDate(LocalDate yearStartDate) {
		this.yearStartDate = yearStartDate;
	}

	public LocalDate getYearEndDate() {
		return yearEndDate;
	}

	public void setYearEndDate(LocalDate yearEndDate) {
		this.yearEndDate = yearEndDate;
	}

	@Override
	public String toString() {
		return "FinanacialYearDetails [yearId=" + yearId + ", yearStartDate=" + yearStartDate + ", yearEndDate="
				+ yearEndDate + "]";
	}
	 
	

}
