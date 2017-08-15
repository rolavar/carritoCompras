package cl.carritocompras.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.aie.carrito.utils.RespuestaDto;
import cl.aiep.carrito.dao.Producto;
import cl.aiep.carrito.helpers.CarritoHelper;
import cl.carritocompras.BaseController;
import cl.carritocompras.utils.Utils;
@Controller
@RequestMapping("carrito")
public class Carrito extends BaseController
{

	private static final Logger log = LoggerFactory.getLogger(Carrito.class);
	@Autowired
	private CarritoHelper carritoHelper;
	
	@RequestMapping(value="/productos",method = RequestMethod.GET)
	public String listarProductos(Model model){
		List<Producto> listaProductos = carritoHelper.listarProductos();
		RespuestaDto respuesta = new RespuestaDto();
		try{
			respuesta.setCodigo(Utils.Codigos.OK);
			respuesta.setMessage(Utils.Mensajes.OK);
			model.addAttribute("respuesta",mapper.writeValueAsString(listaProductos));
			
		}catch(Exception ex){
			log.error("error en listar productos ",ex);
		}
		
		return "home";
	}
}
