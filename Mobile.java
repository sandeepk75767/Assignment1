package mobileAssignmentInheritance;



public class Mobile extends MyPhone{
	
	public void clickMobile()
	
	{
	
	System.out.println("This is parent class mobileAssignmentInheritance - clickMobile");
	}

	
		
	public static void main(String[] args) {
	
		 Mobile mobile = new Mobile();
		 mobile.clickMobile();
		 mobile.sendMsg();
		 mobile.saveContact();
		 mobile.makeCall();
	//	 mobile.takeVideo();
		
		
	}
	}


