package work4gameProject7;

public class CampaignManager {
	public void add(Campaign campaign) {
		System.out.println(campaign.getId() + " id'li kampanya eklendi");

	}

	public void delete(Campaign campaign) {
		System.out.println(campaign.getId() + " id'li kampanya silindi");

	}

	public void update(Campaign campaign) {
		System.out.println(campaign.getId() + " id'li kampanya güncellendi");

	}

}