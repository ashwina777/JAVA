package com.company;
public class c12_StrMethods
{
    public static void main(String[] args)
    {
        String name = "Ashwina";
        int value = name.length();
        System.out.println(value);

        System.out.println(name.toLowerCase()); // just a runtime op
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedstr = "  Ashwina Rawat   ";
        System.out.println(nonTrimmedstr);
        String trimmedStr = nonTrimmedstr.trim(); // trim removes leading and trailing spaces
        System.out.println(trimmedStr);

        System.out.println(name.substring(5));
        System.out.println(name.substring(0));
        System.out.println(name.substring(1,7)); // beginIndex included end excluded

        System.out.println(name.replace('w','v'));
        System.out.println(name.replace("wina","ven"));

        System.out.println(name.startsWith("Ash"));
        System.out.println(name.startsWith("ash")); // case- sensitive
        System.out.println(name.endsWith("ina")); //only string arg
        System.out.println(name.charAt(3)); // index = 3 = w
        String modifiedName = "Ashshwinana";
        System.out.println(modifiedName.indexOf("a")); //Ashwinaa returns the index occurence of char at first
        System.out.println(modifiedName.indexOf("sh",4));
        System.out.println(modifiedName.indexOf("shss",4));// returns -1 if not found

        System.out.println(modifiedName.lastIndexOf('s'));
        System.out.println(modifiedName.lastIndexOf("sh")); // search from Right to Left
        System.out.println(modifiedName.lastIndexOf('w',4)); // search  from 0 to 4 which is ashsh returns -1 as does not exist

        System.out.println(name.equals("Ashwina"));
        System.out.println(name.equals("asHwina")); // false - case sensitive
        System.out.println(name.equalsIgnoreCase("aShWiNa"));// ignores case

        // Escape sequence characters consists of more than one characters but represents one char when used within the string
        System.out.println("I\t am \nescape \\  sequence \" double quote");
        /*
             \t = inserts tab
             \b = inserts backspace
             \n = newline
             \r = insert a carriagr return
             \' = inserts ' single quote
             \" = inserts "
             \\ = inserts \
         */
    }
}
