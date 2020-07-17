package conversion;

public class Currency_converter
{
double er = 0;
public Currency_converter(double Current_exchange)
{
er = Current_exchange;
}
public double DollartoInr(double Dollar)
{
double Inr=0;
Inr= Dollar*er;
return Inr;
}
public double InrtoDollar(double Inr)
{
double Dollar = 0;
Dollar = Inr /er;
return Dollar;
}
public double EurotoInr(double Euro)
{
double Inr=0;
Inr= Euro*er;
return Inr;
}
public double InrtoEuro(double Inr)
{
double Euro = 0;
Euro = Inr/er;
return Euro;
}
public double YentoInr(double Yen)
{
double Inr=0;
Inr= Yen*er;
return Inr;
}
public double InrtoYen(double Inr)
{
double Yen = 0;
Yen = Inr/er;
return Yen;
}
}
