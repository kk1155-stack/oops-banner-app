public class BannerUC5 {

    public static void main(String[] args) {

        // Declare and initialize array in a single statement using inline initialization
        String[] banner = {
            String.join("", "+", "-".repeat(38), "+"),
            String.join("", "|", "                                      ", "|"),
            String.join("", "|", "        WELCOME TO JAVA APP           ", "|"),
            String.join("", "|", "                                      ", "|"),
            String.join("", "|", "     Inline Initialization Demo       ", "|"),
            String.join("", "|", "                                      ", "|"),
            String.join("", "+", "-".repeat(38), "+")
        };

        // Enhanced for loop to print each line
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
