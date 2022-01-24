package dataAccess.concretes;

import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class GameHibernateDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println("oyun hibernate ile veritabanına eklendi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun hibernate ile veritabanında güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun hibernate ile veritabanından silindi.");
		
	}

}
