import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - Banner Builder using HashMap and Collections Framework
 * Demonstrates Encapsulation, Modularity, and Reusability
 */
public class BannerUC8 {

    public static void main(String[] args) {

        // Build pattern map
        Map<Character, String[]> patternMap = buildPatternMap();

        // Display message
        displayBanner("OOPS", patternMap);
    }

    /**
     * Builds and returns a HashMap of character patterns.
     *
     * @return Map containing character keys and 7x9 string patterns as values
     */
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        map.put('P', new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "        *",
                " *     * ",
                "  *****  "
        });

        return map;
    }

    /**
     * Displays banner message using nested loops and StringBuilder.
     *
     * @param message    The message to display
     * @param patternMap The HashMap containing character patterns
     */
    public static void displayBanner(String message, Map<Character, String[]> patternMap) {

        // Outer loop for each row
        for (int row = 0; row < 7; row++) {

            StringBuilder sb = new StringBuilder();

            // Inner loop for each character in message
            for (int col = 0; col < message.length(); col++) {

                char ch = message.charAt(col);

                if (patternMap.containsKey(ch)) {
                    sb.append(patternMap.get(ch)[row]).append("   ");
                }
            }

            System.out.println(sb.toString());
        }
    }
}
