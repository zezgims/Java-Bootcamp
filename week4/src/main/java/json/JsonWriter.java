package json;

import java.util.List;

import model.Student;

public class JsonWriter {
	
	public void write(List<Student> studentList) {		
		
		//Liste içerisindeki nesnelerin deðerlerini yazdýrýr. Bu yazdýrma iþlemi, System.out.println()'ýn toString() metodunu çaðýrmasýyla istenilen formatta gerçekleþtirilir.
		studentList.forEach(student -> System.out.println(student));		
		
	}
	
}
