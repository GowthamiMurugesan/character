package guvi;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
		String a="";
a=in.nextLine();
char[] b=a.toCharArray();
for(int i=0;i<b.length;i++)
if(b[i]>64&&b[i]<91||b[i]>96&&b[i]<123){
	System.out.println("alphabets");
}
else
	System.out.println("not an alphabet");
	}

}
