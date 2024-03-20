package exceptions.exceptionChecked;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest01 {
    public static void main(String[] args) {
        try{
            criarNovoArquivo();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //Se colocar o throes IOException na frente, a função que chamar essa função que vai ter que cuidar da exceção, igual no exemplo acima.
    private static void criarNovoArquivo() throws IOException {
        File file1 = new File("arquivo\\test.txt");
        boolean isCriado = file1.createNewFile();
        System.out.println("Criado " + isCriado);
    }
}
