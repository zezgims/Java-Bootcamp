package week2.service;

import java.time.LocalDate;

import week2.CustomException;
import week2.model.Response;

public abstract class BillService {
	
	 public abstract Response payment(int billType, String memberCode, double amount, LocalDate processDate, double balance) throws CustomException;
	 
	 public abstract Response query(int billType, String memberCode);
	 
	 public abstract Response query(int billType, String memberCode, String phoneNumber);
	 
	 public abstract Response cancelPayment(int billType, String memberCode, double amount, LocalDate processDate);
     
}
