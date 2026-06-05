package methods.Recursion;

public class StringReverse {
    static String reverseString(StringBuilder str, int start, int end) {
        if(str.length() == 0) throw new IllegalArgumentException("Provide a String.");

        if (start >= end)   return str.toString();

        char temp = str.charAt(start);
        str.setCharAt(start, str.charAt(end));
        str.setCharAt(end, temp);
        return reverseString(str, start + 1, end - 1);
    }
}
