package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.WS.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckService {
	public boolean result;

	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		try {
			return result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
					customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}
}