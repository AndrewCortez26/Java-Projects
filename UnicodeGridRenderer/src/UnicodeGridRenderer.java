import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.*;

public class UnicodeGridRenderer {

    public static void renderGridFromGoogleDoc(String docUrl) {
        Map<Integer, Map<Integer, Character>> gridMap = new HashMap<>();
        int maxX = 0, maxY = 0;

        try {
            URL url = new URL(docUrl);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                // Skip lines that don't match expected format
                if (!line.contains("U+")  !=line.contains("x=")  !=line.contains("y=")) {
                    continue;
                }

                // Extract the Unicode code point
                int unicodeStart = line.indexOf("U+") + 2;
                int unicodeEnd = line.indexOf(" ", unicodeStart);
                if (unicodeEnd == -1) unicodeEnd = line.indexOf("(", unicodeStart);
                String hexCode = line.substring(unicodeStart, unicodeEnd).trim();
                char character = (char) Integer.parseInt(hexCode, 16);

                // Extract x and y coordinates
                int xStart = line.indexOf("x=") + 2;
                int xEnd = line.indexOf(",", xStart);
                int x = Integer.parseInt(line.substring(xStart, xEnd).trim());

                int yStart = line.indexOf("y=") + 2;
                int yEnd = line.indexOf(")", yStart);
                int y = Integer.parseInt(line.substring(yStart, yEnd).trim());

                // Update maximum bounds
                if (x > maxX) maxX = x;
                if (y > maxY) maxY = y;

                // Store character in grid map
                gridMap.computeIfAbsent(y, k -> new HashMap<>()).put(x, character);
            }

            reader.close();
// Print the grid
            for (int y = 0; y <= maxY; y++) {
                StringBuilder row = new StringBuilder();
                for (int x = 0; x <= maxX; x++) {
                    char ch = gridMap.getOrDefault(y, Collections.emptyMap()).getOrDefault(x, ' ');
                    row.append(ch);
                }
                System.out.println(row);
            }

        } catch (Exception e) {
            System.err.println("Error reading or parsing the document: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String publicDocTextURL = "https://docs.google.com/document/d/e/2PACX-1vQGUck9HIFCyezsrBSnmENk5ieJuYwpt7YHYEzeNJkIb9OSDdx-ov2nRNReKQyey-cwJOoEKUhLmN9z/.pub";
        renderGridFromGoogleDoc(publicDocTextURL);
    }
}