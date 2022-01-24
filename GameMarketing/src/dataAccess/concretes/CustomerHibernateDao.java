package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerHibernateDao implements CustomerDao{

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getEmail() + "e-postas� sisteme kaydedildi.");
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getEmail() + "e-postas� g�ncellendi.");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getEmail() + "e-postas� sistemden silindi.");
		
	}

}
