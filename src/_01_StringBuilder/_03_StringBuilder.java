package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    	StringBuilder sb = new StringBuilder(str);
    	for(int i = 0; i<characters.length; i++) {
    		str = sb.append(characters[i]).toString();
    		System.out.println(str);
    	}
        return str;
    }
    
    public static String reverse(String str) {
    	StringBuilder sb = new StringBuilder(str);
    	str = sb.reverse().toString();
    	System.out.println(str);
    	return str;
    }
    
    public static String insert(String str, int index, char newChar) {
    	StringBuilder sb = new StringBuilder(str);
    	str = sb.insert(index, newChar).toString();
    	return str;
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	StringBuilder sb = new StringBuilder(str);
    	str = sb.delete(startIndex, endIndex).toString();
    	return str;
    }
}