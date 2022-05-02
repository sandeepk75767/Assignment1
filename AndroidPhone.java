package mobileAssignmentInheritance;

public class AndroidPhone extends Mobile{
	
	public void takeVideo()
	{
		System.out.println("This is a AndroidPhone - takeVideo");
	}
	
	
     public static void main(String[] args) {
		
	 AndroidPhone phone = new AndroidPhone();
	 phone.takeVideo();
	 phone.clickMobile();	
		
     }

	}


