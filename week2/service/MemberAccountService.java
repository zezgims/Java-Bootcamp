package week2.service;

import week2.model.MemberAccount;

public class MemberAccountService {

	public void create(MemberAccount member) {
		System.out.println("Yeni �ye olu�turuldu.");
	}
	
    public void read(MemberAccount member) {
		System.out.println("�ye bilgileri g�r�nt�leniyor.");
	}
    
    public void update(MemberAccount member) {
		System.out.println("�ye bilgileri g�ncellendi.");
	}
    
    public void delete(MemberAccount member) {
		System.out.println("�ye silindi.");
	}
    
}
