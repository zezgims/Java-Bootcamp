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
			Scanner scanner = new Scanner(System.in);		//Metoda gönderilecek verileri kullanýcýdan alýr ve events listesine atar.
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
		
		studentsList = priorities.getStudents(events);		//Kullanýcýdan alýnan deðerler ile oluþturulan listeyi koþulun gerçekleþtirileceði metoda gönderir.
		
		if(studentsList.isEmpty()) {		//Metodun geri döndürdüðü listenin boþ mu dolu mu olduðunu kontrol eder.
			System.out.println("EMPTY");
		}
		else {		//Liste dolu ise studentList'deki öðrencilerin isimlerini yazdýrýr.
			studentsList.forEach(student -> System.out.println(student.getName()));
		}
		
	}

}
