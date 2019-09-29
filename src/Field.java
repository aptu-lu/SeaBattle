public class Field {
    static char[][] cells = new char[10][10];
    static boolean gameIsOver = false;

    static void init() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '.';
            }
        }
    }

    static void showField() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                System.out.print(cells[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean gameOver() {
        M:
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                if (cells[i][j] == 'O') {
                    gameIsOver = false;
                    break M;
                } else {
                    gameIsOver = true;
                }
            }
        }
        return gameIsOver;
    }
}
