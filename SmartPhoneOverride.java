package methodOverridingAssignment;

public class SmartPhoneOverride extends AndroidPhone {

	
			
			   //Overriding method
			   public void takeVideo() {
			   
			      System.out.println("This is smartPhone");
			   }
		
	     public static void main(String[] args) {
			
	    	 SmartPhoneOverride phone = new SmartPhoneOverride();
		     phone.takeVideo();
	}

}
