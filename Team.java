public class Team {
    private double winningPct;
    private double strengthOfSchedule;
    private double nonConferenceSOS;
    private int rank;
    private double defEff;
    private double offEff;
    private String teamName;
    private int offEffRank;
    private int defEffRank;

    public Team(String tN, double wP, double SOS, double nSOS, int ra, double dEf, double oEf, int dEfRank, int oEfRank) {
        teamName = tN;
        winningPct = wP;
        strengthOfSchedule = SOS;
        nonConferenceSOS = nSOS;
        rank = ra;
        defEff = dEf;
        offEff = oEf;
        defEffRank = dEfRank;
        offEffRank = oEfRank;
    }
    public double getWinningPct() {
        return winningPct;
    }
    public double getSOS() {
        return strengthOfSchedule;
    }
    public double getnSOS() {
        return nonConferenceSOS;
    }
    public int getRank() {
        return rank;
    }
    public double getdEf() {
        return defEff;
    }
    public double getoEf() {
        return offEff;
    }
    public int getdEfRank() {
        return defEffRank;
    }
    public int getoEfRank() {
        return offEffRank;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setWinningPct(double wP) {
        winningPct = wP;
    }
    public void setStrengthOfSchedule(double SOS) {
        strengthOfSchedule = SOS;
    }
    public void setNonConferenceSOS(double nSOS) {
        nonConferenceSOS = nSOS;
    }
    public void setRank(int ra) {
        rank = ra;
    }
    public void setDefEff(double dEf) {
        defEff = dEf;
    }
    public void setOffEff(double oEf) {
        offEff = oEf;
    }
    public void setDefEffRank(int dEfRank) {
        defEffRank = dEfRank;
    }
    public void setOffEffRank(int oEfRank) {
        offEffRank = oEfRank;
    }
    public String toString() {
        return "Rank: "+rank+" | Team: " +teamName+" | Winning Percentage: "+winningPct +
                " | Strength of Schedule: "+strengthOfSchedule+" | Non-Conference Strength of Schedule: "
                +nonConferenceSOS+" | Defense Efficiency: "+defEff+" | Offense Efficiency: "+offEff + "" +
                " | Defense Efficiency Rank: " + defEffRank + " | Offense Efficiency Rank: " + offEffRank;
    }
}

