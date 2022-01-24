package business.concretes;

import business.abstracts.CampaingService;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;

public class CampaignManager implements CampaingService{

	
	CampaignDao campaignDao;
	
	
	
	
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public double applyCampaign(Campaign campaign, Customer customer,Game game) {
		System.out.println("Oyun g�ncel fiyat�: " + game.getPrice());
		double percent = 100-campaign.getPercentOfCampaign();
		System.out.println(customer.getFirstName() + " taraf�ndan sat�n al�nd�.");
		double result = game.getPrice()*percent/100;
		System.out.println("Al�nan oyunun indirimli fiyat�: " + result);
		return result;
	}

	@Override
	public void add(Campaign campaign) {
		campaignDao.add(campaign);
		
	}

	@Override
	public void update(Campaign campaign) {
		campaignDao.update(campaign);
		
	}

	@Override
	public void delete(Campaign campaign) {
		campaignDao.delete(campaign);
		
	}

}
