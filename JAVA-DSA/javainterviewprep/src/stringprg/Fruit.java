package stringprg;


/*
 * 
 * 1)Create a base class Fruit which has name ,
 *taste as its attributes. A method called eat() 
 *is created which describes the name of the fruit
 *and its taste. Inherit the same in 2 other class
 *Apple and Orange and override the eat() method 
 *to represent each fruit taste.
 */
public class Fruit {
	    String name;
	    String taste;

	    public void eat() {
	        System.out.println("Fruit: " + name + " tastes " + taste);
	    }
	}

	class Apple extends Fruit {
	    Apple(String name, String taste) {
	        this.name = name;
	        this.taste = taste;
	    }

	    @Override
	    public void eat() {
	        System.out.println("Apple: " + name + " tastes " + taste);
	    }
	}

	class Orange extends Fruit {
	    Orange(String name, String taste) {
	        this.name = name;
	        this.taste = taste;
	    }

	    @Override
	    public void eat() {
	        System.out.println("Orange: " + name + " tastes " + taste);
	    }
	}

	
