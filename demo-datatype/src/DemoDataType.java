public class DemoDataType {
  public static void main(String[] args) {
    // I Love Java
// 
// 

// Date Type: Primitives
// 1. (Store Integer) byte, short, int, long
// 2. (Store number with decimal place) float, double
// 3. (Store Single Character) char
// 4. (Store ture or false) boolean

// Variable
// ! 1. int

int x = 3;
int y = 7;
System.out.println("x");
System.out.println(x);
System.out.println(x);

// Re-assign value 10 into variable x
x = 10;
System.out.println(x); // 10

y = 100;
// int y = 100;

// sysout enter (Short Cut)

// Variable name convention
// 1. Must be started with a-z
// 2. Camel Case
int w1 = 2;
// int tutorName = 3; (Noun.)

int a = 4;
// Declaration for variable type
int j;
// Same variable name can be declared once only.
// Assingment
j = 4;

// declartion and 
int w =10;

// ! 1. int

// ! double
double d1 = 4.4;
double d2 = 4.22543;
System.out.println(d2);

double d3;
d3 = 5.64;
System.out.println(d3);

// +, -, *, /
int x2 = 6 + 1;
System.out.println(x2); //7
int x3 = 9;

// from right to left
x2 = x3;

int x4 = 10;
x2 = 7 + x4;
System.out.println(x2); //17

// ! add 3 to itself
x2 = x2 + 8; // 25
System.out.println(x2);

// byte, short, int, long (Store integer)

byte b1 = 3;
short s1 = 3;
int i1 = 3;
long l1 = 3;

//! byte (-128 to 127)
//! short (-32xxx to 32xxx)
//! int (-21億.x to 21 億.x)
//! long (2^63)
b1 = -128;
s1 = 32767;
i1 = 2_147_483_647;
i1 = i1 +1;
System.out.println(i1); // -2147483648 (overflow)

// You intend to write int value in to 22億
// 1. Prepare an long value 22億 (right hand side)
// 2. Assign a Value into long variable (left hand side)
// l1 = 2_200_000_000; // system error (you cannot prepare an int value 22 億)
l1 = 2_000_000_000L;
l1 = l1 + 3L;
System.out.println(l1);
l1 = l1 + 2_000_000_000L;
System.out.println(l1);

// int + int = int
// long + int -> long + long -> long
long l2 = 2_200_000_000L + 5;
System.out.println(l2);

// 
int i8 = 9;
// byte b9 = i8; // what is the type of i8? ooo... it is int, sorry not ok.
// byte b9 = i8; // int variable -> unsafe.

byte b10 = 3; // direct value -> safe.
short s11 = 100; // is ok
// short s11 = i8; // unsafe
 

    // ! the range of int value should solve the majority of the problem in sysy
    // so we don't use long as a default type of variable for storing integer.

    // boolean (either true or false)
    boolean b9 = true;
    b9 = false;

    int result = 10;

    int johnAge = 64;
    boolean isElderly = johnAge >= 65; // formula / definition
    System.out.println(isElderly); // false

    boolean isMale = false;

    // ! char
    // single quote
    // assign char value 'a' into char variable
    char c1 = 'a';
    System.out.println(c1); // a
    c1 = '$';
    c1 = '+';
    c1 = 'a';
    char c2 = 'A';

    System.out.println(c1 == c2); // false, because java is case sensitive

    char lastName = '張';
    System.out.println(lastName);
    // We cannot assign a bigger range of variable to smaller range of variable (by default)
    // Force assignment
    byte b40 = (byte) 129L;
    System.out.println(b40); // -127

    // ! float (store decimal number)
    // 3.14159 is double value
    // so unsafe (assign double value to float variable)
    float f1 = 3.1415976f;

    // Problem
    f1 = 0.3f + 0.4f;
    System.out.println(f1); // 0.700000005

  }
}
