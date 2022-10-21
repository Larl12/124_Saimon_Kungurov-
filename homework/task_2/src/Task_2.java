public class Task_2 implements Task_2_base {
    @Override
    public int subtask_1_while(int num) {
        // Найти максимальное число, являющееся полным квадратом,
        // не превосходящее заданное натуральное num
        int adin = 1;
        int result = 1;
        int jokaiboka = 1;
        while (result <= num) {
            jokaiboka = result;
            result = adin * adin;
            adin = adin + 1;
        }
        return jokaiboka;
    }

    @Override
    public int subtask_2_while(int num) {
        // Последовательность целых чисел p(n) определяется следующим образом:
        // p(0) = 1
        // p(k) = 2 * p(k - 1) + 6, k > 0
        //Найти элемент последовательности с номером num
        int q = 1;
        int q2 = 1;
        int w = 0;
        while (w!= num) {
            q = q2;
            q2 =2 * q + 6;
            w = w + 1;
        }
        return q2;
    }

    @Override
    public boolean subtask_3_while(int num, int base) {
        // Проверить, является ли число num натуральной степенью числа base
        int r = 0;
        int f = base;
        while (base < num) {
            r = base;
            base = base * f;
        }
        if (base == num) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int subtask_4_while(int start, int end) {
        // Вычислить, за какое минимальное число операций
        // вычесть 1
        // поделить на 2
        // число start можно превратить в end. Гарантируется, что start >= end >= 1
       int t=0;
       int k=start;
       while (k!=end){
           if (k%2>0){
               k=k-1;
               t=t+1;

           }
           else{
               if (k/end>=2){
                   k=k/2;
                   t=t+1;
               }
               else{
                   k=k-1;
                   t=t+1;
               }
           }
       }
      return t;
    }
}
