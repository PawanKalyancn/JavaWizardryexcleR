package oopsdemo;

public class inhertanceclass2  extends Inhertanceclass1{
//public class inhertanceclass2 {

static int c=3;
	int d=4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Inhertanceclass1.a);

System.out.println(c);
	
	Inhertanceclass1 ic1 = new Inhertanceclass1();
	System.out.println(ic1.b);
	
	System.out.println(a);
	inhertanceclass2 ic2 = new inhertanceclass2();
	System.out.println(ic2.d);
	}

}
