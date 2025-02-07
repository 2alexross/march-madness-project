public class Team {
    private double winningPct;
    private double strengthOfSchedule;
    private double nonConferenceSOS;
    private int rank;
    private double defEff;
    private double offEff;
    private String teamName;
    private int ELO;

    public Team(String tN, double wP, double SOS, double nSOS, int ra, double dEf, double oEf) {
        teamName = tN;
        winningPct = wP;
        strengthOfSchedule = SOS;
        nonConferenceSOS = nSOS;
        rank = ra;
        defEff = dEf;
        offEff = oEf;
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
    public String toString() {
        return "Team: "+teamName+" "+"Winning Percentage: " +winningPct+" Rank: "+rank;
    }
}

