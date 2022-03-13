package work4gameProject7;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " isimli müþteri eklendi");

	}

	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " isimli müþteri silindi");

	}

	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " isimli müþteri bilgilerini güncelledi");

	}

}