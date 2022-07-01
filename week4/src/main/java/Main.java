
import thread.ReaderThread;
import thread.WriterThread;

public class Main {

	public static void main(String[] args) {
		
		String filePath = "src/main/resources/students.json";
		
		ReaderThread readerThread = new ReaderThread(filePath);		//Okuma i�lemi i�in thread olu�turur ve .json dosya yolunu parametre olarak g�nderir.
		Thread thread1 = new Thread(readerThread);
		
		WriterThread writerThread = new WriterThread();		//Okunan verileri yazd�rmak i�in thread olu�turur.
		Thread thread2 = new Thread(writerThread);		
		
		try {
			thread1.start();		//Okuma thread'i ba�lar.
			Thread.sleep(3000);	
			thread2.start();		//Yazma thread'i ba�lar.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
