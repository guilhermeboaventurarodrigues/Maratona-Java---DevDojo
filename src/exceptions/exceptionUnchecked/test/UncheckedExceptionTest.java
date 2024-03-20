package exceptions.exceptionUnchecked.test;

public class UncheckedExceptionTest {
    public static void main(String[] args) {
        divisao(1, 0);
        //Se digitar CONTROL+Q com o mouse em cima de divisao mostra os comentários de parametros
    }

    /**
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso o B seja zero
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            //Nesse caso poderia ser tambem o RuntimeException somente.
            throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
        }
        return a / b;
    }
}
