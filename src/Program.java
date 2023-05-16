import java.util.HashMap;

public class Program {

    private HashMap<String, String> hashmap;

    public Program() {
        this.hashmap = new HashMap<>();
    }

//    ASSIGNMENT-prints all the keys in the hashmap given as a parameter.
    public static void printKeys(HashMap<String, String> hashmap){
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

//    ASSIGNMENT-prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(key);
            }
        }
    }

//    ASSIGNMENT-prints the keys in the hashmap given as a parameter, which contain the string given as a parameter.
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String i : hashmap.keySet()) {
            if(i.contains(text)) {
                System.out.println(hashmap.get(i));
            }
        }
    }


    public static void main(String[] args) {
        Program program = new Program();
        HashMap<String, String> hashmap = new HashMap<>();

        hashmap.put("n.p", "no problem");
        hashmap.put("c.u", "see you");
        hashmap.put("t.m.i", "too much information");

        Program.printKeys(hashmap);
        System.out.println("---");
        Program.printKeysWhere(hashmap, "i");
        System.out.println("---");
        Program.printValuesOfKeysWhere(hashmap, ".p");
    }


}