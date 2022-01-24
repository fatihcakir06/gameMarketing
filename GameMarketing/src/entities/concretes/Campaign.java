package entities.concretes;

import entities.abstracts.Entity;

public class Campaign implements Entity {

	private int id;
	private String campaignName;
	private int percentOfCampaign;

	public Campaign() {
		super();
	}

	public Campaign(int id, String campaignName, int percentOfCampaign) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.percentOfCampaign = percentOfCampaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getPercentOfCampaign() {
		return percentOfCampaign;
	}

	public void setPercentOfCampaign(int percentOfCampaign) {
		this.percentOfCampaign = percentOfCampaign;
	}

}
