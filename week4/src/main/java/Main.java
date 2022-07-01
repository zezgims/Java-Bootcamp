import thread.ReaderThread;
import thread.WriterThread;

public class Main {

    public static void main(String[] args) {
		
	String filePath = "src/main/resources/students.json";
	
	ReaderThread readerThread = new ReaderThread(filePath);		//Okuma işlemi için thread oluşturur ve .json dosya yolunu parametre olarak gönderir.
	Thread thread1 = new Thread(readerThread);
		
	WriterThread writerThread = new WriterThread();		//Okunan verileri yazdırmak için thread oluşturur.
	Thread thread2 = new Thread(writerThread);		
		
	try {
	    thread1.start();		//Okuma thread'i başlar.
	    Thread.sleep(3000);	
	    thread2.start();		//Yazma thread'i başlar.
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}

    }

}
