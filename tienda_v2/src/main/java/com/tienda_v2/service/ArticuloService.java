package com.tienda_v2.service;

import com.tienda_v2.domain.Articulo;
import java.util.List;

public interface ArticuloService {

    //Se recupera una lista con todos los registros de la tabla cliente
    public List<Articulo> getArticulos(boolean activos);

    public void save(Articulo cliente);

    public void delete(Articulo cliente);

    public Articulo getArticulo(Articulo cliente);

}
