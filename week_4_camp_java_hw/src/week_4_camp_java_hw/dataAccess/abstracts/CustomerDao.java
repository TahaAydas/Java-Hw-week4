package week_4_camp_java_hw.dataAccess.abstracts;

import week_4_camp_java_hw.entities.concretes.Customer;

public interface CustomerDao {
	void Save(Customer customer);
}
