
public class Main {

	public static void main(String[] args) {

		Credit[] credits = { new CarCredit(), new NeedCredit(), new OfficerCredit() };
		
		Customer customer=new Customer(1,"Murat");
		
		CustomerManager customerManager=new CustomerManager(customer, credits);
		customerManager.add(2, 50000);

	}

}
