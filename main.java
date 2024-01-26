// Practicum 5 (Expression Evaluation)
// (TO UPDATE)

class Main {
  public static void main(String[] args) {
    System.out.println("PRACTICUM on Expressions");

    // var declarations
    int var1, var3, var7, var8, var9, var10, var11;
    int year, two_digit_century, two_digit_year;
    double var2, var4, var5, var6;
    boolean var12, var13, var14, var15;

    // type matching
    var1 = 10;    
    var2 = 10.00;  
    var3 = <operator>var2;  // var3 should be 10 (integer value)

    //complementary operations of mod and integer div
    // -- replace <operator> with the appropriate unary operator
    year = 2023;
    two_digit_century = 2023 <operator> 100;  // should be assigned 20 (int)
    two_digit_year = 2023 <operator> 100;  // should be assigned 23 (int)
    
    // mixed-type expressions
    // -- make any necessary changes to the operands below
    // -- for each variable to be assigned the indicated value
    var4 = 5.0;
    var5 = 10.0;
    var6 = var4 + var5;  // var6 should be 15.0 (float)
    var7 = var4 + var5;  // var7 should be 15 (int)
    
    // operator precedence
    var8 = 2 + 3 * 4;  // var8 should be 20 (int)
    var9 = 2 + 3 * 4;  // var9 should be 14 (int)
    
    // Boolean expressions
    // -- make the necessary changes to the operator precedence
    // -- by use or change of parentheses for each variable
    // -- to be assigned the indicated value
    var10 = -1;
    var11 = -10;
    var12 = false;
    var13 = !var10 > 0;  // var13 should be true
    var14 = var12 && (var10 > -1 || var10 > var11);  // var14 should be true 
    var15 = var10 == -1 && var12 || var10 > var11; // var15 should be true

    // displayResults
    System.out.println("var3 = " + var3);
    System.out.println("var6 = " + var6);
    System.out.println("var7 = " + var7);
    System.out.println("var8 = " + var8);
    System.out.println("var9 = " + var9);
    System.out.println("var13 = " + var13);
    System.out.println("var14 = " + var14);
    System.out.println("var15 = " + var15);
  }
}
