/*
1.Write a Java program to convert a string to lowercase.
2.Write a Java program to replace spaces with underscores.
3.Write a Java program to fill in a letter template which looks like below:
   letter = “Dear <|name|>, Thanks a lot”

   Replace <|name|> with a string (some name)
4.Write a Java program to detect double and triple spaces in a string.
5.Write a program to format the following letter using escape sequence characters.
Letter = “Dear Harry, This Java Course is nice. Thanks”
 */
package com.company;
public class c13_prac04
{
    public static void main(String[] args)
    {
        // Ans 1.
        String s1 = "ASHWINA";
        String s2 = s1.toLowerCase();
        System.out.println(s2);

        // Ans 2.
        String s3 = "My Name Is Ashwina Rawat. I am learning java";
        System.out.println(s3.replace( ' ','_' ));

        //Ans 3.
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","Ashwina");
        System.out.println(letter);

        // Ans 4.
        String str = "This String  has double and triple   spaces.";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

        //Ans 5.
        String Letter = "\"Dear Harry,\tThis Java Course is nice. \nThanks\"";
        System.out.println(Letter);

    }
}
