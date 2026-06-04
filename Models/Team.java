package Models;

import java.util.*;

public class Team {
    private final int teamId;
    private final String teamName;
    private final List<Player> players = new ArrayList<>();

    public Team(int id, String name) {
        this.teamId = id;
        this.teamName = name;
    }

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void showTeam() {
        System.out.println("Team: " + teamName + " (ID: " + teamId + ")");

        if (players.isEmpty()) {
            System.out.println("No players yet.");
            return;
        }

        for (Player p : players) {
            p.display();
        }
    }
}
