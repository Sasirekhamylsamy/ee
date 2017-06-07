import java.io.*;
import java.util.*;
public class vowel
{
public static void main(String args[])
{
char n;
Scanner scan=new Scanner(System.in);
System.out.println("enter a character");
n=scan.next().charAt(0);
switch(n)
{
case 'a':
System.out.println("the given character"+n+"is vowel");
break;
case 'e':
System.out.println("the given character is"+n+"is vowel");
break;
case 'i':
System.out.println("the given character"+n+"is vowel");
break;
case 'o':
Syatem.out.println("the given character"+n+"is vowel");
break;
case 'u':
System.out.println("the given character"+n+"is vowel");
break;
default:
System.out.println("the given character "+n+"is consonant");
break;
}
}
}
