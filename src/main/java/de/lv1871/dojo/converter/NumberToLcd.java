package de.lv1871.dojo.converter;

public class NumberToLcd {
    public static final String EOL = System.lineSeparator();

    public NumberToLcd() {}

    public String[] convertToLcd(int number) {
        String[] lcd = new String[3];
        lcd[0] = "";
        lcd[1] = "";
        lcd[2] = "";
        if (number < 10) {
            lcd = convertDigit(number);
        } else {
            String numberAsString = String.valueOf(number);
            for (char c : numberAsString.toCharArray()) {
                int i = Integer.parseInt(String.valueOf(c));
                String[] strings = convertDigit(i);
                lcd[0] += strings[0];
                lcd[1] += strings[1];
                lcd[2] += strings[2];
            }
        }
        return lcd;
    }

    // Nur einzelne Digits
    private static String[] convertDigit(int number) {
        String[] lcd = new String[3];
        switch (number) {
            case 1:
                lcd[0] = "   ";
                lcd[1] = "  |";
                lcd[2] = "  |";
                break;
            case 2:
                lcd[0] = " _ ";
                lcd[1] = " _|";
                lcd[2] = "|_ ";
                break;
            case 3:
                lcd[0] = " _ ";
                lcd[1] = " _|";
                lcd[2] = " _|";
                break;
            case 4:
                lcd[0] = "   ";
                lcd[1] = "|_|";
                lcd[2] = "  |";
                break;
            case 5:
                lcd[0] = " _ ";
                lcd[1] = "|_ ";
                lcd[2] = " _|";
                break;
            case 6:
                lcd[0] = " _ ";
                lcd[1] = "|_ ";
                lcd[2] = "|_|";
                break;
            case 7:
                lcd[0] = " _ ";
                lcd[1] = "  |";
                lcd[2] = "  |";
                break;
            case 8:
                lcd[0] = " _ ";
                lcd[1] = "|_|";
                lcd[2] = "|_|";
                break;
            case 9:
                lcd[0] = " _ ";
                lcd[1] = "|_|";
                lcd[2] = " _|";
                break;
            case 0:
                lcd[0] = " _ ";
                lcd[1] = "| |";
                lcd[2] = "|_|";
                break;
            default:
                lcd[0] = "";
                lcd[1] = "";
                lcd[2] = "";
        }
        return lcd;
    }

    String toString(String[] zeilen) {
        StringBuilder builder = new StringBuilder();
        for (String s : zeilen) {
            builder.append(s).append(EOL);
        }
        return builder.toString();
    }
}
