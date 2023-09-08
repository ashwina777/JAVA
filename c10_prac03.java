/*
::PRACTICE SET QUS::
1.What will be the result of the following expression:
float a = 7/4 * 9/2
2.Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
3.Use comparison operators to find out whether a given number is greater than the user entered number or not.
4.Write the following expression in a java program:
(v^2-u^2)/2as
5.Find the value of 'a' in expression given below :
int x = 7
int a = 7*49/7 + 35/7
 */
package com.company;
import java.awt.geom.Arc2D;
import java.util.Scanner;
public class c10_prac03
{
    public static void main(String[] args)
    {
        // ANS 1.
        float a1 = 7/4 * 9/2;
        //same precedence  L -> R Associativity
        // 1*9/2
        // 9/2 = 4.0
        System.out.println(a1);
        float b = 7/4.0f * 9/2.0f;
        // evaluated as floating point number
        // 7/4 = 1.75 * 9 / 2
        // 1.75*9 = 15.75 / 2 = 7.875
        System.out.println(b);

        // ANS 2.             !!** IMPORTANT NOTE AT END**!!
        char grade = 'B';
        //grade += 8; // grade encrypt by adding 8
        grade = (char) (grade + 8); // Explicit typecasting;
        System.out.println(grade);
        grade -= 8; // decrypt by removing the edited part
        System.out.println(grade);

        //ANS 3.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num1 = sc.nextInt();
        System.out.println(num1>45);

        // ANS 4.
        float v=10,u=10,a=5,s=2;
        float res = (v*v - u*u)/ (2*a*s);
        System.out.println(res);

        // ANS 5.
        int x = 7*49/7 + 35/7;
        // 7*49 = 343 / 7 + 35/7
        // 343/7 = 49 + 35/7
        // 49 + 5 = 54
        System.out.println(x);


    }
}
/*
   *** NOTE ***
   * The output of the two expressions grade += 8; and grade = grade + 8; is different because of the way compound assignment (+=) and standard assignment (=) operators work in Java when applied to char variables.

grade += 8;:

In this case, grade is incremented by 8 using the += operator. The char value 'B' (which corresponds to the Unicode value 66) is first implicitly promoted to an int (66), then 8 is added to it.
The result of the addition is an int, so it will be automatically narrowed back to a char. In this case, the result is the Unicode value 74, which corresponds to the character 'J'. So, grade becomes 'J'.
This operation is legal because it's a compound assignment that combines the addition and assignment.
grade = grade + 8;:

In this case, grade is incremented by 8 using the + operator. The result of grade + 8 is an int, which is 74 (Unicode value of 'J').
You then attempt to assign this int value (74) back to the char variable grade. This assignment results in a compilation error because you are trying to assign an int to a char variable without an explicit type cast. It's not an automatic narrowing conversion, so it's considered a type error in Java.
To make the second expression work without a compilation error, you can explicitly cast the result back to a char like this:

java
Copy code
grade = (char)(grade + 8);
This way, you inform the compiler that you are intentionally narrowing the int value to a char, and it will work as expected.
 */