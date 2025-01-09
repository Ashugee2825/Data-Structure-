package list;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Linkedlist l=new Linkedlist();
l.createlist(5);
l.display();
System.out.println("no of nodes present in list "+l.size());
l.addlast(100);
l.display();
System.out.println("no of nodes present in list "+l.size());
l.addbeg(5);
l.display();
System.out.println("no of nodes present in list "+l.size());
l.addbetween(35,3);
l.display();
System.out.println("no of nodes present in list "+l.size());
	}

}
