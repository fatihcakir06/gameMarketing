package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;

public interface CampaingService {

	public double applyCampaign(Campaign campaign, Customer customer, Game game);

	public void add(Campaign campaign);

	public void update(Campaign campaign);

	public void delete(Campaign campaign);

}
