package poo.enumeracao.domain;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int valor;
    private final String nomePessoa;
    TipoCliente(int valor, String nomePessoa) {
        this.valor = valor;
        this.nomePessoa =  nomePessoa;
    }

    public static TipoCliente tipoClientePorNomePessoa(String nomePessoa){
        for(TipoCliente tipo : values()){
            if (tipo.getNomePessoa().equalsIgnoreCase(nomePessoa)){
                return tipo;
            }
        }
        return null;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public int getValor() {
        return valor;
    }
}
