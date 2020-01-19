package extra;
import java.util.Stack;

/**
 * Created by ronim_000 on 10/27/2019.
 */
public class BalancedParentheses {
    public static char[][] TOKENS = {{'(',')'},{'[',']'},{'{','}'}};

    public static void main(String[] args){
        System.out.println(isBalanced("abc fhs"));
        System.out.println(isBalanced(""));
        System.out.println(isBalanced("{[()]}(){}{}[][()]"));
        System.out.println(isBalanced("{[()]}(){}{}[][()]}{"));
        System.out.println(isBalanced("{[()}"));
    }

    public static boolean isOpenTerm(char c){
        for (char[] bracketPair : TOKENS){
            if (bracketPair[0]==c){
                return true;
            }
        }
        return false;
    }

    public static boolean matches(char openTerm, char closedTerm){
        for (char[] bracketPair : TOKENS){
            if (bracketPair[0]==openTerm && bracketPair[0]==closedTerm){
                return true;
            }
        }
        return false;
    }

    public static boolean isBalanced(String expression){
        java.util.Stack<Character> stack = new Stack<Character>();
        for (char c : expression.toCharArray()){
            if (isOpenTerm(c)){
                stack.push(c);
            }
            else{
                if (stack.isEmpty()|| (!isOpenTerm(stack.pop()))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
