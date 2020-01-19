package puzzles;

import datastructures.Stack;
//import java.util.Stack;

/**
 * Created by ronim_000 on 8/4/2019.
 */
public class SumOfLists {

    public static void main(String[] args){
        SumOfLists sumOfLists = new SumOfLists();

        Stack s1 = new Stack();
        Stack s2 = new Stack();
        Stack s12 = new Stack();

        s1.push(3);
        s1.push(5);
        s1.push(2);

        s2.push(9);
        s2.push(7);
        s2.push(1);

        s12 = sumOfLists.sum(s1,s2);
        if (s12.isEmpty()){
            System.out.println("Sum is empty");
        }
        while (!s12.isEmpty()){
            System.out.println(s12.pop());
        }
    }
    public Stack sum(Stack first, Stack second){
        int num1 = convertStackToInt(first);
        int num2 = convertStackToInt(second);

        return convertIntToStack(num1+num2);
    }


private int convertStackToInt(Stack stack){
    StringBuilder sb = new StringBuilder();

    while(!stack.isEmpty()){
        int num = stack.pop();
        sb.append(num);
    }

    return Integer.parseInt(sb.toString());

}

private Stack convertIntToStack(int num){
    Stack forward = new Stack();
    Stack backward = new Stack();

    while (num>0){
        forward.push(num%10);
        num = num/10;
    }

    while(!forward.isEmpty()){
        backward.push(forward.pop());
    }
    return backward;
}
}
