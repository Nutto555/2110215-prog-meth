package penguin;

public class Penguin {
    private String name;
    private int hp;
    private int maxHp;
    private String catchphrase;

    public Penguin(String name, int hp, String catchphrase) {
        setName(name);
        setMaxHp(hp);
        setHp(hp);
        setCatchphrase(catchphrase);
    }

    public String toString() {
        return PenguinUtil.makeToString(this);
    }

    public String getSpeech() {
        return PenguinUtil.makeSpeech(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        hp = Math.min(hp, getMaxHp());
        hp = Math.max(0, hp);
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        maxHp = Math.max(maxHp, 0);
        this.maxHp = maxHp;
    }

    public String getCatchphrase() {
        return catchphrase;
    }

    public void setCatchphrase(String catchphrase) {
        this.catchphrase = catchphrase;
    }
}
