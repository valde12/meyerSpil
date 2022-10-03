package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnereTest {

    static Enere testYatzyFelt;
    static int[] TRUE_VAERDI_1 = new int[]{2,1,2,1,2,3};
    static int[] TRUE_VAERDI_2 = new int[]{2,1,2,1,2};
    static int[] FALSE_VAERDI_1 = new int[]{2,2,2,2,2,3};
    static int[] FALSE_VAERDI_2 = new int[]{2,2,2,2,2};
    static int RETURN_VAERDI_POINT = 2;
    @BeforeAll
    static void constructorTilFelt() {
        testYatzyFelt = new Enere("Navn");
    }

    @Test
     void skalReturnTrue_erMulig() {
        assertTrue(testYatzyFelt.erMulig(TRUE_VAERDI_1));
        assertTrue(testYatzyFelt.erMulig(TRUE_VAERDI_2));
    }

    @Test
    void skalReturnFalse_erMulig() {
        assertFalse(testYatzyFelt.erMulig(FALSE_VAERDI_1));
        assertFalse(testYatzyFelt.erMulig(FALSE_VAERDI_2));
    }

    @Test
    void skalReturnFalseNaarBrugtPoint_erMulig() {
        testYatzyFelt.setPoint(12);
        assertFalse(testYatzyFelt.erMulig(TRUE_VAERDI_1));
        assertFalse(testYatzyFelt.erMulig(TRUE_VAERDI_2));
    }

    @Test
    void skalReturnFalseNaarBrugtTerninger_erMulig() {
        testYatzyFelt.setTerninger(TRUE_VAERDI_1);
        assertFalse(testYatzyFelt.erMulig(TRUE_VAERDI_1));
        assertFalse(testYatzyFelt.erMulig(TRUE_VAERDI_2));
    }

    @Test
    void skalReturn2Point_beregnPoint() {
        assertEquals(RETURN_VAERDI_POINT, testYatzyFelt.beregnPoint(TRUE_VAERDI_1));
        assertEquals(RETURN_VAERDI_POINT, testYatzyFelt.beregnPoint(TRUE_VAERDI_2));
    }

    @Test
    void skalReturn0Point_beregnPoint() {
        assertEquals(0, testYatzyFelt.beregnPoint(FALSE_VAERDI_1));
        assertEquals(0, testYatzyFelt.beregnPoint(FALSE_VAERDI_2));
        assertEquals(0, testYatzyFelt.beregnPoint(new int[]{}));
    }
}