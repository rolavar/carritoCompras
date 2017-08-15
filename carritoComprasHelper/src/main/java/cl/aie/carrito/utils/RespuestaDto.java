package cl.aie.carrito.utils;

import java.util.List;

public class RespuestaDto {
	
	private String codigo;
	private String message;
	private List list;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List getList()
	{
		return list;
	}
	public void setList(List list)
	{
		this.list = list;
	}
	
	
	
	

}
