package stack;

import java.util.Scanner;

public class ArrayStackTest {

    public static void main(String[] args) {
        Scanner abir = new Scanner(System.in);
        ArrayStack a = new ArrayStack(90);
        ArrayStack a1 = new ArrayStack(36);
        ArrayStack a3 = new ArrayStack(36);
        int pos;
        //System.out.println("Enter your checking equation");
        String main = abir.nextLine();
        String s = main.trim();
        String s1 = "1 + 2 * (3 / 4)";
        String s2 = "1+2*[3*3+{3+6}+{4�5(6(7/8/9)+10)�11+(12*8)]+14";
        String s3 = "1 + 2 * [3 * 3 + {4 � 5 (6 (7/8/9) + 10)} � 11 + (12*8) / {13 +13}] + 14";
        String s4 = "1 + 2 ] * [3 * 3 + {4 � 5 (6 (7/8/9) + 10) � 11 + (12*8)] + 14";
        char temp1 = ' ';
        try {
            for (int c = 0; c < s.length(); c++) {
                char temp = s.charAt(c);
                //System.out.println(temp);
                if (temp == '(' || temp == '{' || temp == '[') {
                    a.push(temp);
                    a1.push(c);
                } else if (temp == ')' || temp == '}' || temp == ']') {
                    if (a.isEmpty()) {
                        a3.push(c);
                        int pos2 = (int) a3.pop();
                        System.out.println("This expression is not correct");
                        if (']' == temp) {
                            System.out.println("Error at character " + pos2 + "[- not open");
                        } else if ('}' == temp) {
                            System.out.println("Error at character " + pos2 + "{- not open");
                        } else {
                            System.out.println("Error at character " + pos2 + "(- not open");
                        }
                    }
                    if (temp == ')') {
                        temp1 = (char) a.pop();
                        pos = (int) a1.pop();
                        if (temp1 != '(') {
                            System.out.println("This expression is not correct");
                            System.out.println("Error at character " + pos + "(- not open");
                            break;
                        }
                    } else if (temp == '}') {
                        temp1 = (char) a.pop();
                        pos = (int) a1.pop();
                        if (temp1 != '{') {
                            System.out.println("This expression is not correct");
                            System.out.println("Error at character " + pos + " (- not closed");;
                            break;
                        }
                    } else {
                        temp1 = (char) a.pop();
                        pos = (int) a1.pop();
                        if (temp1 != '[') {
                            System.out.println("This expression is not correct");
                            System.out.println("Error at character " + pos + " {- not closed");;
                            break;
                        }
                    }
                }
            }
            if (a.isEmpty()) {
                System.out.println("This expression is correct");
            } else {
            }
            //a1.push(")");
            //a1.push("]");
            //a1.push("+");
            //a1.push("14");
            //System.out.println(a1.toString());
        } catch (Exception e) {
            //System.out.println("This expression is not correct");
        }
    }
}
