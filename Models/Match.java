package Models;

public class Match {
    private Team team1;
    private Team team2;
    private int score1;
    private int score2;
    private String result;

    public Match(Team t1, Team t2) {
        this.team1 = t1;
        this.team2 = t2;
    }

    public void setScores(int s1, int s2) {
        this.score1 = s1;
        this.score2 = s2;

        if (s1 > s2) {
            result = team1.getTeamName() + " won!";
        } else if (s2 > s1) {
            result = team2.getTeamName() + " won!";
        } else {
            result = "Match Draw!";
        }
    }

    public void showMatch() {
        System.out.println("\n===== MATCH RESULT =====");
        System.out.println(team1.getTeamName() + " : " + score1);
        System.out.println(team2.getTeamName() + " : " + score2);
        System.out.println("Result: " + result);
    }
}
