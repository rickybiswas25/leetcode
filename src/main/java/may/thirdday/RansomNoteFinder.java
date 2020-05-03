package may.thirdday;

/**
 * Created by Deb
 * Date : 03/05/2020.
 */
/*Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Note:
You may assume that both strings contain only lowercase letters.*/
public class RansomNoteFinder {

    public boolean construct(String ransom, String magazine) {
        if (ransom == null && magazine == null) {
            return true;
        } else if (ransom == null || magazine == null) {
            return false;
        }
        char[] ransomChars = ransom.toCharArray();
        boolean isConstruct = true;
        for (char rChar : ransomChars) {
            String sChar = String.valueOf(rChar);
            if (magazine.contains(sChar)) {
                magazine = magazine.replaceFirst(sChar, "");
            } else {
                isConstruct = false;
                break;
            }
        }
        return isConstruct;
    }
}
