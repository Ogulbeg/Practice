package Tasks;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {

        String randomWord = "FFFaaaammmiiiilllyyyFamily";

        Set<String> family = new LinkedHashSet<>(Arrays.asList(randomWord.split("")));

        System.out.println(family);
    }
}
