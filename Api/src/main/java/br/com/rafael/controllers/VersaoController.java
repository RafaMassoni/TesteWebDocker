package br.com.rafael.controllers;


import br.com.rafael.models.Versao;
import br.com.rafael.service.VersaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/versao")
@CrossOrigin(origins = "*")
public class VersaoController {

    @Autowired
    private VersaoService versaoService;

    @GetMapping
    public ResponseEntity<?> gerVersao()
    {

        Versao versao = versaoService.buscarVersao();

        return ResponseEntity.ok("Nosso aplicativo se encontra na versão " + versao.getVersaoCompleta());
    }

}
