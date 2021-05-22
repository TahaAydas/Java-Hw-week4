package week_4_camp_java_hw.dataAccess.concrete;

import week_4_camp_java_hw.dataAccess.abstracts.CustomerDao;
import week_4_camp_java_hw.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName()+" adli kullanici Kaydedildi.");
	}

}
