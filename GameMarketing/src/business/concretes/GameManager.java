package business.concretes;

import business.abstracts.CampaingService;
import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;

public class GameManager implements GameService {

	GameDao gameDao;
	CampaingService campaingService;

	public GameManager(GameDao gameDao, CampaingService campaingService) {
		super();
		this.gameDao = gameDao;
		this.campaingService = campaingService;
	}

	@Override
	public void GameSelling(Campaign campaign, Customer customer, Game game) {
		System.out.println(campaign.getCampaignName() + " kampanyasý uygulandý." + " indirim oraný %"
				+ campaign.getPercentOfCampaign());
		campaingService.applyCampaign(campaign, customer, game);

	}

	@Override
	public void add(Game game) {
		gameDao.add(game);
	}

	@Override
	public void update(Game game) {
		gameDao.update(game);

	}

	@Override
	public void delete(Game game) {
		gameDao.delete(game);

	}

}
