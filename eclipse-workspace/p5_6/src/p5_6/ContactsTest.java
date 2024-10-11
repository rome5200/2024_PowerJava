package p5_6;

import java.util.Scanner;

class Contacts {
	String name;
	String tel;
	static int count;
	Contacts(String n, String t) {
		name = n;
		tel = t;
	}
	public Contacts() {
		// TODO Auto-generated constructor stub
	}
}

public class ContactsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		String name;
		Scanner sc = new Scanner(System.in);
		Contacts[] c = new Contacts[10];
		System.out.println("연락처 입력(종료 -1");
		while(true) {
			c[i] = new Contacts();
			c[i].name = sc.next();
			if(c[i].name.equals("-1"))
				break;
			c[i++].tel = sc.next();
			++Contacts.count;
		}
		System.out.println("number : "+Contacts.count);
		System.out.print("name : ");
		name = sc.next();
		for(int j=0; j<Contacts.count; j++)
			if(c[j].name.equals(name))
					System.out.println(name+" tel "+c[j].tel);
		
	}

}
