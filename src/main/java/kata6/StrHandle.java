package kata6;

public class StrHandle {
    public static String strConcat(String s, String s1) {
        return s + s1;
    }

    public static String strToLowerCase(String s) {
        return s.toLowerCase();
    }

    public static String strToUpperCase(String s) {
        return s.toUpperCase();
    }

    public static String strRemoveChar(String s, char a) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != a) result+= s.charAt(i);
        }
        return result;
    }

    public static String strRemoveChar(String s, int a) {
        if (a > 0 && a < s.length()) return s.substring(0,a-1) + s.substring(a);
        return "";
    }

    public static String strGetChar(String s, int i) {
        if (i > 0 && i < s.length()) return ""+s.charAt(i-1);
        return "";
    }
}