package javaday13java8newfeature;
interface vote
{
	String checkEligibility (int age);
}
public class task1lamdavote {

	public static void main(String[] args) {

	vote voter =(age)->
	{
		if (age >18)
			return "ur eligble";
			else
				return "ur not eligble";
	};
	System.out.println(voter.checkEligibility(46));
	}
	
}
