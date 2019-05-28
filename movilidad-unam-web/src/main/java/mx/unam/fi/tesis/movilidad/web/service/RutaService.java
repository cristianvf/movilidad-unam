package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definicion de las funciones para el servicio de rutas.
 */
public interface RutaService {

  /**
   * Servicio para guardar una ruta
   * @param ruta Contiene la informaci�n del formulario.
   */
  void guardarRuta(Ruta ruta);

  /**
   * Servicio que obtiene las rutas para la aplicaci�n.
   * @return
   */
  List<Ruta> getListadoRutas();

  /**
   * Servicio que obtiene la geometr�a de la ruta.
   * @param rutaId
   * @return geometr�a
   */
  String getRuta(Long rutaId);
}
