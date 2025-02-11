import java.io.*;
import java.net.*;
import java.util.*;

public class Data {
    private static final String FILE_URL = "https://barttorvik.com/2025_team_results.csv";
    private static final String FILE_PATH = "src/2025_team_results.csv"; // Local file path

    public static void main(String[] args) {
        try {
            downloadFile(FILE_URL, FILE_PATH); // Download the latest CSV
            List<Team> teams = readTeamsFromCSV(FILE_PATH); // Read and process the file
            for (Team t : teams) {
                System.out.println(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void downloadFile(String fileUrl, String filePath) throws IOException {
        System.out.println("Downloading latest data from: " + fileUrl);
        URL url = new URL(fileUrl);
        try (InputStream in = url.openStream();
             FileOutputStream out = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("File downloaded successfully.");
        }
    }

    private static List<Team> readTeamsFromCSV(String filePath) throws IOException {
        List<Team> teams = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean firstLine = true;
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; // Skip header row
                    continue;
                }

                String[] data = line.split(",");
                if (teams.size() >= 64) break; // Stop after 64 teams

                String teamName = data[1];
                double offEff = Double.parseDouble(data[4]);
                int offEffRank = Integer.parseInt(data[5]);
                double defEff = Double.parseDouble(data[6]);
                int defEffRank = Integer.parseInt(data[7]);
                double strengthOfSchedule = Double.parseDouble(data[15]);
                double nonConfSOS = Double.parseDouble(data[16]);
                int rank = Integer.parseInt(data[0]);
                double winningPct = Double.parseDouble(data[8]); // Barthag

                teams.add(new Team(teamName, winningPct, strengthOfSchedule, nonConfSOS, rank, defEff, offEff, defEffRank, offEffRank));
            }
        }
        return teams;
    }
}
