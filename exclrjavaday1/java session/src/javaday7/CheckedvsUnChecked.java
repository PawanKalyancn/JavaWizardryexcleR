package javaday7;

import java.io.IOException;

class honey{
	

	private int numbero;

	public honey(int numbero) {
		this.numbero =numbero;
	
	}

	public int getNumbero() {
		return numbero;
	}

	public void setNumbero(int numbero) {
		this.numbero = numbero;
	}
}

public class CheckedvsUnChecked {

	public static void main(String[] args) throws IOException {
		System.out.println("some error");
	//throw new ArithmeticException("expcetion occuered");
	throw new IOException();
	
	}

}
