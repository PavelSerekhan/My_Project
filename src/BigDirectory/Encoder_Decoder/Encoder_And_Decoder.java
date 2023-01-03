package Encoder_Decoder;

import java.util.Base64;

public class Encoder_And_Decoder {
    public static void main(String[] args) {
        String name = "Serakhan Pavel";
//кодировка
//        Base64.Encoder encoder = Base64.getEncoder();
        String encoded = Base64.getEncoder().encodeToString(name.getBytes());
        System.out.println(encoded);
//расшифровка
        Base64.Decoder decoder = Base64.getDecoder();
        String decoded = new String(decoder.decode(encoded));
        System.out.println(decoded);

    }

}
