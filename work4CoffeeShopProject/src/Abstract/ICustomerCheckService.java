package Abstract;

import Entity.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);

}