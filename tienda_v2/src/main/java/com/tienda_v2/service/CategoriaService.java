package com.tienda_v2.service;

import com.tienda_v2.domain.Categoria;
import java.util.List;

public interface CategoriaService {

    //Se recupera una lista con todos los registros de la tabla cliente
    public List<Categoria> getCategorias(boolean activos);

    public void save(Categoria cliente);

    public void delete(Categoria cliente);

    public Categoria getCategoria(Categoria cliente);

}
