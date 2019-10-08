import java.util.Scanner;

public class Player {
    private int hitX;
    private int hitY;


    void playerHit() {
        boolean isRetry;
        do {
                isRetry = false;
                do {
                    Field.showField();
                    System.out.println("Kuda strelyaem po X: ");
                    try {
                        hitX = Integer.parseInt(new Scanner(System.in).nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("vvedite 4islo!");
                        hitX = -1;
                    }
                } while (hitX < 0 | hitX > Field.cells.length);

                do {
                    Field.showField();
                    System.out.println("Kuda strelyaem po Y: ");
                    try {
                        hitY = Integer.parseInt(new Scanner(System.in).nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("vvedite 4islo!");
                        hitY = -1;
                    }
                } while (hitY < 0 | hitY > Field.cells.length);
                
                switch (Field.cells[hitX][hitY]){
                    case '.':
                        System.out.println("Mimo!");
                        Field.cells[hitX][hitY] = '-';
                        break;
                    case 'O':
                        System.out.println("Popal!");
                        Field.cells[hitX][hitY] = 'X';
                        break;
                    default:
                        System.out.println("Vi suda uje strelyali!");
                        isRetry = true;
                        break;
                }
            } while (isRetry);
        }
    }
