package Concrete;

import Abstract.ICustomerCheckService;
import Entity.Customer;

public class CustomerCheckManager implements ICustomerCheckService {
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}