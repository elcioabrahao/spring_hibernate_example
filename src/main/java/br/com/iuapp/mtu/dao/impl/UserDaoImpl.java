package br.com.iuapp.mtu.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.iuapp.mtu.dao.UserDao;
import br.com.iuapp.mtu.model.User;


@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see br.com.iuapp.mtu.dao.impl.UserDao#saveUser(br.com.iuapp.mtu.model.User)
	 */
	@Override
	public void saveUser(User user) {
		getSession().merge(user);

	}

	/* (non-Javadoc)
	 * @see br.com.iuapp.mtu.dao.impl.UserDao#listUsers()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<User> listUsers() {

		return getSession().createCriteria(User.class).list();
	}

	/* (non-Javadoc)
	 * @see br.com.iuapp.mtu.dao.impl.UserDao#getUser(java.lang.Long)
	 */
	@Override
	public User getUser(Long id) {
		return (User) getSession().get(User.class, id);
	}

	/* (non-Javadoc)
	 * @see br.com.iuapp.mtu.dao.impl.UserDao#deleteUser(java.lang.Long)
	 */
	@Override
	public void deleteUser(Long id) {

		User user = getUser(id);

		if (null != user) {
			getSession().delete(user);
		}

	}

	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
