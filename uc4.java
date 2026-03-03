public class OOPS_Banner_Array {

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

        // Array Creation – Empty array to hold 7 banner lines
        String[] banner = new String[7];

        // Array Population – Construct each line using String.join()
        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    O[i],
                    O[i],
                    P[i],
                    S[i]
            );
        }

        // Enhanced For Loop – Print each banner line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
