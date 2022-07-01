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
		
	String jsonKeyName = "students";		//Json dosyasındaki map key'i bir değişkene atanır.
	List<Student> studentList;	
	Map<String, List<Student>> jsonMap;		//Json dosyası türünden bir map oluşturur.
		
	Gson gson = new Gson();		//Json dosyasını okumak için gson kütüphanesi kullanıldı.
		
	Type type = new TypeToken<Map<String, List<Student>>>() {}.getType();		
	jsonMap = gson.fromJson(new FileReader(filePath), type);		//Json dosyası okuma işlemini gerçekleştirir.
		
	studentList = jsonMap.get(jsonKeyName);		//Json dosyasındaki map key'inin value'ları Student listesine atanır.
		
	return studentList;
		
    }
	
}
