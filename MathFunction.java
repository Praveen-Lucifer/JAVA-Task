import java.lang.Math;

public class MathFunction{
  public static void main(String arge []){

//abs()-Absulute Returns the absulute value of argument Value. 
	System.out.println("abs(): " + Math.abs(40.1258545));

//cbrt()-CubeRoot Returns the cube root of the parameter value.
	System.out.println("cbrt(): " + Math.cbrt(125));

//sqrt()-SqureRoot Returns the square root of the parameter value
	System.out.println("sqrt(): " + Math.sqrt(16));

//signum()-Sign of a number Returns the sign of the number.
	System.out.println("signum(): " + Math.signum(-5413));

//rint()-Roundof Returns the double value of that is closest to parameter and equal to mathamatical integer.
	System.out.println("rint(): " + Math.rint(1.95));

//ceil()- Returns the value of parameter rounded upto its nearest integer.
	System.out.println("ceil(): " + Math.ceil(0.87));

//floor()- Returns the value of parameter rounded down towards nearest integer.
	System.out.println("floor(): " + Math.floor(5.9));

//random()-Returns the random number between 0 and 1.
	System.out.println("random(): " + Math.random());

//cbrt()-pow Power Returns the value of parameter one to the power of value two.
	System.out.println("pow(): " + Math.pow(2,5));

//max()-Max Returns the number with the highest value.
	System.out.println("max(): " + Math.max(-25,25));

//max()-Min Returns the number with the lowest value.
	System.out.println("min(): " + Math.min(-25,25));

//max()-Min Returns the number with the lowest value.
	System.out.println("min(): " + Math.min(-25,25));

//copySign()-copySign Returns the first floating point parameter with the sign of second floating parameter value.
	System.out.println("copySign(): " + Math.copySign(-25,25));

//max()-Min Returns the number with the lowest value.
	System.out.println("min(): " + Math.min(-25,25));

//exp()-Returns the value of e^x.
	System.out.println("exp(): " + Math.exp(1));

//expm1()-Returns the value of e^x-1.
	System.out.println("expm1(): " + Math.expm1(1));

//getExponent()-Returns the unbiased exponent used in parameter.
	System.out.println("getExponent(): " + Math.getExponent(1234.5678));

//hypot()-Returns the squareroot(x^2 + y^2) withou intermediate of underflow or overflow.
	System.out.println("hypot(): " + Math.hypot(2,3));

//IEEE()IEEEremainder returns the IEEE754 Standard value.
//Formula for IEEE754 a/b=value a-(b*value)
	System.out.println("IEEEremainder(): " + Math.IEEEremainder(10,10));

//nextAfter()-Returns the floationg number adjacent to the parameter 1 in the direction to the parameter 2.
	System.out.println("nextAfter(): " + Math.nextAfter(2,3));

//nextUp()--Returns the floationg point value adjacent to the parameter 1 in the direction of positive infinity.
	System.out.println("nextUp: " + Math.nextUp(1));

//round()-Returns the value of the parameter rounded to its nearest integer.
	System.out.println("round(): " + Math.round(1.556));

//acos()-Returns the value of cos.
	System.out.println("acos(): " + Math.acos(-1));

//asin()-Returns the value of sin.
	System.out.println("asin(): " + Math.asin(-1));

//atan()-Returns the value of .
	System.out.println("atan(): " + Math.atan(1));

//atan2()-Returns the value of .
	System.out.println("atan2(): " + Math.atan2(1,2.5));

//cos()-Returns the value of .
	System.out.println("cos(): " + Math.cos(1));

//cosh()-Returns the value of .
	System.out.println("cosh(): " + Math.cosh(1));

//log()-Returns the value of .
	System.out.println("log(): " + Math.log(1));

//log10()-Returns the value of .
	System.out.println("log10(): " + Math.log10(10));

//log1p()-Returns the value of .
	System.out.println("log1p(): " + Math.log1p(10));

//sin()-Returns the value of .
	System.out.println("sin(): " + Math.sin(1));

//sinh()-Returns the value of .
	System.out.println("sinh(): " + Math.sinh(1));

//tan()-Returns the value of .
	System.out.println("tan(): " + Math.tan(1));

//tanh()-Returns the value of .
	System.out.println("tanh(): " + Math.tanh(1));

//toDegrees()-Returns the value of .
	System.out.println("toDegrees(): " + Math.toDegrees(Math.PI/4));

//toRadians()-Returns the value of .
	System.out.println("toRadians(): " + Math.toRadians(1));

//ulp()-Returns the value of .
	System.out.println("ulp(): " + Math.ulp(1));
  }
}