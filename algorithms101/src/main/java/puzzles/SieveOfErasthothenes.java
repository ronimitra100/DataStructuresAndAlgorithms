package puzzles;

/**
 * Created by ronim_000 on 8/6/2019.
 */
public class SieveOfErasthothenes {
    public static void main(String[] args){
        SieveOfErasthothenes primes = new SieveOfErasthothenes();
        primes.print(100);
    }
    public void print(int upperBound){
        int upperBoundSquareRoot = (int)Math.sqrt(upperBound);

        boolean[] isComposite = new boolean[upperBound+1];

        for (int i=2; i<=upperBound; i++){
            if(!isComposite[i]){
                System.out.println(i);

                for (int j=i*i; j<=upperBound; j+=i){
                    isComposite[j] = true;
                }
            }
        }
    }
}
