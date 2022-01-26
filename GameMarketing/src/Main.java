

import business.abstracts.CampaingService;
import business.abstracts.CustomerService;
import business.abstracts.GameService;
import business.abstracts.SaleService;
import business.concretes.CampaignManager;
import business.concretes.CustomerManager;
import business.concretes.GameManager;
import business.concretes.SaleManager;
import core.adapters.concretes.MernisAdapterManager;
import dataAccess.concretes.CampaignHibernateDao;
import dataAccess.concretes.CustomerHibernateDao;
import dataAccess.concretes.GameHibernateDao;
import dataAccess.concretes.SaleHibernateDao;
import entities.concretes.Campaign;
import entities.concretes.Customer;
import entities.concretes.Game;
import entities.concretes.Sale;

public class Main {

	public static void main(String[] args) {
		
		Campaign campaign = new Campaign(1,"yeni üye",10);
		Game game = new Game(1,"Call of Duty",450,"Güzel oyun");
		Customer customer = new Customer(1,"fatih@gmail.com","parola123", "23176321", "fatih", "cakir" ,1995);
		Sale sale = new Sale();
		
		CustomerService customerService = new CustomerManager(new CustomerHibernateDao(), new MernisAdapterManager());
		
		customerService.add(customer);
		
		CampaingService campaingService = new CampaignManager(new CampaignHibernateDao());
		
		campaingService.add(campaign);
		
		GameService gameService = new GameManager(new GameHibernateDao(), campaingService);
		
		gameService.add(game);
		
		SaleService saleService = new SaleManager(new SaleHibernateDao(), campaingService);
		
		saleService.add(campaign, customer, game, sale);
		
		
			
			

	

}
}
