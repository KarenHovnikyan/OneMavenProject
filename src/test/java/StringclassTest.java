import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringclassTest {

    @DisplayName("Test check for Equals")
    @Test
    void checkEquals() {
        Stringclass stringServicesJavaObject = new Stringclass();
        assertFalse(stringServicesJavaObject.checkEquals("GeekForGeek","GeekFoGeek"));
        assertFalse(stringServicesJavaObject.checkEquals("GeekForGeek","GeekFor"));
        assertTrue(stringServicesJavaObject.checkEquals("GeekForGeek","GeekForGeek"));
        assertTrue(stringServicesJavaObject.checkEquals("Geek","Geek"));
    }
    @DisplayName("Test check for length")
    @Test
    void checkLength() {
        Stringclass stringServicesJavaObject = new Stringclass();
        assertFalse(stringServicesJavaObject.checkLength("GeekForGeek",9));
        assertTrue(stringServicesJavaObject.checkLength("GeekForGeek",11));
        assertFalse(stringServicesJavaObject.checkLength("GeekFor",110));
        assertTrue(stringServicesJavaObject.checkLength("Geek",4));
    }

    @DisplayName("Test check for Char At")
    @Test
    void checkCharAt() {
        Stringclass stringServicesJavaObject = new Stringclass();
        assertFalse(stringServicesJavaObject.checkCharAt("some test text",10,'T'));
        assertFalse(stringServicesJavaObject.checkCharAt("some test text",0,'t'));
        assertTrue(stringServicesJavaObject.checkCharAt("some test text",2,'m'));
        assertTrue(stringServicesJavaObject.checkCharAt("some test text",3,'e'));
    }

    @DisplayName("Test check for  Sub String")
    @Test
    void checkSubString() {
        Stringclass stringServicesJavaObject = new Stringclass();
        assertFalse(stringServicesJavaObject.checkSubString("some test text","test",5,7));
        assertFalse(stringServicesJavaObject.checkSubString("some test text","some",0,2));
        assertTrue(stringServicesJavaObject.checkSubString("some test text","some",0,4));
        assertTrue(stringServicesJavaObject.checkSubString("some test text","test",5,9));
    }

    @DisplayName("Test check for  Index Of")
    @Test
    void checkIndexOf() {
        Stringclass stringServicesJavaObject = new Stringclass();
        assertEquals(stringServicesJavaObject.checkIndexOf("some test text","test"),5);
        assertEquals(stringServicesJavaObject.checkIndexOf("some test text","some"),0);
    }
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


