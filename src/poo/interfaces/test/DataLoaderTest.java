package poo.interfaces.test;

import poo.interfaces.domain.DataBaseLoader;
import poo.interfaces.domain.DataFileLoader;
import poo.interfaces.domain.DataLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader1 = new DataBaseLoader();
        DataFileLoader dataFileLoader1 = new DataFileLoader();

        dataBaseLoader1.load();
        dataFileLoader1.load();

        dataBaseLoader1.checkPermission();
        dataFileLoader1.checkPermission();

        DataLoader.testPublicStaticDentroDaInterface();

        System.out.println(dataFileLoader1);
    }
}
