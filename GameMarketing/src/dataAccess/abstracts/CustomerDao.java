package dataAccess.abstracts;

import entities.concretes.Customer;

public interface CustomerDao {
		public void add(Customer customer);
		public void update(Customer customer);
		public void delete(Customer customer);
}
