package week2.model;

import java.time.LocalDate;

public class Response {
	
	private String code;
	private String date;
	
	public Response() {
		this.code = "";
    }
	
	public Response(String code) {
        this.code = code;
        this.date = LocalDate.now().toString();
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    
}
