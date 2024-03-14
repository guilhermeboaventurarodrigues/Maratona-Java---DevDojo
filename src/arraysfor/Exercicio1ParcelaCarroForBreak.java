package arraysfor;

public class Exercicio1ParcelaCarroForBreak {
    public static void main(String[] args) {
        int priceCar = 40000;

        for (int i = 1; i <= priceCar ; i++) {
            int priceFinal = priceCar / i;
            if(priceFinal >= 1000){
                System.out.println("Você pode parcelar esse carro em "+i+" vezes e o valor da parcela ficará "+priceFinal);
            }  else break;
        }
    }
}
