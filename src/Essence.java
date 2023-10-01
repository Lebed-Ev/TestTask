import java.util.Random;

public class Essence {

    int attack;
    int defense;
    int health;
    int damageMin;
    int damageMax;

    public Essence() {
        Random r = new Random();
        attack = 1 + r.nextInt(30);
        defense = 1 + r.nextInt(30);
        health = 1 + r.nextInt(100);

        damageMin = 1 + r.nextInt(15);
        damageMax = 1 + r.nextInt(15);
        if (damageMin == damageMax) {
            damageMin = 1 + r.nextInt(15);
            damageMax = 1 + r.nextInt(15);
        }
        int tmp;
        if (damageMin > damageMax) {
            tmp = damageMax;
            damageMax = damageMin;
            damageMin = tmp;
        }
    }

    public void attack(Essence target) {
        int attackModifier = attack - target.defense + 1;
        attackModifier = Math.max(attackModifier, 1);

        Random r = new Random();

        for (int i = 0; i < attackModifier; i++) {
            int throwResult = 1 + r.nextInt(6);
            if (throwResult >= 5) {
                int damage = damageMin + r.nextInt(damageMax - damageMin + 1);
                target.health -= damage;
                System.out.println("Попадание\n"  + "Здоровье " + target.getClass() + " " + target.health);
                if(target.health <= 0) {
                    break;
                }
            } else {
                System.out.println("Промах");
            }
        }
    }

    @Override
    public String toString() {
        return "Essence{" +
                "attack=" + attack +
                ", defense=" + defense +
                ", health=" + health +
                ", damageMin=" + damageMin +
                ", damageMax=" + damageMax +
                '}';
    }
}


