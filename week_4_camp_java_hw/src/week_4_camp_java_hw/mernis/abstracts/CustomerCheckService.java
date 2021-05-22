package week_4_camp_java_hw.mernis.abstracts;

import week_4_camp_java_hw.entities.concretes.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
