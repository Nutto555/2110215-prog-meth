package logic;

import java.util.ArrayList;

public class Region {
    private String name;
    private ArrayList<Player> playerList;
    private ArrayList<Quest> questList;

    public Region(String name) {
        playerList = new ArrayList<>();
        questList = new ArrayList<>();
        setName(name);
    }

    public int getPlayerCount() {
        return playerList.size();
    }

    public double getRegionRank() {
        double sum = 0;
        for (Player player : playerList) {
            sum += player.getRank();
        }
        return (double) Math.round(sum / getPlayerCount() * 100d) / 100d;
    }

    public ArrayList<Quest> getAvailableQuests(Player viewer) {
        ArrayList<Quest> quests = new ArrayList<>();
        for (Quest quest : questList) {
            if (quest.getStatus().equals(Status.AVAILABLE) && quest.getAuthor() != viewer) {
                quests.add(quest);
            }
        }
        return quests;
    }

    public void addPlayerToRegion(Player p) {
        playerList.add(p);
    }

    public void addQuestToRegion(Quest q) {
        questList.add(q);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            name = "Nowhere";
        }
        this.name = name;
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public ArrayList<Quest> getQuestList() {
        return questList;
    }

    public void setQuestList(ArrayList<Quest> questList) {
        this.questList = questList;
    }
}
