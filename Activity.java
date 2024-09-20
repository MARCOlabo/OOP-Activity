public class Activity {
    public static void main(String[] args) {
        dog aso = new dog(); // Create a new Dog object
        aso.name = "mark";
        aso.puppies = 4;

        aso.doggy[0] = "tang";
        aso.doggy[1] = "melo";
        aso.doggy[2] = "jucy";
        aso.doggy[3] = "lemon";

        System.out.println(aso.tawag());
        System.out.println(aso.bilang());
        System.out.println(aso.bark());

        for (int i = 0; i < aso.doggy.length; i++) { // Loop through the array
            System.out.println(aso.doggy[i]);
        }
    }
}
