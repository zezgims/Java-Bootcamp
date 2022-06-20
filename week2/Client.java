package week2;

import java.time.LocalDate;

import week2.model.Response;
import week2.service.BillService;

public class Client extends BillService {
	
    @Override
    public Response payment(int billType, String memberCode, double amount, LocalDate processDate, double balance) throws CustomException {
		
	Response response = new Response();

	if(amount > balance) {		//Fatura tutarının, üyenin bakiyesinden fazla olduğu durumları kontrol eder ve hata mesajı fırlatır.
	    response.setCode("1");
	    response.setDate(LocalDate.now().toString());
	    throw new CustomException("Yetersiz bakiye!");
	} 
	else {
	    response.setCode("0");
	    response.setDate(LocalDate.now().toString());
	    System.out.println("Fatura ödendi.");
	}
		
	return response;
		
    } 
	
    @Override
    public Response query(int billType, String memberCode) {
		
        if(billType == 2)		//Fatura türü 2'ye eiit olduğu durumlarda internet faturasını sorgular.
	    System.out.println("İnternet faturası sorgulandı.");
	else if(billType == 3)		//Fatura türü 3'e eşit olduğu durumlarda su faturasını sorgular.
	    System.out.println("Su faturası sorgulandı.");
		
	return new Response("0");
		
    }
	
    @Override
    public Response query(int billType, String memberCode, String phoneNumber) {
		
        //Fatura türü 1'e eþit olduðu durumlarda telefon faturasýný sorgular.
	System.out.println("Telefon faturasý sorgulandý.");		
		
	return new Response("0");
		
    }
	
    @Override
    public Response cancelPayment(int billType, String memberCode, double amount, LocalDate processDate) {
		
        System.out.println("Ödeme iptal edildi.");
		
	return new Response("0");
		
    }
	
}
