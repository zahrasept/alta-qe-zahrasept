package BasicProgramming;

public class FaktorBilanganII {
    public static void main (String[] args){
        int bilangan = 100;

        for (int i=bilangan; i>=1; i--){
            if (bilangan%i == 0){
                System.out.println(i);
            }
        }
    }
}
