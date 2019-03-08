/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Vowel");
		}
		else if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("Consonant");
		}
		else 
		{
			System.out.println("Invalid");
      }

		}
	}
