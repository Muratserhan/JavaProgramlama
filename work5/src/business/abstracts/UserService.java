package business.abstracts;

import eTrade.entities.concretes.User;

public interface UserService {
	void signUp(User user);

	void singIn(User user);
}