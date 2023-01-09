import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringclassTest {
    @DisplayName("Test check for Isogram")
    @Test
    void checkIsogram() {
        Stringclass stringServicesJavaObject = new Stringclass();
        assertFalse(stringServicesJavaObject.checkIsogram("GeekForGeek"));
        assertTrue(stringServicesJavaObject.checkIsogram("algorithm"));
        assertFalse(stringServicesJavaObject.checkIsogram("datastructures"));
        assertFalse(stringServicesJavaObject.checkIsogram("machinelearning"));
        assertTrue(stringServicesJavaObject.checkIsogram("importance"));
    }
    @DisplayName("Test check for Panagram")
    @Test
    void checkPanagram() {
        Stringclass stringServicesJavaObject = new Stringclass();
        assertTrue(stringServicesJavaObject.checkPanagram("AbCDefGhIJklmnoPQRStuvWXyZ234"));
        assertTrue(stringServicesJavaObject.checkPanagram("Pack my box with five dozen liquor jugs"));
        assertTrue(stringServicesJavaObject.checkPanagram("Waltz, bad nymph, for quick jigs vex"));
        assertFalse(stringServicesJavaObject.checkPanagram("machinelearning"));
        assertFalse(stringServicesJavaObject.checkPanagram("importance"));
    }
    @DisplayName("Test check for Anagram")
    @Test
    void checkAnagram() {
        Stringclass stringServicesJavaObject = new Stringclass();
        assertTrue(stringServicesJavaObject.checkAnagram("Listen", "silent"));
        assertFalse(stringServicesJavaObject.checkAnagram("geeksforgeeks", "geeks"));
        assertTrue(stringServicesJavaObject.checkAnagram("a gentleman", "elegant man"));
        assertTrue(stringServicesJavaObject.checkAnagram("geeksforgeeks", "forgeeksgeeks"));
        assertTrue(stringServicesJavaObject.checkAnagram("angel", "glean"));
    }
}


