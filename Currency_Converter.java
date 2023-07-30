import java.util.*;
import java.text.DecimalFormat;
class Currency_Converter
{
    public static void main(String[] args) 
        {
            double rupee,dollar,code;
            DecimalFormat f = new DecimalFormat("##.###");
            Scanner sc = new Scanner(System.in);
            System.out.println("*** WelCome to Currency Converter Project ***\nEnter the currency code \n1:Rupees\n2:Dollar"); 
            code=sc.nextInt();
            if(code == 1)
            {
                System.out.println("Enter amount in rupees:");
                rupee = sc.nextFloat();
                dollar = rupee / 82.26;
                System.out.println("Dollar : "+f.format(dollar));
            }
            else if (code == 2)
            {
                System.out.println("Enter amount in dollar:");
                dollar = sc.nextFloat();
                rupee = dollar * 82.26;
                System.out.println("Rupees : "+f.format(rupee));
            }
            else
                System.out.println("Invalid Code!");
            
            sc.close();
    }
}