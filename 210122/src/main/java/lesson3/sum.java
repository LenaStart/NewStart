package lesson3;

public class sum {
    public static void main(String[] args) {
        System.out.println(equals());
    }
    private static boolean equals() {
        int[] arr = {5,6,1,1,4,16,1};
        boolean rav = false;
        int pr = 0;
        int sum = 0;
        int lev = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            lev += arr[i];
            pr = sum  - lev;
            if (lev == pr){
                rav = true;
                System.out.printf("Найдено равенство на элементе: %d, Cумма полвин: %d%n", i, lev);
            }
        }
        return rav;
    }
}
