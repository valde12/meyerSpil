package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnereTest {

    static Enere testYatzyFelt;

    @BeforeAll
    static void constructorTilFelt() {
        testYatzyFelt = new Enere("Navn");
    }

    @Test
     void skalReturnTrue_erMulig() {
        assertTrue(testYatzyFelt.erMulig(new int[]{2,1,2,1,2,3}));
        assertTrue(testYatzyFelt.erMulig(new int[]{2,1,2,1,2}));
    }

    @Test
    void skalReturnFalse_erMulig() {
        assertFalse(testYatzyFelt.erMulig(new int[]{2,2,2,2,2,3}));
        assertFalse(testYatzyFelt.erMulig(new int[]{2,2,2,2,2}));
    }

    @Test
    void skalReturnFalseNaarBrugtPoint_erMulig() {
        testYatzyFelt.setPoint(12);
        assertFalse(testYatzyFelt.erMulig(new int[]{2,1,2,1,2,3}));
        assertFalse(testYatzyFelt.erMulig(new int[]{2,1,2,1,2}));
    }

    @Test
    void skalReturnFalseNaarBrugtTerninger_erMulig() {
        testYatzyFelt.setTerninger(new int[]{1,1,2,2,2,3});
        assertFalse(testYatzyFelt.erMulig(new int[]{1,1,2,2,2,3}));
        assertFalse(testYatzyFelt.erMulig(new int[]{1,1,2,2,2}));
    }

    @Test
    void skalReturn2Point_beregnPoint() {
        assertEquals(2, testYatzyFelt.beregnPoint(new int[]{1,1,2,2,2,3}));
        assertEquals(2, testYatzyFelt.beregnPoint(new int[]{1,1,2,2,2}));
    }

    @Test
    void skalReturn0Point_beregnPoint() {
        assertEquals(0, testYatzyFelt.beregnPoint(new int[]{2,2,2,2,2,3}));
        assertEquals(0, testYatzyFelt.beregnPoint(new int[]{2,2,2,2,2}));
        assertEquals(0, testYatzyFelt.beregnPoint(new int[]{}));
    }
}