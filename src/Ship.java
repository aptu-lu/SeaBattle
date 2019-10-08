import java.util.Scanner;

public class Ship {
    private int shotX;
    private int shotY;
    static int numberOfShips;

    void createShips() {
        int count = 0;
        System.out.println("Skol'ko palub vi hotite sozdat'?");
        numberOfShips = Integer.parseInt(new Scanner(System.in).nextLine());
        do {
            do {
                Field.showField();
                System.out.println("Vvedite coordinatu X dlya korablya: ");
                try {
                    shotX = Integer.parseInt(new Scanner(System.in).nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("vvedite 4islo!");
                    shotX = -1;
                }
            } while (shotX < 0 | shotX > Field.cells.length);

            do {
                Field.showField();
                System.out.println("Vvedite coordinatu Y dlya korablya: ");
                try {
                    shotY = Integer.parseInt(new Scanner(System.in).nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("vvedite 4islo!");
                    shotY = -1;
                }
            } while (shotY < 0 | shotY > Field.cells.length);
            if (Field.cells[shotX][shotY] == '.') {
                Field.cells[shotX][shotY] = 'O';
                count++;
            } else {
                System.out.println("Sdes' uje stoit korabl'!");
            }
        } while (count != numberOfShips);
    }
}