package ex1;

import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deputy deputy = new Deputy("77", "185", "Mark", "Zuker", 37, true,2121);
        Fraction fraction = new Fraction("POLICE",deputy);
        TheVerkhovnaRada theVerkhovnaRada = new TheVerkhovnaRada(fraction);

        List<TheVerkhovnaRada> theVerkhovnaRadasList = new ArrayList<>();
        theVerkhovnaRadasList.add(new TheVerkhovnaRada(fraction));
        theVerkhovnaRadasList.add(new TheVerkhovnaRada(new Fraction("POLICE", new Deputy("47", "135", "Kozak", "Bob", 37, true, 4999))));
        theVerkhovnaRadasList.add(new TheVerkhovnaRada(new Fraction("FIB", new Deputy("55", "199", "Mardak", "Bob", 37, true,4444))));
        theVerkhovnaRadasList.add(new TheVerkhovnaRada(new Fraction("FIB", new Deputy("88", "155", "Roma", "Bob", 66, true,666))));
        theVerkhovnaRadasList.add(new TheVerkhovnaRada(new Fraction("CITY HALL", new Deputy("100", "167", "Olaga", "Bob", 99, false))));

        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    theVerkhovnaRada.addFraction(theVerkhovnaRadasList);
                    break;
                case 2:
                    theVerkhovnaRada.removeFraction(theVerkhovnaRadasList);
                    break;
                case 3:
                    theVerkhovnaRada.showAllFractions(theVerkhovnaRadasList);
                    break;
                case 4:
                    theVerkhovnaRada.clearSpecificFraction(theVerkhovnaRadasList);
                    break;
                case 5:
                    theVerkhovnaRada.showSpecificFraction(theVerkhovnaRadasList);
                    break;
                case 6:
                    theVerkhovnaRada.addSpecificDeputyToSpecificFraction(theVerkhovnaRadasList);
                    break;
                case 7:
                    theVerkhovnaRada.removeDeputy(theVerkhovnaRadasList);
                    break;
                case 8:
                    theVerkhovnaRada.showListBriberTakers(theVerkhovnaRadasList);
                    break;
                case 9:
                    theVerkhovnaRada.showTheMostBriberTakers(theVerkhovnaRadasList);
                    break;
            }

        }


    }

    public static void menu() {
        System.out.println("Введіть:");
        System.out.println("1 - щоб додати фракцію");
        System.out.println("2 - щоб видалити конкренту фракцію");
        System.out.println("3 - щоб вивести усі фракції");
        System.out.println("4 - щоб очистити конкретну фракцію");
        System.out.println("5 - щоб вивести конкретну фракцію");
        System.out.println("6 - щоб додати депутата в фракцію");
        System.out.println("7 - щоб видалити депутата з фракції");
        System.out.println("8 - щоб вивести список хабарників");
        System.out.println("9 - щоб вивести найбільшого хабарника");

    }
}