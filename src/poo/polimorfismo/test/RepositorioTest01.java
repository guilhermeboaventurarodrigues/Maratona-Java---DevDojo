package poo.polimorfismo.test;

import poo.polimorfismo.repositorio.Repositorio;
import poo.polimorfismo.service.RepositorioArquivo;
import poo.polimorfismo.service.RepositorioBancoDeDados;
import poo.polimorfismo.service.RepositorioMemoria;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioBancoDeDados();
        Repositorio repositorio2 = new RepositorioArquivo();
        Repositorio repositorio3 = new RepositorioMemoria();
        repositorio1.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
