package dataAccess.abstracts;

import java.util.List;

import eTrade.entities.concretes.User;

public interface UserDao {

	void add(User user);

	void update(User user);

	void delete(User user);

	boolean getEmail(String email);

	boolean getPassword(String email);

	List<User> getAll();
}