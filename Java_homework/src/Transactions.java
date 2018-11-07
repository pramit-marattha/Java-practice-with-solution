
public class Transactions 

{

   public static void main (String[] args)

   {

Account acct1 = new Account ("pramit marattha", 14790,22.24);

Account acct2 = new Account ("ze_flamezthrowzer", 24680, 59.00);

Account acct3 = new Account ("yolo", 13579, 119.32);

acct1.deposit (112.25);

double smithBalance = acct2.deposit (700.00);

System.out.println ("pramit's balance after deposit: " +

smithBalance);

System.out.println ("pramit's balance after withdrawal: " +

acct2.withdraw (111.11, 11.20));

acct1.addInterest();

acct2.addInterest();

acct3.addInterest();

System.out.println ();

System.out.println (acct1);

System.out.println (acct2);

System.out.println (acct3);

   }

}