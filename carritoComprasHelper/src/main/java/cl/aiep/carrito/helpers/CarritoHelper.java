package cl.aiep.carrito.helpers;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import cl.aiep.carrito.dao.Producto;
import cl.aiep.carrito.dao.ProductoHome;

public class CarritoHelper
{
	final static Logger log = Logger.getLogger(CarritoHelper.class);
	
	private ProductoHome productoDao;
	
	
	
	public void setProductoDao(ProductoHome productoDao)
	{
		this.productoDao = productoDao;
	}



	public List<Producto> listarProductos(){
		List<Producto> listaProductos = new ArrayList<Producto>();
		listaProductos = productoDao.getAllProducts();
		return listaProductos;
	}
}
