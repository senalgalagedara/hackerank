import java.util.Scanner;
public class balancedbrackets {
    public static void main(String[] arg)
    {
        int n;
        String[] ar = new String[1000];
        Scanner userin = new Scanner(System.in);
        n = userin.nextInt();
        int nextnum=0;

        for(int i = 0;i<n;i++)
        {
            ar[i] = userin.next();
        }
        for(int i = 0;i<n;i++)
        {
            char[] carr = ar[i].toCharArray(); 
            for(int j = 0;j<(carr[i]/2);j++)
            {
                if(carr[j]==carr[n-(j+1)])
                {
                    nextnum++;
                }
            }
            if(carr[i/2]==nextnum)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            nextnum = 0;
        }
    }
}
// uda ek wrdi
//pahala ek hri
/*
 * import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        int n = userin.nextInt();
        userin.nextLine(); // Consume the newline character

        String[] ar = new String[n];

        for (int i = 0; i < n; i++) {
            ar[i] = userin.nextLine();
        }

        for (String str : ar) {
            if (isBalanced(str)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        userin.close();
    }

    // Function to check if the brackets are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets onto the stack
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Check if the stack is empty or brackets do not match
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty, brackets are balanced
        return stack.isEmpty();
    }

    // Helper function to check matching pairs of brackets
    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}

 */