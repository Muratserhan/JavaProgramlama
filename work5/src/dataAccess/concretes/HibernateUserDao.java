package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTrade.dataAccess.abstracts.UserDao;
import eTrade.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " Kullanicisi hibernate  ile eklendi");

	}

	@Override
	public void update(User user) {
		users.set(1, user);
		System.out.println(user.getFirstName() + " Kullanicisi hibernate güncellendi");

	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(user.getFirstName() + " Kullanicisi hibernate  ile silindi");

	}

	@Override
	public boolean getEmail(String email) {
		for (User user : users) {
			if (user.geteMail() == email) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for (User user : users) {
			if (user.getPassword() == password) {
				return true;
			}
		}
		return false;

	}

	@Override
	public List<User> getAll() {

		return users;
	}

}