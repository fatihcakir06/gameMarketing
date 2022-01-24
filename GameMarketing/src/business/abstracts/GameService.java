package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;

public interface GameService {
	public void GameSelling(Campaign campaign, Customer customer,Game game);
	
	public void add(Game game);

	public void update(Game game);

	public void delete(Game game);
}
