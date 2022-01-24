package dataAccess.abstracts;

import entities.concretes.Campaign;

public interface CampaignDao {
	public void add(Campaign campaign);

	public void update(Campaign campaign);

	public void delete(Campaign campaign);
}
