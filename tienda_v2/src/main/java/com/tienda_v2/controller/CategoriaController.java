package com.tienda_v2.controller;

import com.tienda_v2.domain.Categoria;
import com.tienda_v2.service.CategoriaService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/categoria/listado")
    public String inicio(Model model) {
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("categorias", categorias);
        return "/categoria/listado";
    }

    @GetMapping("/categoria/nuevo")
    public String nuevoCategoria(Categoria cliente) {
        return "/categoria/modifica";
    }

    @PostMapping("/categoria/guardar")
    public String guardaCategoria(Categoria cliente) {
        categoriaService.save(cliente);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/categoria/eliminar/{idCategoria}")
    public String eliminaCategoria(Categoria cliente) {
        categoriaService.delete(cliente);
        return "redirect:/categoria/listado";
    }

    @GetMapping("/categoria/modificar/{idCategoria}")
    public String modificarCategoria(Categoria cliente, Model model) {
        cliente = categoriaService.getCategoria(cliente);
        model.addAttribute("cliente", cliente);
        return "/categoria/modifica";
    }

}
