package week_4_camp_java_hw;



import java.time.LocalDate;

import week_4_camp_java_hw.business.concretes.BaseCustomerManager;
import week_4_camp_java_hw.business.concretes.StarbucksCustomerManager;
import week_4_camp_java_hw.dataAccess.concrete.HibernateCustomerDao;
import week_4_camp_java_hw.entities.concretes.Customer;
import week_4_camp_java_hw.mernis.concretes.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customermanager=new StarbucksCustomerManager(new MernisServiceAdapter(),new HibernateCustomerDao());
		customermanager.Save(new Customer(0,"Taha","Aydas",LocalDate.of(2015,10,25),"123456789"));
	}

}
