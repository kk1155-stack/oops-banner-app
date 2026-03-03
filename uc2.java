public class OOPS_Banner {

    public static void main(String[] args) {

        // O pattern (7x9)
        String[] O = {
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        };

        // P pattern (7x9)
        String[] P = {
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };

        // S pattern (7x9)
        String[] S = {
                "  *****  ",
                " *     * ",
                " *       ",
                "  *****  ",
                "       * ",
                " *     * ",
                "  *****  "
        };

        // Print O O P S
        for (int i = 0; i < 7; i++) {
            System.out.println(O[i] + " " + O[i] + " " + P[i] + " " + S[i]);
        }
    }
}
