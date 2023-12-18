package javaday7;
class InValidAgeException extends RuntimeException
{
	String msg;

	InValidAgeException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}

class User
{
	public void checkEligiblity(int age)
	{
		if(age>=18)
			System.out.println("you are eligible to vote");
		else
			throw new InValidAgeException("age is less, It should be minimum 18");
	}
}



public class USERDEFINEDEXPECTION {

	public static void main(String[] args) {
		User user = new User();
		try
		{
			user.checkEligiblity(3);
		}
		catch (InValidAgeException e) 
		{
			System.out.println("exception occured :"+ e.getMsg());
		}
}
}
