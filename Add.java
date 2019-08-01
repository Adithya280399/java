import java.util.scanner;
class Add{
public static void main(string[] arg){
Scanner scan=new Scanner(System.in);
int n1=0,n2=0,n3=0,n4=0,sum=0;
int n1=scan.nextInt();
int n2=scan.nextInt();
if(n1>9&&n2>9){
n3=n1%100;
n4=n2%100;
sum=n3+n4;
}
System.out.println(sum);
}
else{
system.out.println("invalid");
}
}
}
