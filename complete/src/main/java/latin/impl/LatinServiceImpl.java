package latin.impl;

import latin.service.LatinService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Service
public class LatinServiceImpl implements LatinService {

    private static final Map<String, String> chars = new HashMap<>();

    @PostConstruct
    public void init() {
        chars.put("а", "a");
        chars.put("ә", "а'");
        chars.put("б", "b");
        chars.put("в", "v");
        chars.put("г", "g");
        chars.put("ғ", "g'");
        chars.put("д", "d");
        chars.put("е", "e");
        chars.put("ё", "e");
        chars.put("ж", "j");
        chars.put("з", "z");
        chars.put("и", "i");// TODO: 11/26/17
        chars.put("й", "y'");// TODO: 11/26/17
        chars.put("к", "k");
        chars.put("қ", "q");
        chars.put("л", "l");
        chars.put("м", "m");
        chars.put("н", "n");
        chars.put("ң", "n'");
        chars.put("о", "o");
        chars.put("ө", "o'");
        chars.put("п", "p");
        chars.put("р", "r");
        chars.put("с", "s");
        chars.put("т", "t");
        chars.put("у", "y'");
        chars.put("ұ", "u");
        chars.put("ү", "u'");
        chars.put("ф", "f");
        chars.put("х", "h");
        chars.put("ц", "c");// TODO: 11/26/17
        chars.put("ч", "c'");
        chars.put("ш", "s'");
        chars.put("щ", "shch");// TODO: 11/26/17
        chars.put("ъ", "'");// TODO: 11/26/17
        chars.put("ы", "y");
        chars.put("і", "i");
        chars.put("ь", "'");// TODO: 11/26/17
        chars.put("э", "e");// TODO: 11/26/17
        chars.put("ю", "uy");// TODO: 11/26/17
        chars.put("я", "ya");// TODO: 11/26/17
    }

    @Override
    public String convertToLatin(String origin) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < origin.length(); i++) {
            char temp = origin.charAt(i);
            if (Character.isLetter(temp)) {
                String converted = chars.get(String.valueOf(temp).toLowerCase());
                if (Character.isLowerCase(temp)) {
                    builder.append(converted != null ? converted : "");
                } else {
                    builder.append(converted != null ? converted.toUpperCase() : "");
                }
            } else builder.append(temp);
        }
        return builder.toString();
    }
}