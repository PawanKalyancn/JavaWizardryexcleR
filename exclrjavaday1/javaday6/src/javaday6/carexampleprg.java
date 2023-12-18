package javaday6;

class Car
{
int modelNo;
String Color;
int speed;
String brandName;

Car(int modelNo, String Color, int speed, String brandName) //paratemetred constructor
{
this.modelNo=modelNo;
this.Color=Color;
this.speed=speed;
this.brandName=brandName;
}

void accelerate()
{
speed += 5;
}

void brake()
{
speed -= 5;
}

void getSpeed()
{
System.out.println("the current speed is :"+speed);
}
}

public class carexampleprg {

	public static void main(String[] args) {

		Car car = new Car(2022,"red",0,"kia");
		for(int i=0; i<3; i++) {
			car.accelerate();
			}
			car.brake();

			car.getSpeed();
		
	}

}
