package ash.pack;

//import javax.sound.midi.Soundbank;

//import java.util.Scanner; OR
//import java.util.*; // import all classes of java.util
public class c55_packages {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in); //OR
        System.out.println("This is my scanner");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);;
    }
}

/*
running program from terminal ( with package)
PS C:\Users\Amit rana\ASHWINA\javaproject\self\com\company\c55_package> javac -d . c55_package.java
PS C:\Users\Amit rana\ASHWINA\javaproject\self\com\company\c55_package> java .\c55_package.java
This is my scanner
7
7

PS C:\Users\Amit rana\ASHWINA\javaproject\self\com\company\c55_package> javac -d cmd c55_package.java
PS C:\Users\Amit rana\ASHWINA\javaproject\self\com\company\c55_package> java c55_package.java  
this will create a folder cmd and put all .class file in it

 to compile all use * as  javac -d . *.java
javac -d b c55_package.java:
This command uses the -d option to specify the destination directory for the compiled classes,
and the destination directory is set to b.
The compiled .class file(s) will be placed in the b directory.
 If the b directory does not exist, it will be created.

javac -d . c55_package.java:
This command also uses the -d option, but the destination directory is set to . which represents the current directory.
The compiled .class file(s) will be placed in the current directory where the compilation is being executed.
If the classes are in a package (as in your case with com.company.c55_package),
the directory structure corresponding to the package will be created under the current directory.

here this ised to compile after already moving file to ash.pack
javac -d . ash/pack/c55_packages.java
java ash.pack.c55_packages
 */