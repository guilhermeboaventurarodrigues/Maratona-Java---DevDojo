package exceptions.IOException.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file1 = new File("arquivo\\test.txt");
        try{
            boolean isCriado = file1.createNewFile();
            System.out.println("Criado "+isCriado);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
