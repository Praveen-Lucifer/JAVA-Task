import java.lang.String;

public class StringEX{
public static void main(String args[]){

	String value = "Batch 15 is TOXIC";

//contain method check wheather the given value is available in the given variable along with the case sensitive.
System.out.println(value.contains("TOXIC"));

//concat method is used to merge to different string and present it as single string.
System.out.println(value.concat(" by Birth"));

//equals method check whether the given variable and the given string is equal or not it is case sensitive and also conserned about space.
System.out.println(value.equals("Batch 15 is TOXIC"));

//equalsIgnoreCase method ignores the case sensitive and checks the value with the specified variable, also space conserned 
System.out.println(value.equalsIgnoreCase("BATCH 15 IS TOXIC"));

//tpUpperCase changes all the character to Capital Letter and toLowerCase change to small.
System.out.println(value.toUpperCase());
System.out.println(value.toLowerCase());

//length() returns the length of the variable along with spaces. 
System.out.println("length(): " + value.length());

//charAt() returns the character that has been available in the mentioned in the index value
System.out.println("chatAt(): " + value.charAt(0));

	String val = value.toUpperCase();
	System.out.println(val);

//compareTo() returns the negative value if both the variables are different.
System.out.println("compareTo(): " + value.compareTo("hello"));

//compareToIgnoreCase() returns the lexicographic zero value if the value of both variables are same.
System.out.println("compareToIgnoreCase(): " + value.compareToIgnoreCase("hello"));

//indexOf() returns the index value of specified character.
System.out.println("indexOf(): " + value.indexOf("s"));

//isEmpty() is used to check the given variable is empty or not.
System.out.println("isEmpty(): " + value.isEmpty());

//replace() is used to replace the specified word with the specified value.
System.out.println("replace(): " + value.replace("TOXIC","Vedappu"));

//substring() is used to get string that has been mentioned from start index to end index. 
System.out.println("substring(): " + value.substring(3,11));

//trim() is used to remove the space in the begining and at the end.
System.out.println("trim()" + value.trim());

//lastIndexof() takes the last index value of the letter given.
System.out.println("lastIndexOf()" + value.lastIndexOf('i'));

//hashCode()it returns the key from hashtable which holds your variable as value.
System.out.println("hashCode()" + value.hashCode());

//Changes the given data/input value in the specified format. 
System.out.println("format()" + value.format("%x",12));

//join()   is used to do delimiter and join parametraized values.
System.out.println("join(): " + value.join);

//
System.out.println("replaceAll(): " + value.replaceAll('i','t'));

`


}
}