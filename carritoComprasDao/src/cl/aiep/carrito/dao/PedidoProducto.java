package cl.aiep.carrito.dao;
// Generated 15-08-2017 3:26:33 by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * PedidoProducto generated by hbm2java
 */
public class PedidoProducto implements java.io.Serializable
{

	private Long id;
	private EstadoProducto estadoProducto;
	private Producto producto;
	private Usuario usuario;
	private int cantidadPedido;
	private double valorVenta;
	private Set ventas = new HashSet(0);

	public PedidoProducto()
	{
	}

	public PedidoProducto(EstadoProducto estadoProducto, Producto producto, Usuario usuario, int cantidadPedido,
			double valorVenta)
	{
		this.estadoProducto = estadoProducto;
		this.producto = producto;
		this.usuario = usuario;
		this.cantidadPedido = cantidadPedido;
		this.valorVenta = valorVenta;
	}

	public PedidoProducto(EstadoProducto estadoProducto, Producto producto, Usuario usuario, int cantidadPedido,
			double valorVenta, Set ventas)
	{
		this.estadoProducto = estadoProducto;
		this.producto = producto;
		this.usuario = usuario;
		this.cantidadPedido = cantidadPedido;
		this.valorVenta = valorVenta;
		this.ventas = ventas;
	}

	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public EstadoProducto getEstadoProducto()
	{
		return this.estadoProducto;
	}

	public void setEstadoProducto(EstadoProducto estadoProducto)
	{
		this.estadoProducto = estadoProducto;
	}

	public Producto getProducto()
	{
		return this.producto;
	}

	public void setProducto(Producto producto)
	{
		this.producto = producto;
	}

	public Usuario getUsuario()
	{
		return this.usuario;
	}

	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}

	public int getCantidadPedido()
	{
		return this.cantidadPedido;
	}

	public void setCantidadPedido(int cantidadPedido)
	{
		this.cantidadPedido = cantidadPedido;
	}

	public double getValorVenta()
	{
		return this.valorVenta;
	}

	public void setValorVenta(double valorVenta)
	{
		this.valorVenta = valorVenta;
	}

	public Set getVentas()
	{
		return this.ventas;
	}

	public void setVentas(Set ventas)
	{
		this.ventas = ventas;
	}

}
