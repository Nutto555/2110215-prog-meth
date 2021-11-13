package penguin;

public class FighterPenguin extends Penguin {
    private int pow;

    public FighterPenguin(String name, int hp, int pow, String catchphrase) {
        super(name, hp, catchphrase);
        setPow(pow);
    }

    public int attack(Penguin target) {
        int damage = getPow();
        target.setHp(target.getHp() - damage);
        return damage;
    }

    public String toString() {
        return super.toString();
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        pow = Math.max(0, pow);
        this.pow = pow;
    }
}
