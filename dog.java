public class dog {
    String name;
    boolean isMale;
    int puppies;
    String[] doggy = new String[4]; // Initialize array with size 4

    // Method to return the dog's name
    String tawag() {
        return "Dog's name is: " + name;
    }

    // Method to return the number of puppies
    String bilang() {
        return "Number of puppies: " + puppies;
    }
    String bark(){
        return "woof! woof!";
    }
}
