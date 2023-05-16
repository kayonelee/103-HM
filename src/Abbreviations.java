import java.util.HashMap;
public class Abbreviations {

    private HashMap<String, String> folder;

//    ASSIGNMENT-The class must have a constructor, which does not take any parameters.
    public Abbreviations() {
        this.folder = new HashMap<>();
    }

//    ASSIGNMENT-adds a new abbreviation and its explanation.
    public void addAbbreviation(String abbreviation, String explanation) {
        this.folder.put(abbreviation, explanation);
    }

//    ASSIGNMENT-checks if an abbreviation has already been added; returns true if it has and false if it has not.
    public boolean hasAbbreviation(String abbreviation) {
        if (this.folder.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

//     finds the explanation for an abbreviation; returns null if the abbreviation has not been added yet.
    public String findExplanationFor(String abbreviation) {
        if (this.folder.containsKey(abbreviation)) {
            return "Definition: " + this.folder.get(abbreviation);
        }
        return null; // WILL RETURN NULL IF VALUE HAS NOT BEEN ADDED
    }

    public static void main(String[] args) {

        //ADDING ABBREVIATIONS TO HASH MAP
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("imu", "i miss you");
        abbreviations.addAbbreviation("mia", "missing in action");
        abbreviations.addAbbreviation("brb", "be right back");

        //TRUE/FALSE IF ABBREVIATION EXISTS
        System.out.println(abbreviations.hasAbbreviation("imu"));
        System.out.println(abbreviations.hasAbbreviation("haha")); //FALSE-DOES NOT EXIST

        //CHECKING VALUE OF MIA & BRB
        System.out.println(abbreviations.findExplanationFor("mia"));
        System.out.println(abbreviations.findExplanationFor("brb"));
    }
}