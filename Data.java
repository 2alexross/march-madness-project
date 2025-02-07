import java.io.*;
import java.util.*;

public class Data {
    public static void main(String[] args) {
        String file = "src/2025_team_results.csv"; // File path
        BufferedReader reader = null;
        String line = "";

        try {
            List<Team> teams = new ArrayList<>();
            reader = new BufferedReader(new FileReader(file));

            boolean firstLine = true; // Skip header
            while ((line = reader.readLine()) != null) {
                if (firstLine) {
                    firstLine = false; // Skip the first row
                    continue;
                }

                String[] data = line.split(","); // Assuming CSV is comma-separated
                if (teams.size() >= 64) break; // Stop after 64 teams

                String teamName = data[1]; // Column B (team name)
                double offEff = Double.parseDouble(data[4]); // Column E (AdjO)
                int offEffRank = Integer.parseInt(data[5]);// Column F (OE Rank)
                double defEff = Double.parseDouble(data[6]); // Column G (AdjD)
                int defEffRank = Integer.parseInt(data[7]); //Column H (de Rank)
                double strengthOfSchedule = Double.parseDouble(data[15]); // Column P (SOS)
                double nonConfSOS = Double.parseDouble(data[16]); // Column Q (Non-Conf SOS)
                int rank = Integer.parseInt(data[0]); // Column A (rank)
                double winningPct = Double.parseDouble(data[8]); // Column I (Barthag)

                // Create a new Team object
                Team team = new Team(teamName, winningPct, strengthOfSchedule, nonConfSOS, rank, defEff, offEff, defEffRank, offEffRank);
                teams.add(team);
            }

            reader.close();

            // Print teams to check
            for (Team t : teams) {
                System.out.println(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
