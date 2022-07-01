package json;

import java.util.List;

import model.Student;

public class JsonWriter {
	
	public void write(List<Student> studentList) {		
		
		//Liste i�erisindeki nesnelerin de�erlerini yazd�r�r. Bu yazd�rma i�lemi, System.out.println()'�n toString() metodunu �a��rmas�yla istenilen formatta ger�ekle�tirilir.
		studentList.forEach(student -> System.out.println(student));		
		
	}
	
}
