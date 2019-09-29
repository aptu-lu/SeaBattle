public class Main {
    public static void main(String[] args) {
        Field.init();

        Ship.createShips();
        System.out.println("Game start!");
        do {
            Player.playerHit();
            Field.gameOver();
        } while (!Field.gameIsOver);
        Field.showField();
        System.out.println("Game over!");
    }
}
