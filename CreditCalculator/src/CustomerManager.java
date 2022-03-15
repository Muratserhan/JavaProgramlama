
public class CustomerManager {

	private Customer customer;
	private Credit[] credits;

	public CustomerManager(Customer customer, Credit[] credits) {
		super();
		this.customer = customer;
		this.credits = credits;
	}

	public void add(int year, double price) {

		if (credits.length == 0) {
			System.out.println("Sayýn " + customer.getName() + ": lütfen en az bir kredi türü girin.");
			return;
		}

		for (Credit creditt : credits) {
			creditt.calculate(year, price);
		}

	}

}
