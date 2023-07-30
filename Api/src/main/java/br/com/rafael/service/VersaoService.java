package br.com.rafael.service;

import br.com.rafael.models.Versao;
import br.com.rafael.repository.VersaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersaoService {


    @Autowired
    private VersaoRepository versaoRepository;


    public Versao buscarVersao()
    {
        return versaoRepository.findAll().get(0);
    }

}
