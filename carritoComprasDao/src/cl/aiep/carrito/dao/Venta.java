package cl.aiep.carrito.dao;
// Generated 15-08-2017 3:26:33 by Hibernate Tools 5.2.3.Final

/**
 * Venta generated by hbm2java
 */
public class Venta implements java.io.Serializable
{

	private Long id;
	private PedidoProducto pedidoProducto;
	private int idCompra;

	public Venta()
	{
	}

	public Venta(PedidoProducto pedidoProducto, int idCompra)
	{
		this.pedidoProducto = pedidoProducto;
		this.idCompra = idCompra;
	}

	public Long getId()
	{
		return this.id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public PedidoProducto getPedidoProducto()
	{
		return this.pedidoProducto;
	}

	public void setPedidoProducto(PedidoProducto pedidoProducto)
	{
		this.pedidoProducto = pedidoProducto;
	}

	public int getIdCompra()
	{
		return this.idCompra;
	}

	public void setIdCompra(int idCompra)
	{
		this.idCompra = idCompra;
	}

}
