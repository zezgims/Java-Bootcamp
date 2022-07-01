package thread;

import json.JsonReader;
import model.StudentListContainer;

public class ReaderThread implements Runnable {		//Runnable @FunctionInterface implement edilerek thread class'� olu�turur.
	
	private String filePath; 
	
	public ReaderThread(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public void run() {		//Runnable'a ait metot.
		
		JsonReader jsonReader = new JsonReader(filePath);		//Okuma i�lemini yapacak class'a eri�im sa�lamak i�in nesne olu�turur.
		
		try {
			StudentListContainer.studentList = jsonReader.read();		//Okuma metodu �a�r�l�r ve o metodun d�nd�rd��� liste static tan�mlanm�� studentList'e e�itlenir.
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
