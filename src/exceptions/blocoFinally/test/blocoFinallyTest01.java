package exceptions.blocoFinally.test;

public class blocoFinallyTest01 {
    public static void main(String[] args) {
        abreConexao();
    }

    private static void abreConexao() {
        try {
            System.out.println("Abrindo conexão com o banco");
            System.out.println("Conexão aberta");
            throw new RuntimeException("Erro colocado a mão, pra mostrar que mesmo com erro o bloco finally é executado");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Bloco finally finalizado independente da exception");
        }
    }
}
