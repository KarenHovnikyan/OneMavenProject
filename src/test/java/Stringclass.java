import java.util.Arrays;

public class Stringclass {

    public boolean checkEquals(String inputString1, String inputString2) {
        return inputString1.equals(inputString2);
    }
    public boolean checkLength(String inputString, int length) {
        return inputString.length() == length;
    }

    public boolean checkCharAt(String inputString, int index, char simbole) {
        return inputString.charAt(index) == simbole;
    }

    public boolean checkSubString(String inputString, String subString, int start, int end) {
        return inputString.substring(start,end).equals(subString);
    }

    public int checkIndexOf(String inputString, String characterWanted) {
        return inputString.indexOf(characterWanted);
    }

    public boolean checkIsogram(String inputString)
    {
        inputString = inputString.toLowerCase();
        int stringLength = inputString.length();

        char[] characterArray = inputString.toCharArray();
        // This will help to sort the alphabets
        Arrays.sort(characterArray);
        for (int i = 0; i < stringLength - 1; i++) {
            if (characterArray[i] == characterArray[i + 1])
                return false;
        }
        return true;
    }
    public boolean checkPanagram(String inputString)
    {
        inputString = inputString.toLowerCase();
        boolean isAllAlphabetPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!inputString.contains(String.valueOf(ch))) {
                isAllAlphabetPresent = false;
                break;
            }
        }

        return isAllAlphabetPresent;
    }

    public boolean checkAnagram(String inputString1,
                                String inputString2)
    {
        inputString1 = inputString1.toLowerCase();
        inputString2 = inputString2.toLowerCase();
        int str1Length = inputString1.length();
        int str2Length = inputString2.length();
        if (str1Length != str2Length) {
            return false;
        }

        char[] str1 = inputString1.toCharArray();
        char[] str2 = inputString2.toCharArray();

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int index = 0; index < str1Length; index++) {
            if (str1[index] != str2[index])
                return false;
        }

        return true;
    }

}
