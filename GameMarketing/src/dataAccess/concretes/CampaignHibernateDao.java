package dataAccess.concretes;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class CampaignHibernateDao implements CampaignDao{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi.");
		
	}
	
	

}
