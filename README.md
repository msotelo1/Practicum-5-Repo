# Instructions  

## Practicum 5 - Expression Evaluation<br>

### BACKGROUND<br>

**Primitive Data Types of Java**

The primitive data types built into Java are: `byte`, `short`, `int`, `long`,
`float`, `double`, `boolean` and `char`. Note that the `String` type is NOT
a primitive data type. It is provided by the predefined String class.<br>

Primitive types byte, short, int and long each hold integer values. The `byte`
type uses one byte of storage (thus storing values -128 to 127). The `short`
data type uses two bytes (storing values -32,768 to 32,767). The `int` data
type uses 4 bytes (storing values -2,147,483,648 to 2,147,483,647). Finally,
the `long` data type uses 8 bytes of storage (thus storing values -9,223,372,036,854,775,808 to -9,223,372,036,854,775,807). The number of
bytes that each integer value uses is most relevant when storing a large 
number of such values (e.g., an array of type short[] can use much less
memory than an array of type long[]).

**Unary Cast Operator**<br><br>
When a value of one data type is assigned to a variable of a different data
type, different things can result. If the type of the value can be changed 
to the type of the variable without the loss of information, then Java
will allow the assignment, e.g., <br><br>
`double num = 10`. 
<br><br>
In this case, the value 10 is converted to the 
floating-point value 10.0 and assigned to `num`. If, however, the assignment
were, <br><br>
`double num1 = 10.2;`<br>
`int num2 = num1;`, 
<br><br>
then an error would result since the value `10.2` would 
need to be truncated to the integer value `10 ` to be assigned to `num2`.
In such cases, Java will only perform such an assignment if explicity
told to, e.g.,<br><br>
`int num2 = (int)num1;`
<br><br>
Any type within parentheses such as `(int)` is called a `unary cast 
operator`.
<br><br>
**Arithmetic Operators**<br><br>
Binary operators `+`, `-`, `*`, `/`, `%` (mod)<br>
Integer division - truncated result. Occurs when both operands
are of integer type, e.g.,<br>
`5/2 -> 4`<br><br>
Real Division - real result. Occurs when at least one of the
operands is floating-point type,<br>
`5/2.0 -> 2.5`<br><br>
Thus, `num1/num2` gives an integer or real result depending
on the data types of variables `num1` and `num2`.
<br><br>
**Operator Precedence**<br><br>
Subexpressions are evaluated before the overall expression that they
are part of when parenteses are used, e.g.,
<br><br>
`(2 + 3) * 4 --> 20`
<br><br>
When parentheses are NOT used, Java has an `operator precedence table`
that indicates which operators have precedence (i.e., are evaluated
before other operators). In the Java operator precedence table, 
multiplication (`*`) has higher precedence than addition (`+`). Therefore,
if the same expression were given without parentheses, the result would be
as follows,<br><br>
`2 + 3 * 4 --> 14`<br><br>
When there is a tie between the precedence of two or more operators,
they have defined to either evaluate left-to-right or right-to-left in
the operator precedence table,<br><br>
`12 / 6 / 2 -> 1`<br><br>
An example of an operator that evaluates right-to-left is the
assignment operator (`=`),<br><br>
`num1 = num2 = 0;`
<br><br>
Here `num2` is assigned to 0 first, and then
`num2` (which contains 0), is assigned to `num1`. Note that left-to-right
evaluation for the assignment operator would not make sense.
<br><br>
There is also operator precedence related to the Boolean operators logical-and (`&&`)
and logical-or (`||`). Logical-and has higher precedence than logical-or in Java.

### WHAT TO DO<br>
- Replace the instances of `<operator>` with the appropriate operator.
- `Execute the file` and make any other needed changes to execute properly.
  (Make sure that you get the results indicated in the line comments)
- `Run the predefined tests` (click Tests icon in the left column under Tools) and correct any logic errors. 
