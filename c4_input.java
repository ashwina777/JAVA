package com.company;
import java.util.Scanner; // Importing Java Sca
public class c4_input
{
    public static void main(String[] args)
    {
        System.out.println("Taking input from user");//type sout
        Scanner sc = new Scanner(System.in); // creating an object name
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();  // method to read from keyboard
        System.out.print("Enter number 2: ");
        float b = sc.nextFloat();


        System.out.print("Sum of both numbers : ");

        System.out.println(a+b);
//         boolean b1 = sc.hasNextInt();
//         System.out.println(b1);
        System.out.print("Enter any word : ");
        String str1 = sc.next(); // used to read a single word
        System.out.println(str1);
        sc.nextLine();  // *NOTE* (scroll down)
        System.out.println("Enter a sentence : ");
        String str2 = sc.nextLine(); // read line
        System.out.println(str2);

    }

}
/* *NOTE*
When you use sc.next(), it reads the next token (a sequence of non-whitespace characters) from the input.
It stops reading when it encounters whitespace (such as space or a newline character).
Using sc.nextLine(); before reading a sentence with nextLine()
in Java is a common practice to ensure that any leftover newline
characters or whitespace from previous input operations are consumed.

Here's a simple explanation of why it's needed:
Reading Non-String Data (e.g., int, float): When you use sc.nextInt()
 or sc.nextFloat() to read numeric data, these methods only consume the
 numeric part of the input. If the user presses Enter after entering a number,
  a newline character ('\n') is left in the input buffer.

nextLine() and Newline Characters: The nextLine() method reads an entire line,
 including any characters up to and including the next newline character ('\n').
 If there's a newline character left in the input buffer from a previous input
 operation, calling nextLine() immediately will result in it consuming that
 newline character, which effectively reads an empty line.

To handle this situation correctly and ensure that you can read a sentence with
 nextLine() without issues, you can insert sc.nextLine(); immediately after reading
 non-string data (like int or float). This extra nextLine() call serves the purpose of
 consuming the leftover newline character from the previous input, making the subsequent
 nextLine() call ready to accept user input.
 */