import java.util.ArrayList;
import java.util.List;

public class SearchEvenProgram {

    public static void main(String[] args) {
        // Initialize Data1
        ArrayList<ArrayList<Integer>> Data1 = new ArrayList<>();
        Data1.add(new ArrayList<>(List.of(1, 1, 3, 1, 5)));
        Data1.add(new ArrayList<>(List.of(1, 1, 3, 1, 5)));
        Data1.add(new ArrayList<>(List.of(1, 1, 3, 1, 5)));
        Data1.add(new ArrayList<>(List.of(1, 1, 3, 1, 5)));
        Data1.add(new ArrayList<>(List.of(1, 1, 3, 1, 5)));

        // Initialize Data2
        ArrayList<ArrayList<Integer>> Data2 = new ArrayList<>();
        Data2.add(new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        Data2.add(new ArrayList<>(List.of(-2, -1, 2, 1)));
        Data2.add(new ArrayList<>());  // Empty row
        Data2.add(new ArrayList<>(List.of(2, 2, 2)));

        // Call SearchEven on Data1 and display results
        ArrayList<String> evenLocationsData1 = SearchEven(Data1);
        Display_Locations(evenLocationsData1);

        // Call SearchEven on Data2 and display results
        ArrayList<String> evenLocationsData2 = SearchEven(Data2);
        Display_Locations(evenLocationsData2);
    }

    // Method to search for even numbers and return their locations
    public static ArrayList<String> SearchEven(ArrayList<ArrayList<Integer>> data) {
        ArrayList<String> locations = new ArrayList<>();
        boolean foundEven = false;

        for (int row = 0; row < data.size(); row++) {
            for (int col = 0; col < data.get(row).size(); col++) {
                if (data.get(row).get(col) % 2 == 0) {  // Check if even
                    locations.add("Row: " + row + ", Col: " + col);
                    foundEven = true;
                }
            }
        }

        // If no even numbers were found, return -1
        if (!foundEven) {
            locations.add("-1");
        }

        return locations;
    }

    // Method to display the locations of the even numbers
    public static void Display_Locations(ArrayList<String> locations) {
        if (locations.size() == 1 && locations.get(0).equals("-1")) {
            System.out.println("No even numbers found.");
        } else {
            for (String location : locations) {
                System.out.println(location);
            }
        }
    }
}
