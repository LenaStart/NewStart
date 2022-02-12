package lesson3;

public class coob {
    public static void main(String[] args) {
        int[][][] kub = new int [3][3][3];

        for (int i = 0; i < kub.length; i++) {
            for (int j = 0; j < kub.length; j++) {
                for (int k = 0; k < kub.length; k++) {
                    System.out.print(kub[i][j][k]);
                }
                //System.out.println();
            }
            System.out.println();
        }
    }
}
