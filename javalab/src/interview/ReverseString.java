package interview;

/*Write a Java Program to reverse a string without using String inbuilt
function.*/
public class ReverseString {

    public String reverseStringWithoutBuiltIn ( String name) {

        String reverseString = "";
        char[] nameArray = name.toCharArray();
        for (int i = nameArray.length; i > 0 ; i--) {
//            reverseString= reverseString.concat( String.valueOf( nameArray[i-1]));
             reverseString += nameArray[i-1];
        }

        return reverseString;
    }

    // Alternative method using StringBuilder
    public String reverseStringWithoutBuiltUsingBuilder(String name) {
        StringBuilder reverseString = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseString.append(name.charAt(i));
        }
        return reverseString.toString();
    }

    public static void main(String[] args) {
        String reverseString = "name";
        System.out.println( "Reversed String is : "+new ReverseString().reverseStringWithoutBuiltIn( reverseString) );
    }
}
