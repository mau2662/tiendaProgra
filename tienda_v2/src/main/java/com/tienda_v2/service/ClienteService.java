package com.tienda_v2.service;

import com.tienda_v2.domain.Cliente;
import java.util.List;

public interface ClienteService {

    //Se recupera una lista con todos los registros de la tabla cliente
    public List<Cliente> getClientes();

    public void save(Cliente cliente);

    public void delete(Cliente cliente);

    public Cliente getCliente(Cliente cliente);

}
