// This class discounts prices by 10%
public class DebugFour4
{
   private static final double DISCOUNT_RATE = 0.90;

   public static void main(String[] args)
   {
      final double DISCOUNT_RATE = 0.90;
      int price = 10;
      double price2 = 100.00;
      tenPercentOff(price);
      tenPercentOff(price2);
   }


   public static void tenPercentOff(int p)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.println("Ten percent off"  + p);
      System.out.println("  New price is " + newPrice);
   }
   public static void tenPercentOff(double p)
   {
      double newPrice = p * DISCOUNT_RATE;
      System.out.println("Ten percent off " + p);
      System.out.println("  New price is " + newPrice);
   }
}
