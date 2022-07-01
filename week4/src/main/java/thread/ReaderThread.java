package thread;

import json.JsonReader;
import model.StudentListContainer;

public class ReaderThread implements Runnable {		//Runnable @FunctionInterface implement edilerek thread class'ı oluşturur.
	
    private String filePath; 
	
    public ReaderThread(String filePath) {
	this.filePath = filePath;
    }
	
    @Override
    public void run() {		//Runnable'a ait metot.
		
	JsonReader jsonReader = new JsonReader(filePath);		//Okuma işlemini yapacak class'a erişim sağlamak için nesne oluşturur.
		
	try {
	    StudentListContainer.studentList = jsonReader.read();		//Okuma metodu çağrılır ve o metodun döndürdüğü liste static tanımlanmış studentList'e eşitlenir.
	} catch (Exception e) {
	    e.printStackTrace();
	}
		
    }
	
    public String getFilePath() {
	return filePath;
    }
    public void setFilePath(String filePath) {
	this.filePath = filePath;
    }

}
