import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating a List using the Collection interface
        Collection<String> myCollection = new ArrayList<>();

        // Adding elements to the collection
        myCollection.add("Java");
        myCollection.add("Python");
        myCollection.add("C++");
        myCollection.add("JavaScript");

        // Displaying the elements of the collection
        System.out.println("Elements in the collection:");
        for (String language : myCollection) {
            System.out.println(language);
        }

        // Checking if an element exists in the collection
       String searchLanguage = "Java";
        if (myCollection.contains("Python")) {
            System.out.println("Python" + " is present in the collection.");
        } else {
            System.out.println(searchLanguage + " is not present in the collection.");
        }

        // Removing an element from the collection
        String removeLanguage = "C++";
        myCollection.remove(removeLanguage);
        System.out.println(removeLanguage + " has been removed from the collection.");

        // Displaying the elements of the collection after removal
        System.out.println("Elements in the collection after removal:");
        for (String language : myCollection) {
            System.out.println(language);
        }

        // Clearing the collection
        myCollection.clear();
        System.out.println("Collection has been cleared.");
    }
}
