package business.abstracts;

import eTrade.entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);
	boolean checkLastname(User user);
	boolean checkEmail(User user);
	boolean checkPassword(User user);
	
