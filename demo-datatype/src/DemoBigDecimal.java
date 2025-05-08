import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double r1 = 0.1 + 0.2;
    System.out.println(r1); // 0.30000000000000004

    // 2 approaches to create BigDecimal Object
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = BigDecimal.valueOf(0.2);

    BigDecimal bd3 = bd1.add(bd2); // Math "+" operation
    System.out.println(bd3); // 0.3

    float f1 = bd3.floatValue();
    System.out.println(f1); // 0.3
    double d1 = bd3.doubleValue();
    System.out.println(d1); // 0.3
    int i1 = bd3.intValue();
    System.out.println(i1); // 0

    String s1 = bd3.toString();
    System.out.println(s1); // "0.3"

    // subtract(), multiply()
    BigDecimal bd4 = bd1.subtract(bd2);
    System.out.println(bd4); // -0.1

    System.out.println(0.3 - 0.1); // 0.19999999999999998
    double result =
        BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result); // 0.2

    System.out.println(0.1 * 0.2); // 0.020000000000000004
    double result2 =
        BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println(result2); // 0.02

    // multiply -> handle decimal places
    // 3.333 * 2 -> 6.666 -> round 2 dp -> 6.67
    double result7 = BigDecimal.valueOf(3.333).multiply(BigDecimal.valueOf(2))
        .setScale(2, RoundingMode.HALF_UP).doubleValue();
    System.out.println(result7); // 6.67

    // divide
    System.out.println(0.3 / 0.1); // 2.9999999999999996
    double result3 =
        BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result3); // 3.0

    // 10 / 3 -> 3.333333....
    // Non-terminating decimal expansion
    double result4 = BigDecimal.valueOf(10)
        .divide(BigDecimal.valueOf(3), 2, RoundingMode.DOWN).doubleValue();
    System.out.println(result4); // 3.33

    // 8.25
    double result5 = BigDecimal.valueOf(16.5)
        .divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_UP).doubleValue();
    System.out.println(result5); // 8.3

    double result6 = BigDecimal.valueOf(16.5)
        .divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_DOWN).doubleValue();
    System.out.println(result6); // 8.2

    // x divide 0 -> undefined
    // 0 divide x -> 0
    // BigDecimal.valueOf(9.9).divide(BigDecimal.valueOf(0)); // error, Division by zero
  }
}