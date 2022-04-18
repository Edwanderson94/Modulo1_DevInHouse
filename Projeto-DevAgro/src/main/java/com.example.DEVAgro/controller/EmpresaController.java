package com.example.DEVAgro.controller;

import com.example.DEVAgro.model.Dtos.EmpresaDto;
import com.example.DEVAgro.model.Empresa;
import com.example.DEVAgro.repository.EmpresaRepository;
import com.example.DEVAgro.service.EmpresaService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
//@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/DEVAgro/empresas")
public class EmpresaController {

    final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCadEMpresa(@RequestBody @Valid EmpresaDto empresaDto) {
        var empresa = new Empresa();
        BeanUtils.copyProperties(empresaDto, empresa);
        //empresa.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(empresaService.save(empresa));



    }
}
