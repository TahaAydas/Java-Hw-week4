package week_4_camp_java_hw.business.concretes;

import week_4_camp_java_hw.dataAccess.abstracts.CustomerDao;
import week_4_camp_java_hw.entities.concretes.Customer;
import week_4_camp_java_hw.mernis.abstracts.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	private CustomerDao customerDao;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService,CustomerDao customerDao) {
		super();
		this.customerCheckService = customerCheckService;
		this.customerDao=customerDao;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if(this.customerCheckService.checkIfRealPerson(customer)) 
		{
			System.out.println("Starbucks kullanicisi kaydediliyor...");
			customerDao.Save(customer);
		}
		else {
			System.out.println("Boyle Bir kisi yok");
		}
		
	}

}
