package business.abstracts;

import java.util.List;

import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;
import entities.concretes.Sale;

public interface SaleService {
	public void add(Campaign campaign, Customer customer,Game game,Sale sale);
}
