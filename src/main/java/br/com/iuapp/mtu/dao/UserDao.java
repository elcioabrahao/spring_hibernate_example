package br.com.iuapp.mtu.dao;

import java.util.List;

import br.com.iuapp.mtu.model.User;

public interface UserDao {

	void saveUser(User user);

	List<User> listUsers();

	User getUser(Long id);

	void deleteUser(Long id);

}