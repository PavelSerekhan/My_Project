package com.company;

public class Wheel {
    public static void main(String[] args) {
        String[] phrase = {
                "Vsup mne",
                "Trah mi",
                "ebi menia",
                "vali ot menia",
                "idi za mnoi",
                "zopa iz zopy",
                "hui pizda"
        };
        int[] letterCount = new int[32];
        for (int count = 0; count < phrase.length; count++){
            String current = phrase[count];
            char[] letters = current.toCharArray();
            for (int count2 = 0; count2 < letters.length; count2++){
                char lett = letters[count2];
                if ((lett >= 'A') & (lett <= 'X')){
                    letterCount[lett - 'A']++;
                }
            }
        }
        for (char count = 'A'; count <= 'X'; count++){
            System.out.print(count + ": " + letterCount[count - 'A'] + " ");
            if (count == 'M'){
                System.out.println();
            }
        }
        System.out.println();

    }
}
