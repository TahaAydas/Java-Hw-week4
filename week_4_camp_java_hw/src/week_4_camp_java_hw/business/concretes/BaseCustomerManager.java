package week_4_camp_java_hw.business.concretes;

import week_4_camp_java_hw.business.abstracts.CustomerService;

import week_4_camp_java_hw.entities.concretes.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	public abstract void Save(Customer customer);

	
}
