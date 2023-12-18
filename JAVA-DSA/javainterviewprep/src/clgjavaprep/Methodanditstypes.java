package clgjavaprep;

public class Methodanditstypes {

	//2 types paremteric mentod and non paramertic method
	//or args methid and no args method
	
	//with static keyword we can call it directky in static
	//for other we hav to creatr obj
	
	//overrididing is getting connection betwen two class and two class must hav the same method with each other
	
	
	public static void hai() {//no args menthods
		System.out.println("this hai method");
	}
	
	void hello() {
		System.out.println("this is hello method ");
	}
	
	public static void add(int a ,int b) {//args methods
		int c=a=b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		hai();	
		add(5,6);
		
		Methodanditstypes mad = new Methodanditstypes();//without static keyword we hav to cretae the object
		mad.hello();
		
	}

}
