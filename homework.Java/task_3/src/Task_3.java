public class Task_3 implements Task_3_base {
    @Override
    public int subtask_1_for(int n1, int n2, int a, int b) {
        // подсчитать, сколько чисел, кратных a, но не кратных b,
        // находится между числами n1 и n2 включительно
        int w=0;
        if (n1 > n2){
            while (n1 - n2 >= 1){
                n1 = n1-1;
                if ((n1 % a == 0) && (n1 % b!= 0)){
                    w = w+1;
                }
                else{
                    w = w+0;
                }
            }
        }
        else{
            while (n2 - n1 >= 1){
                n2 = n2-1;
                if ((n2 % a == 0) && (n2 % b!= 0)){
                    w = w + 1;
                }
                else{
                    w = w + 0;
                }
            }

        }
        return w;
    }

    @Override
    public int subtask_2_for(int num) {
        // Последовательность чисел строится следующим образом:
        // сначала идет одна единица,
        // потом две двойки,
        // потом три тройки,
        // ...
        // потом n раз число n
        // ...
        // Найти, какое число будет находиться в этой последовательности
        // на позиции num
        int q = 0;
        int w = 0;
        int r = 1;
        while (w < num){
            w = w + r;
            q = r;
            r = r + 1;
        }
        return q;
    }

    @Override
    public int subtask_3_for(int num, int d, int cnt) {
        // Дана последовательность
        // a(0) = num
        // a(n) = a(n - 1) * d + 1
        // Найти сумму первых cnt элементов последовательности
        int g = num;
        int h = 1;
        int num1 = num;

        while (h != cnt){
            num1 = num;
            num = num1 * d + 1;
            g = g + num;
            h = h + 1;
        }
        return g;
    }

    @Override
    public int subtask_4_for(int n) {
        // Вычислить сумму
        // S(n) = 1 + 1 * 2 + 1 * 2 * 3 + ... + n!
        // для заданного n
        // (n! - это n-факториал. Кто не знает - гуглите)
        int sus = 1;
        int c = 1;
        int u = n;
        int m = n;
        while (m > 1){
            u = m;
            c = 1;
            for(int a = 1; a <= u; a++){
                c = c * a;
            }
            sus = sus + c;
            m = m - 1;
        }
        return sus;
    }
}
