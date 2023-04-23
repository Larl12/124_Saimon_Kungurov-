import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
    // объявление и выделение памяти массива
    Random generator = new Random();

        int[] a = new int[5];
        int[] b = new int[10];
        Dubler c = new Dubler();
        System.out.print("Массив: ");
        for(int i = 0; i < a.length; i++){
            a[i] =  generator.nextInt(a.length);
            
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println();
        c = b.doubling(a);
        System.out.print("Двойной массив: ");
        for(int i = 0; i < c.length; i++){
            
            System.out.print(c[i]);
            System.out.print(" ");
        }
    }
}