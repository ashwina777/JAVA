
# Java Tutorial: Creating Packages in Java

## How to create a package in Java:

To create a package in Java, you can use the following commands:

1. Create a packages folder:
```terminal
javac -d ashwina java
```
The above code creates a 'packages' folder.

2. Create an 'ashwina' class:
```terminal
java ashwina java
```
The above code creates an 'ashwina' class.

3. You can also create inner packages by adding 'inner' as the package name.

4. Once created, these packages can be used by other classes.

## Running program from terminal (with package)

Example:
```powershell
PS C:\Users\Amit rana\ASHWINA\javaproject\self\com\company\c55_package> javac -d . c55_package.java
PS C:\Users\Amit rana\ASHWINA\javaproject\self\com\company\c55_package> java .\c55_package.java
This is my scanner
7
7
```
Example to create a folder 'cmd' and put all .class files in it:

```powershell

PS C:\Users\Amit rana\ASHWINA\javaproject\self\com\company\c55_package> javac -d cmd c55_package.java
PS C:\Users\Amit rana\ASHWINA\javaproject\self\com\company\c55_package> java c55_package.java
```
Compilation Commands
Compile all Java files using *:

```bash

javac -d . *.java
```
Compile and set the destination directory to 'b':

```bash

javac -d b c55_package.java
```
This command places the compiled .class file(s) in the 'b' directory. If 'b' doesn't exist, it will be created.

Compile and set the destination directory to the current directory:

```bash
javac -d . c55_package.java
```
The compiled .class file(s) will be placed in the current directory. If the classes are in a package (e.g., com.company.c55_package), the directory structure corresponding to the package will be created under the current directory.