package stack;

import java.util.Scanner;

public class ArrayStackTest2 {

    public static void main(String[] args) {
        Scanner abir = new Scanner(System.in);
        int pos = 0;
        ArrayStack a = new ArrayStack(90);
        ArrayStack a1 = new ArrayStack(36);
        System.out.println("Enter your checking equation");
        String main = abir.nextLine();
        String s = main.trim();
        String s1 = "1 + 2 * (3 / 4)";
        String s2 = "1+2*[3*3+{4�5(6(7/8/9)+10)�11+(12*8)]+14";
        String s3 = "1 + 2 * [3 * 3 + {4 � 5 (6 (7/8/9) + 10)} � 11 + (12*8) / {13 +13}] + 14";
        String s4 = "1 + 2 ] * [3 * 3 + {4 � 5 (6 (7/8/9) + 10) � 11 + (12*8)] + 14";
        char temp1 = ' ';
        char temp2 = ' ';
        try {
            for (int c = 0; c < s.length(); c++) {
                char temp = s.charAt(c);
                //System.out.println(temp);
                if (temp == '(' || temp == '{' || temp == '[') {
                    a.push(temp);
                } else if (temp == ')' || temp == '}' || temp == ']') {
                    if (temp == ')') {
                        temp1 = (char) a.pop();
                    } else if (temp == '}') {
                        temp1 = (char) a.pop();
                    } else {
                        temp1 = (char) a.pop();
                    }
                }
            }
            if (a.isEmpty()) {
                System.out.println("This expression is correct");
            } else {
                System.out.println("This expression is not correct");
                temp2 = (char) a.pop();
                System.out.println("This expression is not correct due to " + temp2);
            }
            //a1.push(")");
            //a1.push("]");
            //a1.push("+");
            //a1.push("14");
            //System.out.println(a1.toString());
        } catch (Exception e) {
            System.out.println("This expression is not correct");
        }
    }
}
