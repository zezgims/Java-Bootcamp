package week2;

import week2.model.Bill;
import week2.model.MemberAccount;
import week2.model.Response;
import week2.service.BillService;

public class Main {
	
	public static void main(String[] args) {
		
		String starString = getStarString();
		
		MemberAccount member = new MemberAccount("Zeynep", "Yalçýnkaya", 2612, "26A1998", 150, "5515913598");
		
		Bill[] billList = new Bill[3];		
		billList[0] = new Bill(100, 1, 2612);
		billList[1] = new Bill(150, 2, 2613);
		billList[2]= new Bill(200, 3, 2614);
		
		BillService client = new Client();
		
		Response response = new Response();
		
		System.out.println("Test 1\n");
		//Client'e ait payment() metodu için; fatura tutarýnýn, üyenin bakiyesinden az olduðu durumu test eder.
		try {
			response = client.payment(billList[0].getBillType(), member.getMemberCode(), billList[0].getAmount(), billList[0].getProcessDate(), member.getBalance());
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		if(response.getCode().equals("0")) 
			System.out.println("Ýþlem baþarýlý. Oluþturulma tarihi :" + response.getDate());
		else
			System.out.println("Ýþlem baþarýsýz.");
		
		System.out.println("\n"+starString);
		
		
		System.out.println("Test 2\n");
		//Client'e ait payment() metodu için; fatura tutarýnýn, üyenin bakiyesinden fazla olduðu durumu test eder.
		response = new Response(); 
		try {
			response = client.payment(billList[2].getBillType(), member.getMemberCode(), billList[2].getAmount(), billList[2].getProcessDate(), member.getBalance());
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		}
		if(response.getCode().equals("0")) 
			System.out.println("Ýþlem baþarýlý. Oluþturulma tarihi :" + response.getDate());
		else
			System.out.println("Ýþlem baþarýsýz.");
		
		System.out.println("\n"+starString);
		
		
		System.out.println("Test 3\n");
		//Client'e ait query() metodu için; fatura türlerine göre sorgulama iþlemini test eder.
		for(Bill bill: billList) {	
			response = new Response(); 
			int billType = bill.getBillType();
			
			if(billType == 1)		//Fatura türü 1'e eþit olduðu durumlarda telefon faturasýný sorgular.		
				response = client.query(billType, member.getMemberCode(), member.getPhoneNumber());
			else if(billType == 2)		//Fatura türü 2'ye eþit olduðu durumlarda internet faturasýný sorgular.
				response = client.query(billType, member.getMemberCode());
			else if(billType == 3)		//Fatura türü 3'e eþit olduðu durumlarda su faturasýný sorgular.
				response = client.query(billType, member.getMemberCode());
			
			if(response.getCode().equals("0")) 
				System.out.println("Ýþlem baþarýlý. Oluþturulma tarihi :" + response.getDate());
			else
				System.out.println("Ýþlem baþarýsýz.");
			
		}
		System.out.println("\n"+starString);
		
		
		System.out.println("Test 4\n");
		//Client'e ait cancelPayment() metodu için; fatura ödeme iptali iþlemini test eder.
		response = new Response(); 
		response = client.cancelPayment(billList[1].getBillType(), member.getMemberCode(), billList[1].getAmount(), billList[1].getProcessDate());
		if(response.getCode().equals("0")) 
			System.out.println("Ýþlem baþarýlý. Oluþturulma tarihi :" + response.getDate());
		else
			System.out.println("Ýþlem baþarýsýz.");
		
	}
	
	public static String getStarString() {
		
		String star = "";		
		for(int i=0; i<50; i++) {
			star+="*";
		}
		
		return star;
		
	}
		
}
