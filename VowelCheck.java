import java.util.Scanner;
class VowelCheck{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);

char n=scan.next().toLowerCase().charAt(0);

if(n=='a' || n=='e' || n=='i' || n=='o' || n=='u')
System.out.println("Vowel");

else if(Character.isLetter(n))
System.out.println("Consonant");

else
System.out.println("invalid");

}

}
