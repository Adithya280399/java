import java.util.Scanner;
class CheckAlphabet{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
char a=scan.nextInt().charAt(0);
if(Character.isLetter(a)){
System.out.println("Alphabet");
}
else {
System.out.println("No");
}
}
}
