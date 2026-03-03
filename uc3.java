public class OOPS_Banner_Refactored {

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

        // Print O O P S using String.join()
        for (int i = 0; i < 7; i++) {
            String line = String.join(" ",
                    O[i],
                    O[i],
                    P[i],
                    S[i]
            );
            System.out.println(line);
        }
    }
}
