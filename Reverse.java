import java.util.Scanner;
class Reverse
{
  public static void main(String[] args)
  {
    int num=21,rem,rev=0;
    Scanner sc=new Scanner(System.in);
    while(num>0)
    {
      rem=num%10;
      rev=(rev*10)+rem;
      num=num/10; 
    }
    System.out.println("reverse number="+rev);
  }
}
