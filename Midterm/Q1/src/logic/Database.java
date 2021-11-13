package logic;

import java.util.ArrayList;

public class Database {
    private ArrayList<Player> playerList;
    private ArrayList<Region> regionList;

    public Database() {
        playerList = new ArrayList<>();
        regionList = new ArrayList<>();
    }

    public Database(ArrayList<Player> playerList, ArrayList<Region> regionList) {
        setPlayerList(playerList);
        setRegionList(regionList);
    }

    public Player addPlayer(String name, Region region) throws Exception {
        for (Player player : playerList) {
            if (player.getName().equals(name)) {
                throw new Exception();
            }
        }
        Player player = new Player(name);
        playerList.add(player);
        region.addPlayerToRegion(player);
        return player;
    }

    public boolean addRegion(String name) {
        for (Region region : regionList) {
            if (region.getName().equals(name)) {
                return false;
            }
        }
        Region region = new Region(name);
        regionList.add(region);
        return true;
    }

    public Region getRegionByName(String name) {
        for (Region region : regionList) {
            if (region.getName().equals(name)) {
                return region;
            }
        }
        return null;
    }

    public void addQuest(Player author, Region region, String name, String description) {
        Quest quest = new Quest(author, region, name, description);
        region.addQuestToRegion(quest);
    }

    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    public ArrayList<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(ArrayList<Region> regionList) {
        this.regionList = regionList;
    }
}
