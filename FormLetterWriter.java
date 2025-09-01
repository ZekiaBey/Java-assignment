public class FormLetterWriter {

    public static void main(String[] args) {
        displaySalutation("Kelly");
        displayLetter();

        displaySalutation("Christy", "Johnson");
        displayLetter();
    }

    // Overloaded method that takes one String parameter (last name)
    public static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName + ",");
    }

    // Overloaded method that takes two String parameters (first name and last name)
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
    }

    // Method to display the rest of the letter
    public static void displayLetter() {
        System.out.println("Thank you for your recent order.\n");
    }
}
