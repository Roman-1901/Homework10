import java.util.Arrays;
import java.util.Locale;

public class addon2 {
    public static void main(String[] args) {
        String fullName = "димонов димон димонович";
        char[] fullNameArray = fullName.toCharArray();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < fullNameArray.length; i++) {
            if (i == 0) {
                fullNameArray[i] = fullName.toUpperCase().charAt(i);
            }
            if (fullNameArray[i] == ' ') {
                fullNameArray[i + 1] = fullName.toUpperCase().charAt(i + 1);
            }
            result.append(fullNameArray[i]);
        }
        fullName = result.toString();
        System.out.print(fullName);
    }
}
