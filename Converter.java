package ConversionNew;
import conversion.*;
import java.util.*;

 class Converter
{
public static void main(String args[])throws NoClassDefFoundError
{
double Current_exchange;
int choice;
System.out.println("CURRENCY CONVERTER");
System.out.println("1.DOLLAR TO INR");
System.out.println("2.INR TO DOLLAR");
System.out.println("3.EURO TO INR");
System.out.println("4.INT TO EURO");
System.out.println("5.YEN TO INR");
System.out.println("INR TO YEN");
Scanner r= new Scanner(System.in);
System.out.println("PLEASE ENTER THE CURRENT EXCHANGE RATE:");
Current_exchange = r.nextDouble();
Currency_converter cc = new Currency_converter(Current_exchange);
System.out.println("enter your choice");
choice = r.nextInt();
switch(choice)
{
case 1:
System.out.println("enter dollars");
Double Dollar = r.nextDouble();
System.out.println(Dollar+ "dollar are converter to"+ cc.DollartoInr(Dollar)+"Rs");
break;

case 2:
System.out.println("enter Inr");
Double Inr = r.nextDouble();
System.out.println(Inr+ "Rs are converter to"+ cc.InrtoDollar(Inr)+"Dollars");
break;

case 3:
System.out.println("enter Euros");
Double Euro = r.nextDouble();
System.out.println(Euro+ "euro are converter to"+ cc.EurotoInr(Euro)+"Rs");
break;

case 4:
System.out.println("enter Inr");
 Inr = r.nextDouble();
System.out.println(Inr+ "rs are converter to"+ cc.InrtoEuro(Inr)+"Rs");
break;

case 5:
System.out.println("enter Yens");
Double Yen = r.nextDouble();
System.out.println(Yen+ "Yen are converter to"+ cc.YentoInr(Yen)+"Rs");
break;

case 6:
System.out.println("enter Inr");
 Inr = r.nextDouble();
System.out.println(Inr+ "rs are converter to"+ cc.InrtoYen(Inr)+"Rs");
break;
}
}
}