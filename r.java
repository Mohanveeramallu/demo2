import java.util.Scanner;
class Reverse
{
  public static void main(String[] args)
  {
    int num,rem,rev=0;
    System.out.println("Enter a number");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    while(num>0)
    {
      rem=num%10;
      rev=(rev*10)+rem;
      num=num/10; 
    }
    System.out.println("reverse number="+rev);
  }
}