package thread;

import json.JsonReader;
import model.StudentListContainer;

public class ReaderThread implements Runnable {		//Runnable @FunctionInterface implement edilerek thread class'ý oluþturur.
	
	private String filePath; 
	
	public ReaderThread(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public void run() {		//Runnable'a ait metot.
		
		JsonReader jsonReader = new JsonReader(filePath);		//Okuma iþlemini yapacak class'a eriþim saðlamak için nesne oluþturur.
		
		try {
			StudentListContainer.studentList = jsonReader.read();		//Okuma metodu çaðrýlýr ve o metodun döndürdüðü liste static tanýmlanmýþ studentList'e eþitlenir.
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
