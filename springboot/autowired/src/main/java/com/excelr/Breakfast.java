package com.excelr;

public class Breakfast {

	  String restrauntName; // string type
	  Idly idly2; //  user defined object
	  Dosa dosa; // user defined object
	  
	  
    public void setRestrauntName(String restrauntName) {
		this.restrauntName = restrauntName;
	}

   public void setIdly(Idly idly) {
		this.idly2 = idly;
	}

  public void setDosa(Dosa dosa) {
		this.dosa = dosa;
	}




	public void showBreakfastdetails()
	  {
		  System.out.println("restraunt name :"+restrauntName);
		  idly2.noofIdly();
		  dosa.dosaSize();
	  }
}