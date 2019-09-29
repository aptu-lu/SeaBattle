public class Main {
    public static void main(String[] args) {
        Field.init();
        Player player = new Player();
        Ship ship = new Ship();

        ship.createShips();
        System.out.println("Game start!");
        do {
            player.playerHit();
            Field.gameOver();
        } while (!Field.gameIsOver);
        Field.showField();
        System.out.println("Game over!");
    }
}
