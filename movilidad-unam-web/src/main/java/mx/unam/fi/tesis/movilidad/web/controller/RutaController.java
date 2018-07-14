package mx.unam.fi.tesis.movilidad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TODO Clase que permite el manejo de las rutas de los pumab�s.
 */
@Controller
@RequestMapping(value = "/ruta/")
public class RutaController {

	/**
	 * TODO M�todo que permite agregar una ruta(linea) del pumab�s.
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public static String agregar() {
		return "ruta/agregar";
	}

	/**
	 * TODO M�todo que obtiene el listado de las rutas para los pumab�s.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public static String listar() {
		return "ruta/listar";
	}
}
