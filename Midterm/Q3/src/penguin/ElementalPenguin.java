package penguin;

public class ElementalPenguin extends FighterPenguin {
    private PenguinType type;

    public ElementalPenguin(String name, int hp, int pow, PenguinType type, String catchphrase) {
        super(name, hp, pow, catchphrase);
        setType(type);
    }

    public int getElementalAdvantage(Penguin target) {
        if (target instanceof ElementalPenguin) {
            if (getType().equals(PenguinType.FIRE)) {
                if (((ElementalPenguin) target).getType().equals(PenguinType.SNOW)) {
                    return 1;
                } else if (((ElementalPenguin) target).getType().equals(PenguinType.WATER)) {
                    return -1;
                }
                return 0;
            } else if (getType().equals(PenguinType.SNOW)) {
                if (((ElementalPenguin) target).getType().equals(PenguinType.WATER)) {
                    return 1;
                } else if (((ElementalPenguin) target).getType().equals(PenguinType.FIRE)) {
                    return -1;
                }
                return 0;
            } else if (getType().equals(PenguinType.WATER)) {
                if (((ElementalPenguin) target).getType().equals(PenguinType.FIRE)) {
                    return 1;
                } else if (((ElementalPenguin) target).getType().equals(PenguinType.SNOW)) {
                    return -1;
                }
                return 0;
            }
        }
        return 0;
    }

    public int attack(Penguin target) {
        int damage;
        if (getElementalAdvantage(target) == 1) {
            damage = 2 * getPow();
            target.setHp(target.getHp() - damage);
            return damage;
        } else if (getElementalAdvantage(target) == -1) {
            damage = getPow() / 2;
            target.setHp(target.getHp() - damage);
            return damage;
        }
        return super.attack(target);
    }

    public String toString() {
        return super.toString();
    }

    public PenguinType getType() {
        return type;
    }

    public void setType(PenguinType type) {
        this.type = type;
    }
}
