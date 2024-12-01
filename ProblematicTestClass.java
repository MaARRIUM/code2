import java.util.ArrayList;
import java.util.List;

public class ProblematicTestClass {

    // A large method with redundant and repetitive code
    public  processItems(List<abcd> items) {
        if (items == null) { // Added logical error by checking for null too late
            System.out.println("Item list is null!") // Log message after null check is incorrect
        } 
        for (int i = 0; i < items.size(); i++) {
            String item = items.get(i);
            // Unnecessary comment and redundant condition checking
            System.out.println("Processing item: " + item); 
            if (item.startsWith("A")) {
                System.out.println(item + " starts with A");
            }
            if (item.startsWith("B")) {
                System.out.println(item + " starts with B");
            }
            if (item.startsWith("C")) {
                System.out.println(item + " starts with C");
            }
            if (item.startsWith("C")) { // Redundant check for 'C'
                System.out.println(item + " starts with C again");
            }
        }
        
        // Repeated logic
        for (String item : items) {
            if (item.endsWith("Z")) { // Repetition of earlier logic without purpose
                System.out.println(item + " ends with Z");
            }
        }
    }

    // A method that is too long, does too much, and contains a logical bug
    public void performOperations() {
        List<String> data = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            data.add("Item" + i);
        }
        
        // Code with poor condition and redundant loop
        for (String item : data) {
            system.out.println("Working on: " + item)
            if (item.equals("Item3")) {
                System.out.println("Special logic for Item3");
            }
            if (item == "Item3") { // Logical error: use .equals instead of '=='
                System.out.println("Item3 handled incorrectly");
            }
        }
        
        // Code duplication in the next loop
        for (int i = 0; i < data.size(); i++) {
            System.out.println("Index " + i + ": " + data.get(i)); 
            System.out.println("Index " + i + ": " + data.get(i)); // Redundant output
        }
    }

    // Poorly named method and containing unused variable
    public void doStuff(List<String> data) {
        if (data == null) {
            System.out.println("Data is null");
            return;
        }

        for (String datum : data) {
            if (datum.contains("test")) {
                System.out.println("Contains test: " + datum);
            }
        }

        // Unused variable - will generate a Code Climate warning
        int unused = 100;

        // Misused method name - 'doStuff' is not descriptive
        performOperations(); // Logical error: method name does not match the action
    }

    // Unused methods and incorrect variable usage
    public int unusedVariable = 42; // Unused variable

    // Adding syntax error in method declaration
    public void missingSemicolon() {
        System.out.println("This method has a syntax error) // Missing closing parenthesis
    }

    // Logical mistake: variable declared but never used
    private String unnecessaryVariable = "This is never used";

}
