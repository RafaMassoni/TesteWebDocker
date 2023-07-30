package br.com.rafael.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Versao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    private String versaoPrincipal;

    @NotBlank
    private String versaoSecundaria;


    @NotBlank
    private String versaoBuild;


    public String getVersaoCompleta() {
        return versaoPrincipal + "." +
         versaoSecundaria + "." +
         versaoBuild ;
    }
}
