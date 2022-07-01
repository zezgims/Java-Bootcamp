
import thread.ReaderThread;
import thread.WriterThread;

public class Main {

	public static void main(String[] args) {
		
		String filePath = "src/main/resources/students.json";
		
		ReaderThread readerThread = new ReaderThread(filePath);		//Okuma iþlemi için thread oluþturur ve .json dosya yolunu parametre olarak gönderir.
		Thread thread1 = new Thread(readerThread);
		
		WriterThread writerThread = new WriterThread();		//Okunan verileri yazdýrmak için thread oluþturur.
		Thread thread2 = new Thread(writerThread);		
		
		try {
			thread1.start();		//Okuma thread'i baþlar.
			Thread.sleep(3000);	
			thread2.start();		//Yazma thread'i baþlar.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
