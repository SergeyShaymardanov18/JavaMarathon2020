package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player player1 = new Player(random.nextInt(11) + 90);
        Player player2 = new Player(random.nextInt(11) + 90);
        Player player3 = new Player(random.nextInt(11) + 90);
        Player player4 = new Player(random.nextInt(11) + 90);
        Player player5 = new Player(random.nextInt(11) + 90);
        Player player6 = new Player(random.nextInt(11) + 90);
        player1.info();

        // ждем пока выдохнеться 1 игрок
        while (Player.countPlayers == 6) {
            player1.run();
        }
        player1.info();

        // попробуем создать более 6 игроков
        Player player7 = new Player(random.nextInt(11) + 90);
        Player player8 = new Player(random.nextInt(11) + 90);
        System.out.println(Player.getCountPlayers());
        player1.info();
    }
}
