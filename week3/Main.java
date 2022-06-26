package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Priorities priorities = new Priorities();
		
		int totalEvents;
		List<String> events = new ArrayList<String>();
		List<Student> studentsList;
		
		try {
			Scanner scanner = new Scanner(System.in);		//Metoda g�nderilecek verileri kullan�c�dan al�r ve events listesine atar.
			totalEvents = Integer.parseInt(scanner.nextLine()); 
			for(int i=0; i<totalEvents; i++) {
				String event;
				event = scanner.nextLine();
				events.add(event);
			}
			scanner.close();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		studentsList = priorities.getStudents(events);		//Kullan�c�dan al�nan de�erler ile olu�turulan listeyi ko�ulun ger�ekle�tirilece�i metoda g�nderir.
		
		if(studentsList.isEmpty()) {		//Metodun geri d�nd�rd��� listenin bo� mu dolu mu oldu�unu kontrol eder.
			System.out.println("EMPTY");
		}
		else {		//Liste dolu ise studentList'deki ��rencilerin isimlerini yazd�r�r.
			studentsList.forEach(student -> System.out.println(student.getName()));
		}
		
	}

}
