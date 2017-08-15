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
 * Home object for domain model class Producto.
 * @see cl.aiep.carrito.dao.Producto
 * @author Hibernate Tools
 */
public class ProductoHome
{
	
	public ProductoHome(){}

	private static final Log log = LogFactory.getLog(ProductoHome.class);
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;

	}

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

	public void persist(Producto transientInstance)
	{
		log.debug("persisting Producto instance");
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

	public void attachDirty(Producto instance)
	{
		log.debug("attaching dirty Producto instance");
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

	public void attachClean(Producto instance)
	{
		log.debug("attaching clean Producto instance");
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

	public void delete(Producto persistentInstance)
	{
		log.debug("deleting Producto instance");
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

	public Producto merge(Producto detachedInstance)
	{
		log.debug("merging Producto instance");
		try
		{
			Producto result = (Producto) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re)
		{
			log.error("merge failed", re);
			throw re;
		}
	}

	public Producto findById(java.lang.Long id)
	{
		log.debug("getting Producto instance with id: " + id);
		try
		{
			Producto instance = (Producto) sessionFactory.getCurrentSession().get("cl.aiep.carrito.dao.Producto", id);
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

	public List findByExample(Producto instance)
	{
		log.debug("finding Producto instance by example");
		try
		{
			List results = sessionFactory.getCurrentSession().createCriteria("cl.aiep.carrito.dao.Producto")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re)
		{
			log.error("find by example failed", re);
			throw re;
		}
	}
	
	public List getAllProducts(){
		log.debug("finding Producto instance by example");
		try
		{
			List results = sessionFactory.openSession().createSQLQuery("select * from producto").list();
			log.debug("all products got it, result size: " + results.size());
			
			return results;
		} catch (RuntimeException re)
		{
			log.error("getAllProducts failed", re);
			throw re;
		}
	}
}
