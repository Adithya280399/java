import java.util.Scanner;
class LargestNumber{
public static void main(String[] args){
System.out.println("Enter the number");
Scanner scan=new Scanner(System.in);
int x=scan.nextInt();
int y=scan.nextInt();
int z=scan.nextInt();
if(x>y&&x>z){
System.out.println(x+"is largest");
}
else if(y>x&&y>z){
System.out.println(y+"is that largest");
}
else {
System.out.println(z+"is the largest");
}
}
}
