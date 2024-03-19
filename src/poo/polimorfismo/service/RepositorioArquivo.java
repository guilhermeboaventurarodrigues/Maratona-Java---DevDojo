package poo.polimorfismo.service;

import poo.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando nos arquivos");
    }
}
