package thread;

import json.JsonWriter;
import model.StudentListContainer;

public class WriterThread implements Runnable {		//Runnable @FunctionInterface implement edilerek thread class'ı oluşturur.
	
    @Override
    public void run() {		//Runnable'a ait metot.
		
	JsonWriter jsonWriter = new JsonWriter();		//Yazma işlemini yapacak class'a erişim sağlamak için nesne oluşturur.
		
	jsonWriter.write(StudentListContainer.studentList);		//Yazma metodu çağrılır, parametre olarak Student nesnelerini içeren static tanımlanmış listeyi gönderir.
		
    }

}
