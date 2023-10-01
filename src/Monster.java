public class Monster extends Essence{
    public Monster() {
    }
    @Override
    public void attack(Essence target) {
        System.out.println("    Монстр атакует    ");
        super.attack(target);
    }

    @Override
    public String toString() {
        return "Monster{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", health=" + health +
                ", damageMin=" + damageMin +
                ", damageMax=" + damageMax +
                '}';
    }
}
