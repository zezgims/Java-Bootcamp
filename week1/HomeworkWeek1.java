package week1;
import java.util.Scanner;

public class HomeworkWeek1 {
	
    String s1 = "Welcome";
    String s2 = "Welcome";
    String s3 = "Welcome";
    /* 
     * 1 tane obje oluþturulacaktýr. 
     * 
     * s1 deðiþkenine "Welcome" deðeri atandýðýnda, Java kendi içerisinde tuttuðu String Pool adlý yapýda bu deðerin 
     * bulunup bulunmadýðýný kontrol eder. Bulunmuyorsa hafýzadan "Welcome" deðeri için bir yer ayýrýr, s1 deðiþkeni
     * hafýzadaki bu alaný referans eder ve String Pool adlý yapýya "Welcome" deðerini ekler. Eðer bulunuyorsa "Welcome" 
     * deðeri için daha önceden hafýzadan yer ayrýlmýþ demektir ve s1 deðiþkeni direkt olarak hafýzadaki bu alaný referans eder.
     * 
     * s1 deðiþkeni tanýmlandýðýnda "Welcome" deðeri daha önceden havuzda bulunmayacaktýr. "Welcome" deðerini içeren yeni
     * bir String objesi oluþturulacak ve s1 deðiþkeni bu objeyi referans edecektir. Ancak s2 ve s3 deðiþkenleri tanýmlandýðýnda
     * "Welcome" deðeri havuzda bulunduðu için bu deðiþkenler direkt olarak hafýzadaki s1'in referans ettiði objeyi referans
     * edeceklerdir. Bu yüzden 1 obje oluþturulacak ama 3 deðiþken de ayný objeyi referans etmiþ olacaktýr.
     * 
     * Not: Açýkladýðým durum "Welcome" deðeri çift týrnak ile tanýmlandýðý için geçerli. Eðer s1, s2 ve s3 deðiþkenlerine
     * ayrý ayrý <<new String("Welcome")>> atamasý yapýlsaydý String Pool yapýsýna bakýlmadan 3 farklý obje oluþturulacaktý
     * ve her deðiþken, "Welcome" deðeri için bellekten ayrýlan 3 farklý yeri referans edecekti.
    */
    
    static String staticValue = "code";
    
    public static String findStringFromArray(String[] stringArray){

    	for(String str: stringArray)
        {
    	    if(str.contains(staticValue))
    	    	return str;
        }
        
    	return "";
    }
    
	public static void main(String[] args) {
		
		int arrayLength = 5;
		
		try
		{
			Scanner scanner = new Scanner(System.in);
			
			String[] stringArray = new String[arrayLength]; 
			
			for(int i=0; i<arrayLength; i++) 
			{
			    System.out.print((i+1)+ ". degeri giriniz: ");
			    stringArray[i] = scanner.nextLine();
			}
			
			String result = findStringFromArray(stringArray);
			
			if(result.isEmpty())
				System.out.println("Tanýmlý value'yu içeren String deger bulunamadý."); 
			else
				System.out.println("Tanýmlý value'yu içeren String deger: " + result);
			
			scanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
