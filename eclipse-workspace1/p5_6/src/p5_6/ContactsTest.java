package p5_6;

import java.util.Scanner;

class Contacts {
	String name;
	String tel;
	static int count;
}

public class ContactsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Contacts[] c = new Contacts[10];
		String name;
		int i = 0;
		System.out.println("연락처 입력(종료 : -1)");
		while(true) {
			c[i] = new Contacts();
			System.out.print("name & tel : ");
			c[i].name = sc.next();
			if(c[i].name.equals("-1"))
				break;
			c[i++].tel = sc.next();
			Contacts.count++;
		}
		System.out.println("number of name = "+Contacts.count);
		System.out.print("searching name : ");
		name = sc.next();
		for(int ii=0; ii<Contacts.count; ii++)
			if(name.equals(c[ii].name))
				System.out.println(name+" : "+c[ii].tel);
	}

}






