package com.tienda_v2.controller;

import com.tienda_v2.domain.Articulo;
import com.tienda_v2.service.ArticuloService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    @GetMapping("/articulo/listado")
    public String inicio(Model model) {
        var articulos = articuloService.getArticulos(false);
        model.addAttribute("articulos", articulos);
        return "/articulo/listado";
    }

    @GetMapping("/articulo/nuevo")
    public String nuevoArticulo(Articulo cliente) {
        return "/articulo/modifica";
    }

    @PostMapping("/articulo/guardar")
    public String guardaArticulo(Articulo cliente) {
        articuloService.save(cliente);
        return "redirect:/articulo/listado";
    }

    @GetMapping("/articulo/eliminar/{idArticulo}")
    public String eliminaArticulo(Articulo cliente) {
        articuloService.delete(cliente);
        return "redirect:/articulo/listado";
    }

    @GetMapping("/articulo/modificar/{idArticulo}")
    public String modificarArticulo(Articulo cliente, Model model) {
        cliente = articuloService.getArticulo(cliente);
        model.addAttribute("cliente", cliente);
        return "/articulo/modifica";
    }

}
