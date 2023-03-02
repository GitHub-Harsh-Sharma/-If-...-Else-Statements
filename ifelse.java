import java.io.*;
class Ifelse
{
 public static void main(String args[])throws IOException
        {
        int a,b;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
               System.out.println("Enter the number a");
               a=Integer.parseInt(br.readLine());
               System.out.println("Enter the number b");
               b=Integer.parseInt(br.readLine());
        if(a<100)
        {
        System.out.println("Number is less than 100");
        }
        else
        {
        System.out.println("Number is greater than 100");
        }
        if(b<200)
        {
        System.out.println("Number is less than 200");
        }
        else
        {
        System.out.println("Number is greater than 200");
        }
        }
}
