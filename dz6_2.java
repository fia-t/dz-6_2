import java.util.*;

public class dz6_2 {
    public static void main(String[] args) {
        List<String> listWords = Arrays.asList("Alexx9800");
        uniqueSymbols(listWords);
    }

    private static Collection<Character> uniqueSymbols(List<String> listWords) {
        Set<Character> uniqueSymbols = new HashSet<>();
        for (String word : listWords) {
            for (Character character : word.toCharArray()) {
                uniqueSymbols.add(character);
            }
        }

        for (int i=0;i<uniqueSymbols.toArray().length; i++) {
            System.out.println(uniqueSymbols.toArray()[i]);
        }
        return uniqueSymbols;
    }
}
