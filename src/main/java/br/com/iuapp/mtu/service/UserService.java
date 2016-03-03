package br.com.iuapp.mtu.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import br.com.iuapp.mtu.model.User;

public interface UserService {

	void saveUser(User user);

	List<User> listUsers();

	User getUser(Long id);

	void deleteUser(Long id);

}