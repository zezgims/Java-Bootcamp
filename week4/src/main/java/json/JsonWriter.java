package json;

import java.util.List;

import model.Student;

public class JsonWriter {
	
    public void write(List<Student> studentList) {		
		
	//Liste içerisindeki nesnelerin değerlerini yazdırır. Bu yazdırma işlemi, System.out.println()'ın toString() metodunu çağırmasıyla istenilen formatta gerçekleştirilir.
	studentList.forEach(student -> System.out.println(student));		
		
    }
	
}
