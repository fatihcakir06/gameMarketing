package dataAccess.concretes;

import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class GameHibernateDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println("oyun hibernate ile veritabanýna eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun hibernate ile veritabanýnda güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun hibernate ile veritabanýndan silindi.");
		
	}

}
