import java.util.HashMap;
public class IOU {
    private HashMap<String, Double> debt;

    public IOU() {
        debt = new HashMap<>();
    }

//    ASSIGNMENT-saves the amount owed and the person owed to the IOU.
    public void setSum(String toWhom, double amount) {
        debt.put(toWhom, amount);
    }
//ASSIGNMENT-returns the amount owed to the person whose name is given as a parameter. If the person cannot be found, it returns 0.
    public double howMuchDoIOweTo(String toWhom) {
        return debt.getOrDefault(toWhom, 0.0);
    }
    public static void main(String[] args) {
//      MATT OWES ART AND MIKE
        System.out.println("");
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Art", 51.5);
        mattsIOU.setSum("Mike", 30);

        System.out.println("Value, owed to Art");
        System.out.println(mattsIOU.howMuchDoIOweTo("Art"));
        System.out.println("Value, owed to Mike");
        System.out.println(mattsIOU.howMuchDoIOweTo("Mike"));
        System.out.println("");

//ASSIGNMENT-When you set a new sum owed to a person when there is some money already owed to the same person, the old debt is forgotten.
        System.out.println("Updated value, owed to Art");
        mattsIOU.setSum("Art", 51.5); // FORGOTTEN
        mattsIOU.setSum("Art", 10.5);

        System.out.println(mattsIOU.howMuchDoIOweTo("Art"));
    }
}