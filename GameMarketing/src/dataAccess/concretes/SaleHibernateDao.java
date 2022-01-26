package dataAccess.concretes;

import dataAccess.abstracts.SaleDao;

import entities.concretes.Sale;

public class SaleHibernateDao implements SaleDao{

	@Override
	public void add(Sale sale) {
		System.out.println("Satýþ iþlemi veritabanina eklendi.");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println("Satýþ iþlemi veritabanina güncellendi.");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("Satýþ iþlemi veritabanindan silindi.");
		
	}
	
	
}
