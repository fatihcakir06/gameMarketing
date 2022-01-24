package business.concretes;

import business.abstracts.CustomerService;
import core.adapters.abstracts.MernisAdapterService;
import dataAccess.abstracts.CustomerDao;
import entities.concretes.Customer;

public class CustomerManager implements CustomerService{

	
	CustomerDao customerDao;
	MernisAdapterService mernisAdapterService;
	
	
	
	
	public CustomerManager(CustomerDao customerDao,MernisAdapterService mernisAdapterService) {
		super();
		this.customerDao = customerDao;
		this.mernisAdapterService = mernisAdapterService;
	}

	@Override
	public void add(Customer customer) {
		if (mernisAdapterService.ifCheckRealPerson(customer) &&    customer.getEmail()!=null) {
			customerDao.add(customer);
		}
		
	}

	@Override
	public void update(Customer customer) {
		
		if (mernisAdapterService.ifCheckRealPerson(customer) &&    customer.getEmail()!=null) {
			customerDao.update(customer);
		}
	}

	@Override
	public void delete(Customer customer) {
		
		if (customer.getEmail()!=null) {
			customerDao.delete(customer);
		}
	}

	
	
}
