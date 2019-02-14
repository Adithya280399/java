import java.util.Scanner;
class Count{
public static void main(String[] args){
Scanner n=new Scanner(System.in);
int a=n.nextInt();
int count=0;
while(a>0){
a=a/10;
count++;
}
System.out.println(count);
}
}
