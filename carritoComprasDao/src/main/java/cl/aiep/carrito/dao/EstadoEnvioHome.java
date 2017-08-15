package cl.aiep.carrito.dao;
// Generated 15-08-2017 3:28:25 by Hibernate Tools 5.2.3.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class EstadoEnvio.
 * @see cl.aiep.carrito.dao.EstadoEnvio
 * @author Hibernate Tools
 */
public class EstadoEnvioHome
{

	private static final Log log = LogFactory.getLog(EstadoEnvioHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory()
	{
		try
		{
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e)
		{
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(EstadoEnvio transientInstance)
	{
		log.debug("persisting EstadoEnvio instance");
		try
		{
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re)
		{
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(EstadoEnvio instance)
	{
		log.debug("attaching dirty EstadoEnvio instance");
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(EstadoEnvio instance)
	{
		log.debug("attaching clean EstadoEnvio instance");
		try
		{
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re)
		{
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(EstadoEnvio persistentInstance)
	{
		log.debug("deleting EstadoEnvio instance");
		try
		{
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re)
		{
			log.error("delete failed", re);
			throw re;
		}
	}

	public EstadoEnvio merge(EstadoEnvio detachedInstance)
	{
		log.debug("merging EstadoEnvio instance");
		try
		{
			EstadoEnvio result = (EstadoEnvio) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public EstadoEnvio findById(java.lang.Integer id)
	{
		log.debug("getting EstadoEnvio instance with id: " + id);
		try
		{
			EstadoEnvio instance = (EstadoEnvio) sessionFactory.getCurrentSession()
					.get("cl.aiep.carrito.dao.EstadoEnvio", id);
			if (instance == null)
			{
				log.debug("get successful, no instance found");
			} else
			{
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re)
		{
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(EstadoEnvio instance)
	{
		log.debug("finding EstadoEnvio instance by example");
		try
		{
			List results = sessionFactory.getCurrentSession().createCriteria("cl.aiep.carrito.dao.EstadoEnvio")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
}
