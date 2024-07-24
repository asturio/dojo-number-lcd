package de.lv1871.dojo.converter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class NumberToLcdTest {

    private final NumberToLcd cut = new NumberToLcd();
    private static final String EOL = System.lineSeparator();

    @Test
    void testDigit0() {
        // @formatter:off
        String expected = " _ " + EOL
                        + "| |" + EOL
                        + "|_|" + EOL;
        // @formatter:on
        assertLcdEquals(cut.convertToLcd(0), expected);
    }

    @Test
    void testDigit1() {
        // @formatter:off
        String expected = "   " + EOL
                        + "  |" + EOL
                        + "  |" + EOL;
        // @formatter:on
        assertLcdEquals(cut.convertToLcd(1), expected);
    }

    @Test
    void testDigit2() {
        // @formatter:off
        String expected = " _ " + EOL
                        + " _|" + EOL
                        + "|_ " + EOL;
        // @formatter:on
        assertLcdEquals(cut.convertToLcd(2), expected);
    }

    @Test
    void testDigitMinus9() {
        // @formatter:off
        String expected = EOL +  EOL +  EOL;
        // @formatter:on
        assertLcdEquals(cut.convertToLcd(-9), expected);
    }

    @Test
    void testNumber12() {
        // @formatter:off
        String expected = "    _ " + EOL
                        + "  | _|" + EOL
                        + "  ||_ " + EOL;
        // @formatter:on
        assertLcdEquals(cut.convertToLcd(12), expected);
    }

    @Test
    void testNumber1234567890() {
        // @formatter:off
        String expected = "    _  _     _  _  _  _  _  _ "+ EOL
                        + "  | _| _||_||_ |_   ||_||_|| |"+ EOL
                        + "  ||_  _|  | _||_|  ||_| _||_|"+ EOL;
        // @formatter:on
        assertLcdEquals(cut.convertToLcd(1234567890), expected);
    }

    private void assertLcdEquals(String[] zeilen, String expected) {
        assertThat(zeilen).isNotNull();
        assertThat(cut.toString(zeilen)).isEqualTo(expected);
    }

}
