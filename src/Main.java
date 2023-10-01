
public class Main {
    public static void main(String[] args) {
       Monster monster = new Monster();
       Player player = new Player();
       System.out.println(monster);
       System.out.println(player);
       while (player.health > 0 && monster.health > 0) {
           player.attack(monster);
           if (monster.health <= 0) {
               System.out.println("Монстр повержен");
               break;
           }
           monster.attack(player);
           if (player.health <= 0) {
               System.out.println("Игрок повержен");
               break;
           }
           player.heal();
       }
    }
}