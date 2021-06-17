package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    private static final String COMMA_CHAR = ",";
    private static final String PERIOD_CHAR = ".";
    private static final String LINE_CHAR = "-";
    private static final String COLON_CHAR = ":";
    private static final String SEMICOLON_CHAR = ";";
    private static final String EXCLAMATION_MARK_CHAR = "!";
    private static final String QUESTION_MARK_CHAR = "?";
    private static final String SPACE_CHAR = " ";
    private static final String AY_CHAR = "ay";

    public static String pigIt(String sentence) {
        String[] word_mark={PERIOD_CHAR, COMMA_CHAR, LINE_CHAR, COLON_CHAR, SEMICOLON_CHAR, EXCLAMATION_MARK_CHAR, QUESTION_MARK_CHAR};
        String[] words = sentence.split(SPACE_CHAR);
        char character;
        boolean flag = true;

        for (int i = 0; i < words.length; i++){
            for (int j = 0; j < word_mark.length; j++)
                if(words[i].contains(word_mark[j]) == true)
                    flag = false;

            if (flag){
                character = words[i].charAt(0);
                words[i] = words[i].substring(1, words[i].length());
                words[i] = words[i].replace(words[i], words[i] + character + AY_CHAR);
            }
            flag = true;
        }
        return String.join(SPACE_CHAR, words);
    }
}
