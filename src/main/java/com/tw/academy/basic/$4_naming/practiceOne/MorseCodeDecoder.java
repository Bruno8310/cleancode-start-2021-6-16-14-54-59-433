package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

    private static final String REGEX_RULE_FOR_NUMBER_TWO_AND_MORE_SPACE = "\\s{2,}";
    private static final String SPACE = " ";
    private static final String NULL_STRING = "null";
    private static final String EMPTY_STRING = "";

    public static String decode(String input) {

        String[] morseCodeLines = input.split(REGEX_RULE_FOR_NUMBER_TWO_AND_MORE_SPACE);
        StringBuilder decodeMorseCode = new StringBuilder();
        for (String morseCodeLine : morseCodeLines) {
            String [] morseCode = morseCodeLine.split(SPACE);
            for (String code: morseCode) {
                decodeMorseCode.append(MorseCode.get(code));
            }
            decodeMorseCode.append(SPACE);
        }
        return decodeMorseCode.toString().replaceAll(NULL_STRING, EMPTY_STRING).trim();
    }
}
