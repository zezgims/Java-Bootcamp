package week2.model;

public class MemberAccount {

	private String name;
	private String surname;
	private int id;
	private String code;
	private double balance;
	private String phoneNumber;
	private String memberCode;		
	
	public MemberAccount(String name, String surname, int id, String code, double balance, String phoneNumber) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.code = code;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
		this.memberCode = id+name.substring(0,2);		//id + name'in ilk 2 harfinden oluþan code atamasýný yapar.	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public int getId( ) {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber  = phoneNumber;
	}
	
	public String getMemberCode() {
		return memberCode;
	}
	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}
	
}
