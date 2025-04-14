package exerciseForMyself;
public class Weak1 {
  public static void main(String[] args) {
System.out.println("Hello I am Season, this is my first time to learn java code");
// ! int exercise
int skuId = 2;
int itemQty = 40;
int price = 10;

System.out.println(skuId);
skuId = 5;
System.out.println(skuId);
System.out.println(skuId*itemQty);
System.out.println(itemQty+price*skuId);
System.out.println((itemQty+price)*skuId);
itemQty = 20;
System.out.println((itemQty+price)*skuId);
price = 10/5;
System.out.println((itemQty+price)*skuId);

// ! double exercise
double eachQuarter = 0.25;
double halfYear = 0.5;

System.out.println(eachQuarter);
System.out.println(eachQuarter+halfYear);

// ! int X double exercise
System.out.println(skuId*halfYear);
System.out.println(skuId*halfYear+itemQty*eachQuarter);
eachQuarter = price;
System.out.println(itemQty*eachQuarter);
System.out.println(itemQty*price);
  }

}
