package mx.unam.fi.tesis.movilidad.dao;

import java.util.List;

import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Definici�n de las funciones que interactuan con la BD.
 */
public interface RutaDAO {

  /**
   * Funci�n para guardar una ruta.
   * @param ruta Informaci�n de la ruta a guardar.
   */
  void guardarRuta(Ruta ruta);

  /**
   * Funci�n para obtener las rutas a mostrar en la aplicaci�n
   * @return
   */
  List<Ruta> getListadoRutas();

  /**
   * Funci�n que obtiene la geometria de una ruta.
   * @param rutaId
   * @return
   */
  String getRuta(Long rutaId);

}
