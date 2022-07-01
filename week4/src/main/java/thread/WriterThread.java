package thread;

import json.JsonWriter;
import model.StudentListContainer;

public class WriterThread implements Runnable {		//Runnable @FunctionInterface implement edilerek thread class'ý oluþturur.
	
	@Override
	public void run() {		//Runnable'a ait metot.
		
		JsonWriter jsonWriter = new JsonWriter();		//Yazma iþlemini yapacak class'a eriþim saðlamak için nesne oluþturur.
		
		jsonWriter.write(StudentListContainer.studentList);		//Yazma metodu çaðrýlýr, parametre olarak Student nesnelerini içeren static tanýmlanmýþ listeyi gönderir.
		
	}

}
