package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import model.Student;

public class JsonReader {
	
	private String filePath;
	
	public JsonReader(String filePath) {
		this.filePath = filePath;
	}
	
	public List<Student> read() throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		
		String jsonKeyName = "students";		//Json dosyas�ndaki map key'i bir de�i�kene atan�r.
		List<Student> studentList;	
		Map<String, List<Student>> jsonMap;		//Json dosyas� t�r�nden bir map olu�turur.
		
		Gson gson = new Gson();		//Json dosyas�n� okumak i�in gson k�t�phanesi kullan�ld�.
		
		Type type = new TypeToken<Map<String, List<Student>>>() {}.getType();		
		jsonMap = gson.fromJson(new FileReader(filePath), type);		//Json dosyas� okuma i�lemini ger�ekle�tirir.
		
		studentList = jsonMap.get(jsonKeyName);		//Json dosyas�ndaki map key'inin value'lar� Student listesine atan�r.
		
		return studentList;
		
	}
	
}
