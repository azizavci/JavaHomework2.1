package coffeStoreJava;


public class Main {

	public static void main(String[] args) {


		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(new Customer(1,"aziz","avcý",1994,"1234567890"));
		

	}

}
