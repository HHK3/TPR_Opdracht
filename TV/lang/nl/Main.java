package TV.lang.nl;

import java.util.Scanner;

public class Main {
    //Attributen
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Television myTelevision = new Television();

        while (true) {
            System.out.println("1. ON\n" +
                    "2. OFF\n" +
                    "3. CHANNEL UP\n" +
                    "4. CHANNEL DOWN\n" +
                    "5. VOLUME UP\n" +
                    "6. VOLUME DOWN\n" +
                    "7. SET CHANNEL\n" +
                    "8. SET VOLUME LEVEL\n" +
                    "9. EXIT\n");
            System.out.print("\nMaak uw keuze: ");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    myTelevision.turnOn();
                    break;
                case 2:
                    myTelevision.turnOff();
                    break;
                case 3:
                    myTelevision.channelUp();
                    break;
                case 4:
                    myTelevision.channelDown();
                    break;
                case 5:
                    myTelevision.volumeUp();
                    break;
                case 6:
                    myTelevision.volumeDown();
                    break;
                case 7:
                    if (myTelevision.isOn()) {
                        int choice = getNewChannel(); myTelevision.setChannel(choice);
                        break;
                    } else {
                        System.out.println("De TV staat niet aan.");
                        break;
                    }
                case 8:
                    if (myTelevision.isOn()) {
                        int choice1 = getNewVolumeLevel(); myTelevision.setVolume(choice1);
                        break;
                    } else {
                        System.out.println("De TV staat niet aan.");
                        break;
                    }
                case 9:
                    System.exit(0);
                default:
                    System.out.println("Die keuze staat niet in het menu\n");
            }


        }
    }

    public static int getNewChannel() {
        System.out.println("Op welk kanaal wil je de TV zetten?");
        int choice = scanner.nextInt();
        return choice;
    }

    public static int getNewVolumeLevel() {
        System.out.println("Op welk volume wil je de TV zetten?");
        int choice1 = scanner.nextInt();
        return choice1;
    }
}