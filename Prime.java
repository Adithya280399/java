import java.util.Scanner;
class Prime{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);
int n=scan.nextInt(),flag=0;
for(int i=2;i<n;i++){
if(n%i==0){
flag=1;
break;
}
}
if(flag==1)
System.out.println("no");
else
System.out.println("yes");
}
}
