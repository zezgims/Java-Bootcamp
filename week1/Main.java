package week1;
import java.util.Scanner;

public class Main {
	
    String s1 = "Welcome";
    String s2 = "Welcome";
    String s3 = "Welcome";
    /* 
     * 1 tane obje oluşturulacaktır. 
     * 
     * s1 değişkenine "Welcome" değeri atandığında, Java kendi içerisinde tuttuğu String Pool adlı yapıda bu değerin 
     * bulunup bulunmadığını kontrol eder. Bulunmuyorsa hafızadan "Welcome" değeri için bir yer ayırır, s1 değişkeni
     * hafızadaki bu alanı referans eder ve String Pool adlı yapıya "Welcome" değerini ekler. Eğer bulunuyorsa "Welcome" 
     * değeri için daha önceden hafızadan yer ayrılmış demektir ve s1 değişkeni direkt olarak hafızadaki bu alanı referans eder.
     * 
     * s1 değişkeni tanımlandığında "Welcome" değeri daha önceden havuzda bulunmayacaktır. "Welcome" değerini içeren yeni
     * bir String objesi oluşturulacak ve s1 değişkeni bu objeyi referans edecektir. Ancak s2 ve s3 değişkenleri tanımlandığında
     * "Welcome" değeri havuzda bulunduğu için bu değişkenler direkt olarak hafızadaki s1'in referans ettiği objeyi referans
     * edeceklerdir. Bu yüzden 1 obje oluşturulacak ama 3 değişken de aynı objeyi referans etmiş olacaktır.
     * 
     * Not: Açıkladığım durum "Welcome" değeri çift tırnak ile tanımlandığı için geçerli. Eğer s1, s2 ve s3 değişkenlerine
     * ayrı ayrı <<new String("Welcome")>> ataması yapılsaydı String Pool yapısına bakılmadan 3 farklı obje oluşturulacaktı
     * ve her değişken, "Welcome" değeri için bellekten ayrılan 3 farklı yeri referans edecekti.
    */
    
    static String staticValue = "code";
    
    public static String findStringFromArray(String[] stringArray){

    	for(String str: stringArray) {
    	    if(str.contains(staticValue))
    	    	return str;
        }
        
    	return "";
    }
	
    public static void main(String[] args) {
		
        int arrayLength = 5;
		
	try {
	    Scanner scanner = new Scanner(System.in);
			
	    String[] stringArray = new String[arrayLength]; 
			
	    for(int i=0; i<arrayLength; i++) {
	        System.out.print((i+1)+ ". degeri giriniz: ");
	        stringArray[i] = scanner.nextLine();
	    }
			
	    String result = findStringFromArray(stringArray);
			
	    if(result.isEmpty())
	        System.out.println("Tanımlı value'yu içeren String deger bulunamadı."); 
	    else
		System.out.println("Tanımlı value'yu içeren String deger: " + result);
			
	    scanner.close();
	} catch(Exception e) {
	    System.out.println(e);
	}
		
    }

}
