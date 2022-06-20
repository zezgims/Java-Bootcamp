package week2;

import java.time.LocalDate;

import week2.model.Response;
import week2.service.BillService;

public class Client extends BillService {
	
	@Override
	public Response payment(int billType, String memberCode, double amount, LocalDate processDate, double balance) throws CustomException {
		
		Response response = new Response();

		if(amount > balance) {		//Fatura tutar�n�n, �yenin bakiyesinden fazla oldu�u durumlar� kontrol eder ve hata mesaj� f�rlat�r.
			response.setCode("1");
			response.setDate(LocalDate.now().toString());
			throw new CustomException("Yetersiz bakiye!");
		} 
		else {
			response.setCode("0");
			response.setDate(LocalDate.now().toString());
			System.out.println("Fatura �dendi.");
		}
		
		return response;
		
	} 
	
	@Override
	public Response query(int billType, String memberCode) {
		
		if(billType == 2)		//Fatura t�r� 2'ye e�it oldu�u durumlarda internet faturas�n� sorgular.
			System.out.println("�nternet faturas� sorguland�.");
		else if(billType == 3)		//Fatura t�r� 3'e e�it oldu�u durumlarda su faturas�n� sorgular.
			System.out.println("Su faturas� sorguland�.");
		
		return new Response("0");
		
	}
	
	@Override
	public Response query(int billType, String memberCode, String phoneNumber) {
		
		//Fatura t�r� 1'e e�it oldu�u durumlarda telefon faturas�n� sorgular.
		System.out.println("Telefon faturas� sorguland�.");		
		
		return new Response("0");
		
	}
	
	@Override
	public Response cancelPayment(int billType, String memberCode, double amount, LocalDate processDate) {
		
		System.out.println("�deme iptal edildi.");
		
		return new Response("0");
		
	}
	
}
