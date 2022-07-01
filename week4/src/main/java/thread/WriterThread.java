package thread;

import json.JsonWriter;
import model.StudentListContainer;

public class WriterThread implements Runnable {		//Runnable @FunctionInterface implement edilerek thread class'� olu�turur.
	
	@Override
	public void run() {		//Runnable'a ait metot.
		
		JsonWriter jsonWriter = new JsonWriter();		//Yazma i�lemini yapacak class'a eri�im sa�lamak i�in nesne olu�turur.
		
		jsonWriter.write(StudentListContainer.studentList);		//Yazma metodu �a�r�l�r, parametre olarak Student nesnelerini i�eren static tan�mlanm�� listeyi g�nderir.
		
	}

}
