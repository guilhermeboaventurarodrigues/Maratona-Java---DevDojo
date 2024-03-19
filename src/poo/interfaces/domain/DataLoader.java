package poo.interfaces.domain;

public interface DataLoader {
    public abstract void load();

    default void checkPermission(){
        System.out.println("Imprimindo direto da interface");
    }

    public static void testPublicStaticDentroDaInterface(){
        System.out.println("Testando public static void dentro da Interface");
    }
}
