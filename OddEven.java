import java.util.Scanner;
class OddEven{
public static void main(String[] args){
System.out.println("enter the number");
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
if(n%2==0){
System.out.println("Even");
}
else{
System.out.println("Odd");
}
}
}
