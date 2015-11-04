
public class Cycle {
	public static void main(String [] args){
		Nodea a=new Nodea();a.data=5; 
		Nodea b=new Nodea();b.data=6; 
		Nodea c=new Nodea();c.data=7; 
		Nodea x=new Nodea();x.data=99;
		a.next=b;
		b.next=c;
		c.next=b;
		
		a.next=x;
		b.next=x;
		
		System.out.println(c.next.data);
		
	}
}

class Nodea{
	int data;
	Nodea next;
}
