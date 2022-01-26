package entities.concretes;

import java.util.List;

public class Sale {

	private int id;
	private Game game;
	private Customer customer;
	private Campaign campaign;
	private double salePrice;

	public Sale() {
		super();
	}

	public Sale(int id, Game game, Customer customer, Campaign campaign, double salePrice) {
		super();
		this.id = id;
		this.game = game;
		this.customer = customer;
		this.campaign = campaign;
		this.salePrice = salePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGames() {
		return game;
	}

	public void setGames(Game game) {
		this.game = game;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

}
