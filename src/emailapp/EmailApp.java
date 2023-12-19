package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email em1 = new Email("Venkatesh", "Avala");
		em1.setAlternateEmail("jsvdg@.com");
        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
	}

}
