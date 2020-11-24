package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Character[][] arr;
    private static int count = 0;
    private static char mark;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        arr = new Character[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ' ';
            }
        }

        String[] inputTab;

        do {
            System.out.println("Input command: ");
            String input = scanner.nextLine();
            inputTab = input.split(" ");
            if (inputTab.length < 3 && inputTab[0].equals("start")) {
                System.out.println("Bad parameters");
            } else if (inputTab[0].equals("exit")) {
                System.exit(0);
            }
        } while (inputTab.length != 3);

        if (inputTab[1].equals("user") && inputTab[2].equals("user")) {
            print(arr);
            userVsUser();
        } else if (inputTab[1].equals("user") && inputTab[2].equals("easy")) {
            print(arr);
            userXVsEasyAiO();
        } else if (inputTab[1].equals("easy") && inputTab[2].equals("user")) {
            print(arr);
            userOVsEasyAiX();
        } else if (inputTab[1].equals("easy") && inputTab[2].equals("easy")) {
            print(arr);
            easyAiVsEasyAi();
        } else if (inputTab[1].equals("user") && inputTab[2].equals("medium")) {
            //TODO
            print(arr);
            userXVsMediumAiO();
        } else if (inputTab[1].equals("medium") && inputTab[2].equals("user")) {
            //TODO
            print(arr);
            userOVsMediumAiX();
        } else if (inputTab[1].equals("medium") && inputTab[2].equals("medium")) {
            //TODO
            print(arr);
            mediumAiVsMediumAi();
        } else if (inputTab[1].equals("easy") && inputTab[2].equals("medium")) {
            //TODO
            print(arr);
            easyAiOVsMediumAiX();
        } else if (inputTab[1].equals("medium") && inputTab[2].equals("easy")) {
            //TODO
            print(arr);
            mediumXAiVseasyAiO();
        } else if (inputTab[1].equals("easy") && inputTab[2].equals("hard")) {
            //TODO
            print(arr);
            easyX_hardO();
        } else if (inputTab[1].equals("medium") && inputTab[2].equals("hard")) {
            //TODO
            print(arr);
            mediumX_hardO();
        } else if (inputTab[1].equals("hard") && inputTab[2].equals("hard")) {
            //TODO
            print(arr);
            hardX_hardO();
        } else if (inputTab[1].equals("hard") && inputTab[2].equals("medium")) {
            //TODO
            print(arr);
            hardX_mediumO();
        } else if (inputTab[1].equals("hard") && inputTab[2].equals("easy")) {
            //TODO
            print(arr);
            hardX_easyO();
        } else if (inputTab[1].equals("user") && inputTab[2].equals("hard")) {
            //TODO
            print(arr);
            userX_hardO();
        } else if (inputTab[1].equals("hard") && inputTab[2].equals("user")) {
            //TODO
            print(arr);
            hardX_userO();
        }
//TODO AI VS AI

    }

    private static void hardX_userO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"hard\"");
                randomBotMove();
            } else {
                mark = 'O';
                System.out.print("Enter the coordinates: ");
                fillTheCell();

            }
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void userX_hardO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';

                System.out.print("Enter the coordinates: ");
                fillTheCell();

            } else {
                mark = 'O';
                System.out.println("Making move level \"hard\"");
                randomBotMove();

            }
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void hardX_easyO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"hard\"");
            } else {
                mark = 'O';
                System.out.println("Making move level \"easy\"");
            }

            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void hardX_mediumO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"hard\"");
            } else {
                mark = 'O';
                System.out.println("Making move level \"medium\"");
            }

            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void hardX_hardO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"hard\"");
            } else {
                mark = 'O';
                System.out.println("Making move level \"hard\"");
            }

            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void mediumX_hardO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"medium\"");
            } else {
                mark = 'O';
                System.out.println("Making move level \"hard\"");
            }

            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void easyX_hardO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"easy\"");
            } else {
                mark = 'O';
                System.out.println("Making move level \"hard\"");
            }

            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void mediumXAiVseasyAiO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"easy\"");
            } else {
                mark = 'O';
                System.out.println("Making move level \"medium\"");
            }

            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void easyAiOVsMediumAiX() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"medium\"");
            } else {
                mark = 'O';
                System.out.println("Making move level \"easy\"");
            }

            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void mediumAiVsMediumAi() {
        do {
            if (count % 2 == 0) {
                mark = 'X';

            } else {
                mark = 'O';
            }
            System.out.println("Making move level \"medium\"");
            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void userOVsMediumAiX() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"medium\"");
                randomBotMove();


            } else {
                mark = 'O';
                System.out.print("Enter the coordinates: ");
                fillTheCell();

            }
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void userXVsMediumAiO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.print("Enter the coordinates: ");
                fillTheCell();

            } else {
                mark = 'O';
                System.out.println("Making move level \"medium\"");
                randomBotMove();

            }
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void easyAiVsEasyAi() {
        do {
            if (count % 2 == 0) {
                mark = 'X';

            } else {
                mark = 'O';
            }
            System.out.println("Making move level \"easy\"");
            randomBotMove();
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void userOVsEasyAiX() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.println("Making move level \"easy\"");
                randomBotMove();


            } else {
                mark = 'O';
                System.out.print("Enter the coordinates: ");
                fillTheCell();

            }
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void userXVsEasyAiO() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.print("Enter the coordinates: ");
                fillTheCell();

            } else {
                mark = 'O';
                System.out.println("Making move level \"easy\"");
                randomBotMove();

            }
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void userVsUser() {
        do {
            if (count % 2 == 0) {
                mark = 'X';
                System.out.print("Enter the coordinates: ");
                fillTheCell();

            } else {
                mark = 'O';
                System.out.print("Enter the coordinates: ");
                fillTheCell();

            }
            count++;
            checkStatus();
        } while (!checkStatus());
        if (count == 10) {
            System.out.println("Draw");
        }
    }

    private static void randomBotMove() {
        Random random = new Random();
        int i = random.nextInt(4);
        int i1 = random.nextInt(4);

        if (i == 1 && i1 == 3 && arr[0][0] == ' ') {
            arr[0][0] = mark;
            print(arr);

        } else if (i == 1 && i1 == 2 && arr[1][0] == ' ') {
            arr[1][0] = mark;
            print(arr);

        } else if (i == 1 && i1 == 1 && arr[2][0] == ' ') {
            arr[2][0] = mark;
            print(arr);

        } else if (i == 2 && i1 == 3 && arr[0][1] == ' ') {
            arr[0][1] = mark;
            print(arr);

        } else if (i == 2 && i1 == 2 && arr[1][1] == ' ') {
            arr[1][1] = mark;
            print(arr);

        } else if (i == 2 && i1 == 1 && arr[2][1] == ' ') {
            arr[2][1] = mark;
            print(arr);

        } else if (i == 3 && i1 == 3 && arr[0][2] == ' ') {
            arr[0][2] = mark;
            print(arr);

        } else if (i == 3 && i1 == 2 && arr[1][2] == ' ') {
            arr[1][2] = mark;
            print(arr);

        } else if (i == 3 && i1 == 1 && arr[2][2] == ' ') {
            arr[2][2] = mark;
            print(arr);

        }

    }

    private static boolean checkStatus() {
        if ((checkColumn(arr, 'X')) ||
                (checkRow(arr, 'X')) ||
                (checkDiagonal1(arr, 'X')) ||
                (checkDiagonal2(arr, 'X'))) {
            System.out.println("X wins");
            return true;
        } else if ((checkColumn(arr, 'O')) ||
                (checkRow(arr, 'O')) ||
                (checkDiagonal1(arr, 'O')) ||
                (checkDiagonal2(arr, 'O'))) {
            System.out.println("O wins");
            return true;
//        } else if (anyEmptyField(arr)) {
        } else
            return false;
    }

    private static void fillTheCell() {

        Scanner scanner = new Scanner(System.in);


        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            int i1 = scanner.nextInt();

            if (i > 3 || i < 1 || i1 > 3 || i1 < 1) {
                System.out.println("Coordinates should be from 1 to 3!");
                System.out.print("Enter the coordinates: ");
                fillTheCell();
            } else if (i == 1 && i1 == 3 && arr[0][0] == ' ') {
                arr[0][0] = mark;
                print(arr);

            } else if (i == 1 && i1 == 2 && arr[1][0] == ' ') {
                arr[1][0] = mark;
                print(arr);

            } else if (i == 1 && i1 == 1 && arr[2][0] == ' ') {
                arr[2][0] = mark;
                print(arr);
            } else if (i == 2 && i1 == 3 && arr[0][1] == ' ') {
                arr[0][1] = mark;
                print(arr);

            } else if (i == 2 && i1 == 2 && arr[1][1] == ' ') {
                arr[1][1] = mark;
                print(arr);

            } else if (i == 2 && i1 == 1 && arr[2][1] == ' ') {
                arr[2][1] = mark;
                print(arr);

            } else if (i == 3 && i1 == 3 && arr[0][2] == ' ') {
                arr[0][2] = mark;
                print(arr);

            } else if (i == 3 && i1 == 2 && arr[1][2] == ' ') {
                arr[1][2] = mark;
                print(arr);

            } else if (i == 3 && i1 == 1 && arr[2][2] == ' ') {
                arr[2][2] = mark;
                print(arr);

            } else {
                System.out.println("This cell is occupied! Choose another one!");
//                System.out.print("Enter the coordinates: ");
                fillTheCell();
            }
            //if
        } else {
            System.out.println("You should enter numbers!");
            System.out.print("Enter the coordinates: ");
            fillTheCell();
        }
    }

    private static void print(Character[][] arr) {
        System.out.println("---------");
        System.out.println("| " + arr[0][0] + " " + arr[0][1] + " " + arr[0][2] + " |");
        System.out.println("| " + arr[1][0] + " " + arr[1][1] + " " + arr[1][2] + " |");
        System.out.println("| " + arr[2][0] + " " + arr[2][1] + " " + arr[2][2] + " |");
        System.out.println("---------");

    }

    private static boolean checkRow(Character[][] arr, char symbol) {
        for (int row = 0; row < 3; row++) {
            boolean win = true;
            for (int column = 0; column < 3; column++) {
                if (arr[row][column] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkColumn(Character[][] arr, char symbol) {
        for (int column = 0; column < 3; column++) {
            boolean win = true;
            for (int row = 0; row < 3; row++) {
                if (arr[row][column] != symbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    private static boolean checkDiagonal1(Character[][] arr, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (arr[i][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDiagonal2(Character[][] arr, char symbol) {
        for (int i = 0; i < 3; i++)
            if (arr[i][(3 - 1) - i] != symbol) {
                return false;
            }
        return true;
    }
}
