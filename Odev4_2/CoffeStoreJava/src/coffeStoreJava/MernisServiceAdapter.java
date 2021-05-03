package coffeStoreJava;


import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
	
	
			
			KPSPublicSoap soapClient = new KPSPublicSoapProxy();
	        boolean result = false;
	          try {
	              result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());
	          } catch (NumberFormatException e) {
	               e.printStackTrace();
	          } catch (RemoteException e) {
	               e.printStackTrace();
	          }
	         return result;
		}
		
	

}
