package api;

import eTrade.business.concretes.MailCheckManager;
import eTrade.business.concretes.UserCheckManager;
import eTrade.business.concretes.UserManager;
import eTrade.dataAccess.concretes.HibernateUserDao;
import eTrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Murat", "Serhan", "muratserhanbingol@gmail.com", "123456");

		User user2 = new User(2, "Cem", "Gündüz", "muratserhanbingol@gmail.com", "123456");

		User user3 = new User(3, "Engin", "Demiroğ", "engin@hotmail.com", "1234");

		UserManager userManager = new UserManager(new UserCheckManager(), new MailCheckManager(),
				new HibernateUserDao());

		userManager.signUp(user1);
		userManager.signUp(user2);
		userManager.signUp(user3);
	}

}