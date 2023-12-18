package javaday13java8newfeature;
interface large
{
	String LARgest(int a,int b,int c);
}
public class Lamdaexpressiondemo3 {

	public static void main(String[] args) {

		large lrge = (a,b,c)->
		{
			if(a>b && a>c)
				return a+"is thr larget";
			else if (b>a && b>c)
				return b+"is the largest";
						return c+"is the largest";
		};
		System.out.println(lrge.LARgest(12,45,330));
		
	}

}
