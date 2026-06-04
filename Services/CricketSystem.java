package Services;

import Models.Match;
import Models.Player;
import Models.Team;
import java.util.*;

public class CricketSystem {

    private final List<Team> teams = new ArrayList<>();
    private final List<Match> matches = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    public CricketSystem() {
        System.out.println("Cricket System Loaded.");
    }

    private int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                int value = sc.nextInt();
                sc.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                sc.nextLine();
            }
        }
    }

    public void start() {
        int choice;
        do {
            System.out.println("\n===== CRICBASE MENU =====");
            System.out.println("1. Add Team");
            System.out.println("2. Add Player to Team");
            System.out.println("3. Show Teams");
            System.out.println("4. Search Player");
            System.out.println("5. Create Match");
            System.out.println("6. Show Matches");
            System.out.println("0. Exit");

            choice = readInt("Enter choice: ");

            switch (choice) {
                case 1: addTeam(); break;
                case 2: addPlayer(); break;
                case 3: showTeams(); break;
                case 4: searchPlayer(); break;
                case 5: createMatch(); break;
                case 6: showMatches(); break;
                case 0: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    private void addTeam() {
        int id = readInt("Enter Team ID: ");
        System.out.print("Enter Team Name: ");
        String name = sc.nextLine();
        teams.add(new Team(id, name));
        System.out.println("Team added successfully!");
    }

    private void addPlayer() {
        if (teams.isEmpty()) {
            System.out.println("No teams available. Add a team first.");
            return;
        }
        System.out.println("Select Team:");
        for (int i = 0; i < teams.size(); i++) {
            System.out.println((i + 1) + ". " + teams.get(i).getTeamName());
        }
        int choice = readInt("Enter team number: ");
        if (choice < 1 || choice > teams.size()) {
            System.out.println("Invalid team selection!");
            return;
        }
        Team selectedTeam = teams.get(choice - 1);
        int id = readInt("Enter Player ID: ");
        System.out.print("Enter Player Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Role (Batsman/Bowler): ");
        String role = sc.nextLine();
        selectedTeam.addPlayer(new Player(id, name, role));
        System.out.println("Player added successfully!");
    }

    private void searchPlayer() {
        System.out.print("Enter player name: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for (Team t : teams) {
            for (Player p : t.getPlayers()) {
                if (p.getName().equalsIgnoreCase(searchName)) {
                    System.out.println("Found in Team: " + t.getTeamName());
                    p.display();
                    found = true;
                }
            }
        }
        if (!found) System.out.println("Player not found.");
    }

    private void createMatch() {
        if (teams.size() < 2) {
            System.ou
