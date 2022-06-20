package week2.model;

import java.time.LocalDate;

public class Bill {
	
	private double amount;
	private LocalDate processDate;
	private int billType;
	private int id;
	
	public Bill(double amount, int billType, int id) {
		this.amount = amount;
		this.processDate = LocalDate.now();
		this.billType = billType;
		this.id = id;
    }
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public LocalDate getProcessDate() {
		return processDate;
	}
	public void setProcessDate(LocalDate processDate) {
		this.processDate = processDate;
	}
	
	public int getBillType() {
		return billType;
	}
	public void setBillType(int billType) {
		this.billType = billType;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
