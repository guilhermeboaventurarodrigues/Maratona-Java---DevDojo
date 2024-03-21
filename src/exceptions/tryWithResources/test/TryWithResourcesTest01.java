package exceptions.tryWithResources.test;

import exceptions.tryWithResources.domain.Leitor1;
import exceptions.tryWithResources.domain.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivoLeitor1();
    }

    // Você só pode usar o try desse jeito se o metodo que estiver como parametros tiver o "Closable" ou "AutoClosable" como extends
    public static void lerArquivoLeitor1() {
        try (Leitor1 leitor = new Leitor1()) {

        } catch (IOException e) {

        }
    }
    public static void lerArquivoLeitor2() {
        try (Leitor2 leitor = new Leitor2()) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo() {
        try (Reader reader = new BufferedReader(new FileReader("test.txt"))) {

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
