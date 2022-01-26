package business.concretes;


import business.abstracts.CampaingService;
import business.abstracts.SaleService;
import dataAccess.abstracts.SaleDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;
import entities.concretes.Sale;

public class SaleManager implements SaleService {

	SaleDao saleDao;
	CampaingService campaignService;

	public SaleManager(SaleDao saleDao, CampaingService campaignService) {
		super();
		this.saleDao = saleDao;
		this.campaignService = campaignService;
	}

	@Override
	public void add(Campaign campaign, Customer customer, Game game,Sale sale) {
		System.out.println(campaign.getCampaignName() + " kampanyasý uygulandý." + " indirim oraný %"
				+ campaign.getPercentOfCampaign());
		campaignService.applyCampaign(campaign, customer, game);
		sale.setGames(game);
		sale.setCustomer(customer);
		sale.setCampaign(campaign);
		saleDao.add(sale);

	}

}
