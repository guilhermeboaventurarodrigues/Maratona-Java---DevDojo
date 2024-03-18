package poo.enumeracao.domain;

public enum TipoPagamento {
    DEBITO  {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.10;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
}
