import java.util.*;
public class Prime {
     public static int prime(int n )
     {
        int count=0;
for(int i=1;i<=n;i++)
{
    if(n%i==0)
    {
     count++;
    }
}
return count;
     }

     public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
int num=prime(n);
if(num==2)
{
    System.out.println("The given number is prime ");
}
else {
System.out.println("The given number is not prime");
}

     }
}
