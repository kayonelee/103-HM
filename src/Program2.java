import java.util.HashMap;

public class Program2 {

//    ASSIGNMENT-which prints all the values in the hashmap given as a parameter using the toString method of the Book objects.
    public static void printValues(HashMap<String,Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book.toString());
        }
    }

//    ASSIGNMENT-which prints only the Books in the given hashmap which name contains the given string. You can find out the name of a Book with the method getName.
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if(book.getName().contains(text)) {
                System.out.println(book.toString());
            }
        }
    }

    public static void main(String[] args) {

        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("walk", new Book("A walk to remember", 2002, "..."));
        hashmap.put("haven", new Book("Safe haven", 2013, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "haven");

    }
}