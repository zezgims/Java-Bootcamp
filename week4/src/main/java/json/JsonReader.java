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
		
		String jsonKeyName = "students";		//Json dosyasýndaki map key'i bir deðiþkene atanýr.
		List<Student> studentList;	
		Map<String, List<Student>> jsonMap;		//Json dosyasý türünden bir map oluþturur.
		
		Gson gson = new Gson();		//Json dosyasýný okumak için gson kütüphanesi kullanýldý.
		
		Type type = new TypeToken<Map<String, List<Student>>>() {}.getType();		
		jsonMap = gson.fromJson(new FileReader(filePath), type);		//Json dosyasý okuma iþlemini gerçekleþtirir.
		
		studentList = jsonMap.get(jsonKeyName);		//Json dosyasýndaki map key'inin value'larý Student listesine atanýr.
		
		return studentList;
		
	}
	
}
