package poo.enumeracao.test;

import poo.enumeracao.domain.Cliente;
import poo.enumeracao.domain.TipoCliente;
import poo.enumeracao.domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Guilherme", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Jorge ben jor", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

//        cliente1.setTipoCliente(TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoCliente.tipoClientePorNomePessoa("Pessoa Física"));
    }
}
