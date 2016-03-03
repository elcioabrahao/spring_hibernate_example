package br.com.iuapp.mtu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.iuapp.mtu.dao.UserDao;
import br.com.iuapp.mtu.model.User;
import br.com.iuapp.mtu.service.UserService;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/* (non-Javadoc)
	 * @see br.com.iuapp.mtu.service.impl.UserService#saveUser(br.com.iuapp.mtu.model.User)
	 */
	@Override
	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	/* (non-Javadoc)
	 * @see br.com.iuapp.mtu.service.impl.UserService#listUsers()
	 */
	@Override
	@Transactional(readOnly = true)
	public List<User> listUsers() {
		return userDao.listUsers();
	}

	/* (non-Javadoc)
	 * @see br.com.iuapp.mtu.service.impl.UserService#getUser(java.lang.Long)
	 */
	@Override
	@Transactional(readOnly = true)
	public User getUser(Long id) {
		return userDao.getUser(id);
	}

	/* (non-Javadoc)
	 * @see br.com.iuapp.mtu.service.impl.UserService#deleteUser(java.lang.Long)
	 */
	@Override
	@Transactional
	public void deleteUser(Long id) {
		userDao.deleteUser(id);

	}
	
}
