package week1;
import java.util.Scanner;

public class HomeworkWeek1 {
	
    String s1 = "Welcome";
    String s2 = "Welcome";
    String s3 = "Welcome";
    /* 
     * 1 tane obje olu�turulacakt�r. 
     * 
     * s1 de�i�kenine "Welcome" de�eri atand���nda, Java kendi i�erisinde tuttu�u String Pool adl� yap�da bu de�erin 
     * bulunup bulunmad���n� kontrol eder. Bulunmuyorsa haf�zadan "Welcome" de�eri i�in bir yer ay�r�r, s1 de�i�keni
     * haf�zadaki bu alan� referans eder ve String Pool adl� yap�ya "Welcome" de�erini ekler. E�er bulunuyorsa "Welcome" 
     * de�eri i�in daha �nceden haf�zadan yer ayr�lm�� demektir ve s1 de�i�keni direkt olarak haf�zadaki bu alan� referans eder.
     * 
     * s1 de�i�keni tan�mland���nda "Welcome" de�eri daha �nceden havuzda bulunmayacakt�r. "Welcome" de�erini i�eren yeni
     * bir String objesi olu�turulacak ve s1 de�i�keni bu objeyi referans edecektir. Ancak s2 ve s3 de�i�kenleri tan�mland���nda
     * "Welcome" de�eri havuzda bulundu�u i�in bu de�i�kenler direkt olarak haf�zadaki s1'in referans etti�i objeyi referans
     * edeceklerdir. Bu y�zden 1 obje olu�turulacak ama 3 de�i�ken de ayn� objeyi referans etmi� olacakt�r.
     * 
     * Not: A��klad���m durum "Welcome" de�eri �ift t�rnak ile tan�mland��� i�in ge�erli. E�er s1, s2 ve s3 de�i�kenlerine
     * ayr� ayr� <<new String("Welcome")>> atamas� yap�lsayd� String Pool yap�s�na bak�lmadan 3 farkl� obje olu�turulacakt�
     * ve her de�i�ken, "Welcome" de�eri i�in bellekten ayr�lan 3 farkl� yeri referans edecekti.
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
				System.out.println("Tan�ml� value'yu i�eren String deger bulunamad�."); 
			else
				System.out.println("Tan�ml� value'yu i�eren String deger: " + result);
			
			scanner.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
