package com.example.laboratorio2_20180444.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/buscaminas", method = RequestMethod.GET)
public class HomeController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(){
        return  "index";
    }

    @PostMapping("/tablasMinas")
    public String guardarMinas( buscaMinas buscaMinas){
        buscaMinas buscaMinas1 = new buscaMinas();
        return "tablas";
    }

}

