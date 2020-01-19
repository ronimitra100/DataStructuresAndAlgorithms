package puzzles;

/**
 * Created by ronim_000 on 8/4/2019.
 */
public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.print();
    }

    public void print(){
        for (int i=1; i<=100; i++){
            if (i%15==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
                    System.out.println(i);
                }
            }
        }
    }

