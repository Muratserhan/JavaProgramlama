package work4gameProject7;

public class Main {

	public static void main(String[] args) {
	
		CustomerManager customerManager = new CustomerManager();
		Customer bengisu = new Customer("1","Murat","Serhan","12.08");
		customerManager.add(bengisu);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign1 = new Campaign("1234");
		campaignManager.add(campaign1);
		
		GameManager gameManager = new GameManager();
		Game game1 = new Game("game1");
		gameManager.sell(game1, bengisu);
		


	}

}