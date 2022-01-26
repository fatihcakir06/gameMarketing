package dataAccess.concretes;

import dataAccess.abstracts.SaleDao;

import entities.concretes.Sale;

public class SaleHibernateDao implements SaleDao{

	@Override
	public void add(Sale sale) {
		System.out.println("Sat�� i�lemi veritabanina eklendi.");
		
	}

	@Override
	public void update(Sale sale) {
		System.out.println("Sat�� i�lemi veritabanina g�ncellendi.");
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("Sat�� i�lemi veritabanindan silindi.");
		
	}
	
	
}
