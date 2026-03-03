public class BannerUC6 {

    public static void main(String[] args) {

        // Populate banner at declaration by calling methods
        String[] banner = buildBanner(getOPattern(), getPPattern(), getSPattern());

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method to compose full banner from letter patterns
    public static String[] buildBanner(String[] o, String[] p, String[] s) {

        return new String[] {
            String.join("   ", o[0], p[0], s[0]),
            String.join("   ", o[1], p[1], s[1]),
            String.join("   ", o[2], p[2], s[2]),
            String.join("   ", o[3], p[3], s[3]),
            String.join("   ", o[4], p[4], s[4]),
            String.join("   ", o[5], p[5], s[5]),
            String.join("   ", o[6], p[6], s[6])
        };
    }

    // O Pattern (7x9)
    public static String[] getOPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " *     * "),
            String.join("", "*       *"),
            String.join("", "*       *"),
            String.join("", "*       *"),
            String.join("", " *     * "),
            String.join("", "  *****  ")
        };
    }

    // P Pattern (7x9)
    public static String[] getPPattern() {
        return new String[] {
            String.join("", " ******  "),
            String.join("", " *     * "),
            String.join("", " *     * "),
            String.join("", " ******  "),
            String.join("", " *       "),
            String.join("", " *       "),
            String.join("", " *       ")
        };
    }

    // S Pattern (7x9)
    public static String[] getSPattern() {
        return new String[] {
            String.join("", "  *****  "),
            String.join("", " *     * "),
            String.join("", " *       "),
            String.join("", "  *****  "),
            String.join("", "        *"),
            String.join("", " *     * "),
            String.join("", "  *****  ")
        };
    }
}
