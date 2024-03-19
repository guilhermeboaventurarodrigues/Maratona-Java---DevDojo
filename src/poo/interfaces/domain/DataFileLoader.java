package poo.interfaces.domain;

public class DataFileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carregando dados do arquivo");
    }
    @Override
    public void checkPermission() {
        System.out.println("Checkando permissão direto do dataFileLoader");
    }
}
