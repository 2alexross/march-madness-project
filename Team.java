public class Team {
    private double winningPct;
    private double strengthOfSchedule;
    private double nonConferenceSOS;
    private int rank;
    private double defEff;
    private double offEff;
    private String teamName;
    private int ELO;

    public Team(String tN, double wP, double SOS, double nSOS, int ra, double dEf, double oEf, int e) {
        teamName = tN;
        winningPct = wP;
        strengthOfSchedule = SOS;
        nonConferenceSOS = nSOS;
        rank = ra;
        defEff = dEf;
        offEff = oEf;
        ELO = e;
    }
    public double getWinningPct() {
        return winningPct;
    }
    public double getStrengthOfSchedule() {
        return strengthOfSchedule;
    }
    public double getNonConferenceSOS() {
        return nonConferenceSOS;
    }
    public int getRank() {
        return rank;
    }
    public double getDefEff() {
        return defEff;
    }
    public double getOffEff() {
        return offEff;
    }
    public String getTeamName() {
        return teamName;
    }
    public int getELO() {
        return ELO;
    }
    public double setWinningPct(double wP) {
        winningPct = wP;
        return winningPct;
    }
    public double setStrengthOfSchedule(double SOS) {
        strengthOfSchedule = SOS;
        return strengthOfSchedule;
    }
    public double setNonConferenceSOS(double nSOS) {
        nonConferenceSOS = nSOS;
        return nonConferenceSOS;
    }
    public double setRank(int ra) {
        rank = ra;
        return rank;
    }
    public double setDefEff(double dEf) {
        defEff = dEf;
        return defEff;
    }
    public double setOffEff(double oEf) {
        offEff = oEf;
        return offEff;
    }
    public double setELO(int eLO) {
        ELO = eLO;
        return ELO;
    }
    public String toString() {
        return "Team: "+teamName+" "+"Winning Percentage: " +winningPct+" Rank: "+rank;
    }
}

