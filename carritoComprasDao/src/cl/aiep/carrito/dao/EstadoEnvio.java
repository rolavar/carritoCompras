package cl.aiep.carrito.dao;
// Generated 15-08-2017 3:26:33 by Hibernate Tools 5.2.3.Final

/**
 * EstadoEnvio generated by hbm2java
 */
public class EstadoEnvio implements java.io.Serializable
{

	private Integer id;
	private String nombre;

	public EstadoEnvio()
	{
	}

	public EstadoEnvio(String nombre)
	{
		this.nombre = nombre;
	}

	public Integer getId()
	{
		return this.id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

}