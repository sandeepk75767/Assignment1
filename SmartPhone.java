package mobileAssignmentInheritance;

public class SmartPhone extends AndroidPhone{
	
	public void connectWhatsApp()
	{
		System.out.println("This is a SmartPhone - connectWhatsApp");
	}

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.connectWhatsApp();
		smartPhone.takeVideo();

	}

}
