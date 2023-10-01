public class Player extends Essence {

    int maxHealingAttempts = 4;
    double maxHealingPercentage = 0.3;
    int MaxHealth = health;

    public Player() {
    }

    @Override
    public void attack(Essence target) {
        System.out.println("    Игрок атакует    ");
        super.attack(target);
    }

    public void heal() {
            if (health <= 0) {
                System.out.println("Здоровье меньше 0, исцеление невозможно");
            }  else if (health > MaxHealth/2) {
                System.out.println("Игроку не нужно лечение");
            } else if (health <= MaxHealth / 2 && maxHealingAttempts > 0) {
                double hpHelling = MaxHealth * maxHealingPercentage;
                health += (int) hpHelling;
                System.out.println("Игрок применил исцеление " + "Здоровье=" + health);
                maxHealingAttempts--;
            } else {
                System.out.println("Достигнут лимит исцелений");
            }
    }

    @Override
    public String toString() {
        return "Player{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", health=" + health +
                ", damageMin=" + damageMin +
                ", damageMax=" + damageMax +
                '}';
    }
}
