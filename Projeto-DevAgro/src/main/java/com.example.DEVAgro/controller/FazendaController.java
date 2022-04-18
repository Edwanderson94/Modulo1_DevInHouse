package com.example.DEVAgro.controller;

import com.example.DEVAgro.service.FazendaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/fazenda")
public class FazendaController {

    final FazendaService fazendaService;
    public FazendaController(FazendaService fazendaService) {
        this.fazendaService = fazendaService;
    }

}
