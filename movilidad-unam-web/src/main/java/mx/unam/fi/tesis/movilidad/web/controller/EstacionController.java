package mx.unam.fi.tesis.movilidad.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.service.EstacionService;

/**
 * Clase que permite el manejo de los datos para las estaciones.
 */
@Controller
@RequestMapping("/estacion/")
public class EstacionController {
	private static final Logger log = LoggerFactory.getLogger(EstacionController.class);

	@Resource
	private EstacionService estacionService;

	/**
	 * M�todo que permite agregar una estaci�n.
	 * @return
	 */
	@RequestMapping(value = "agregar", method = RequestMethod.GET)
	public String agregar() {
		return "estacion/agregar";
	}

	/**
	 * M�todo que obtiene el listado de las estaciones.
	 * @return
	 */
	@RequestMapping(value = "listar", method = RequestMethod.GET)
	public String listar(ModelMap modelMapp) {
		Integer a = new Integer(estacionService.obtenTotalEstaciones());
		List<Estacion> estaciones = estacionService.listadoEstaciones();
		modelMapp.addAttribute("mensaje", a);
		modelMapp.addAttribute("estaciones", estaciones);

		return "estacion/listar";
	}
}
