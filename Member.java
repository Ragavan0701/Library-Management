import java.util.ArrayList;
import java.util.HashMap;

public class Member {
    private HashMap<String, ArrayList<String>> members = new HashMap<>();

    public void registerMember() {
        ArrayList<String> details = new ArrayList<>();
        System.out.print("Enter your name: ");
        String name = Main.sr.nextLine();
        System.out.print("Enter your age: ");
        String age = Main.sr.nextLine();
        System.out.print("Enter your department: ");
        String dept = Main.sr.nextLine();

        if (members.containsKey(name)) {
            System.out.println("Member already registered.");
        } else {
            details.add(age);
            details.add(dept);
            members.put(name, details);
            System.out.println("Member registered successfully!");
        }
    }
}
