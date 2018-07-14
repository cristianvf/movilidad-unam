package mx.unam.fi.tesis.movilidad.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.fi.tesis.movilidad.web.service.EstacionService;

/**
 * TODO Clase que permite el manejo de los datos para las estaciones.
 */
@Controller
@RequestMapping("/estacion/")
public class EstacionController {

	EstacionService estacionService;

	/**
	 * TODO M�todo que permite agregar una estaci�n.
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public static String agregar() {
		return "estacion/agregar";
	}

	/**
	 * TODO M�todo que obtiene el listado de las estaciones.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public static String listar() {
		return "estacion/listar";
	}
}
