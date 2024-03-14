package arraysfor;

public class Exercicio2ArraysMultidimensionaisForEach {
    public static void main(String[] args) {
        int[][] array3 = {{1,2,3}, {4,5,6}, {7,8,9}};

        int[][] array2 = new int[3][];
        array2[0] = new int[2];
        array2[1] = new int[]{1,2,3,4,7,6};

        int[][] array1 = new int[3][3];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[0][2] = 3;

        array1[1][0] = 4;
        array1[1][1] = 5;
        array1[1][2] = 6;

        array1[2][0] = 7;
        array1[2][1] = 8;
        array1[2][2] = 9;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.println(array1[i][j]);
            }
        }

        for (int[] arr : array1) {
            System.out.println(arr);
            for(int arr1:arr){
                System.out.println(arr1);
            }
        }
    }
}
