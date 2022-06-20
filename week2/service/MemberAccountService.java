package week2.service;

import week2.model.MemberAccount;

public class MemberAccountService {

	public void create(MemberAccount member) {
		System.out.println("Yeni üye oluþturuldu.");
	}
	
    public void read(MemberAccount member) {
		System.out.println("Üye bilgileri görüntüleniyor.");
	}
    
    public void update(MemberAccount member) {
		System.out.println("Üye bilgileri güncellendi.");
	}
    
    public void delete(MemberAccount member) {
		System.out.println("Üye silindi.");
	}
    
}
