/**
 *
 * NumericalChameleon 3.0.0 - more than an unit converter - a NumericalChameleon
 * Copyright (c) 2001-2020 Dipl.-Inf. (FH) Johann Nepomuk Loefflmann, All Rights
 * Reserved, <http://www.numericalchameleon.net>.
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package net.numericalchameleon.util.spokennumbers;

public class DutchNumber extends SpokenNumber {

    private final static String field[][] = {
        {"één", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"},
        {"elf", "twaalf", "dertien", "veertien", "vijftien", "zestien", "zeventien", "achttien", "negentien"},
        {"tien", "twintig", "dertig", "veertig", "vijftig", "zestig", "zeventig", "tachtig", "negentig"}
    },
            amount[][] = {
        {"duizend", "duizend"},
        {"miljoen", "miljoen"}
    },
            NULL = "nul",
            MINUS = "minus",
            EINS = "één",
            EINE = "één",
            EIN = "",
            UND = "en",
            HUNDERT = "honderd";
    protected String _1to9[] = {EINS, "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen"};

    public DutchNumber() {
        super();
    }

    public DutchNumber(long number) throws Exception {
        super(number);
    }

    public DutchNumber(String number) throws Exception {
        super(number);
    }

    @Override
    protected int getSupportedDigits() {
        return 9;
    }

    @Override
    public String getSoundDir() {
        return "dutch";
    }

    /**
     * wird zum Konvertieren der Zahl in Silben benötigt,
     * Ergebnis wird in den Vektor syllables gespeichert,
     * Vectorinhalt hängt abstract von numberType
     */
    @Override
    protected void convert2Syllables() throws Exception {
        if (number.charAt(0) == '-') {
            number = number.substring(1);
            syllables.add(MINUS);
        }

        if (numberType == NUMBER) {
            number2digits();
            // die Zahlentriple abarbeiten
            if (number.equalsIgnoreCase("0")) {
                syllables.add(NULL);
            } else {
                int counter = amount.length - 1;
                for (int i = MAX_DIGITS - 3; i > 0; i -= 3) {
                    xtriple(i, i == 3 ? EIN : EINE, amount[counter][0], amount[counter][1]);
                    counter--;
                }
                triple(0, EINS);
            }
        } else if (numberType == DIGITS) { // digits
            fillSyllables(NULL, _1to9);
        }
    }

    private void triple(int index, String smallestNumber) {
        if (digits[index + 2] > 0) {
            // "honderd", not "een honderd", but "twee honderd" for example
            if ((digits[index + 2] - 1) > 0) {
                syllables.add(field[0][digits[index + 2] - 1]);
            }

            syllables.add(HUNDERT);
            if ((digits[index + 1] == 0) && (digits[index] == 1)) {
                syllables.add(UND);
            }
        }

        if ((digits[index + 1] == 0) && (digits[index] == 1)) // XXXX01
        {
            syllables.add(smallestNumber);                    // ein, eins, eine (je nachdem)
        } else if ((digits[index + 1] == 1) && (digits[index] > 0)) // XXXX11
        {
            syllables.add(field[1][digits[index] - 1]);   // elf, zwölf, ...
        } else if ((digits[index + 1] == 1) && (digits[index] == 0)) // XXXX10
        {
            syllables.add(field[2][digits[index + 1] - 1]);   // zehn, zwanzig, ...
        } else if (digits[index + 1] != 1) // XXXX2X oder XXXX0X
        {
            if (digits[index + 0] > 0) // XXXX21
            {
                syllables.add(field[0][digits[index] - 1]); // ein, zwei, drei, ...
            }
            if (digits[index + 1] > 0) // XXXX2X
            {
                if (digits[index + 0] > 0) // XXXX21
                {
                    syllables.add(UND);                            // und
                }
                syllables.add(field[2][digits[index + 1] - 1]); // zehn, zwanzig,...
            }
        }
    }

    // index = Begin des Tripels
    // minimum = String, der die kleinste Zahl des Tripels kennzeichnet (z. B. EINE Million)
    // singular = z. B. Million
    // plural = z. B. Millionen
    private void xtriple(int index, String minimum, String singular, String plural) {
        if ((digits[index] + digits[index + 1] + digits[index + 2]) > 0) {
            triple(index, minimum);
            int sum = digits[index] + digits[index + 1] * 10 + digits[index + 2] * 100;
            if (sum >= 2) {
                syllables.add(plural);
            } else {
                syllables.add(singular);
            }
        }
    }

    /**
     * gibt Nummer in deutschen Worten zurück.
     * @param number die zu konvertierende Zahl
     */
    public static String toString(long number) throws Exception {
        return (new DutchNumber(number)).toString();
    }

    public static String toString(String number) throws Exception {
        return (new DutchNumber(number)).toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < syllables.size(); i++) {
            sb.append(syllables.get(i).toString());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
