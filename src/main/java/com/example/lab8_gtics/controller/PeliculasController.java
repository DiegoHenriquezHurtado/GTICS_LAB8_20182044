package com.example.lab8_gtics.controller;

import com.example.lab8_gtics.dao.PeliculasDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/pelicula")
public class PeliculasController {
    @Autowired
    PeliculasDao peliculasDao;

    @GetMapping({"/lista"})
    public String listarPeliculas(Model model){
        model.addAttribute("listaPeliculas",peliculasDao.listarPeliculas());
        return "index";
    }


}
