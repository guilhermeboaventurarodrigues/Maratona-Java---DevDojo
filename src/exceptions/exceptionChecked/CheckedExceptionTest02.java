package exceptions.exceptionChecked;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest02 {
    public static void main(String[] args) {
        criarNovoArquivo();

        //Por causa desse arquivo precisa tratar, ou colocar na definição da função o "throws IOException"
        try {
            criarNovoArquivo1();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void criarNovoArquivo() {
        File file1 = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file1.createNewFile();
            System.out.println("Criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace(); //Não é obrigatorio printar a exceção nesse caso, poderia colocar só a nova.
            throw new RuntimeException("Colocar a exeption que quiser");
        }
    }

    private static void criarNovoArquivo1() throws IOException {
        File file1 = new File("arquivo\\test.txt");
        try {
            boolean isCriado = file1.createNewFile();
            System.out.println("Criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace(); //Não é obrigatorio printar a exceção nesse caso, poderia colocar só a nova.
            throw e; //Manda a mesma exeção pra pessoa de cima conseguir tratar
        }
    }
}
