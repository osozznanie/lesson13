package ex1;

import java.util.*;

public class TheVerkhovnaRada {
    private Fraction fraction;

    public void addFraction(List<TheVerkhovnaRada> theVerkhovnaRadasList) {
        System.out.println("Write name of fraction: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();

        while (iterator.hasNext()) {
            TheVerkhovnaRada next = iterator.next();

            if (name.equalsIgnoreCase(next.fraction.getName())) {
                System.out.println("Fraction with name " + name.toUpperCase() + " has already");
                throw new Error();
            }
        }
        if (name.length() <= 1) {
            System.out.println("Check your name of fraction");
            throw new Error();
        } else {
            Fraction fractionName = new Fraction(name.toUpperCase());
            theVerkhovnaRadasList.add(new TheVerkhovnaRada(fractionName));
            System.out.println(name.toUpperCase() + " successfully added");
        }

    }

    public void removeFraction(List<TheVerkhovnaRada> theVerkhovnaRadasList) {
        System.out.println("Write name of fraction: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();

        while (iterator.hasNext()) {
            TheVerkhovnaRada next = iterator.next();

            if (name.equalsIgnoreCase(next.fraction.getName().toUpperCase())) {
                iterator.remove();
                System.out.println(name.toUpperCase() + " successfully deleted");
            } else {
                System.out.println("Fraction " + name + " doesn't exist");
                throw new Error();
            }
        }
    }

    public void showAllFractions(List<TheVerkhovnaRada> theVerkhovnaRadasList) {
        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();
        while (iterator.hasNext()) {
            TheVerkhovnaRada next = iterator.next();
            System.out.println("------");
            System.out.println(next);
        }

    }

    public void clearSpecificFraction(List<TheVerkhovnaRada> theVerkhovnaRadasList){
        System.out.println("Enter fraction which you want to clear");
        Scanner scanner = new Scanner(System.in);
        String nameOfFraction = scanner.next();

        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();

        while (iterator.hasNext()) {
            TheVerkhovnaRada next = iterator.next();

            if (nameOfFraction.equalsIgnoreCase(next.fraction.getName())){
                next.fraction.deputy = new Deputy();
            }
        }

    }

    public void showSpecificFraction(List<TheVerkhovnaRada> theVerkhovnaRadasList) {
        System.out.println("Write fraction: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();

        if (!name.equalsIgnoreCase(fraction.getName())) {
            System.out.println("Fraction doesn't exist");
            throw new Error();
        }

        while (iterator.hasNext()) {
            TheVerkhovnaRada next = iterator.next();
            if (name.equalsIgnoreCase(next.fraction.getName())) {
                System.out.println(next);
            }
        }
    }

    public void addSpecificDeputyToSpecificFraction(List<TheVerkhovnaRada> theVerkhovnaRadasList) {
        System.out.println("Please enter Deputy whom want to add");
        System.out.println("---------");

        System.out.println("His height: ");
        Scanner scanner1 = new Scanner(System.in);
        String height = scanner1.next();

        System.out.println("His weight: ");
        Scanner scanner2 = new Scanner(System.in);
        String weight = scanner2.next();

        System.out.println("His first name: ");
        Scanner scanner3 = new Scanner(System.in);
        String firstName = scanner3.next();

        System.out.println("His second name: ");
        Scanner scanner4 = new Scanner(System.in);
        String secondName = scanner4.next();

        System.out.println("His age: ");
        Scanner scanner5 = new Scanner(System.in);
        int age = scanner5.nextInt();

        System.out.println("Enter fraction which you want to add Deputy");
        Scanner scanner7 = new Scanner(System.in);
        String nameFraction = scanner7.next();

        System.out.println("He is briber? true or false");
        Scanner scanner6 = new Scanner(System.in);
        boolean briber = scanner6.nextBoolean();

        Deputy deputy = new Deputy(weight, height, firstName, secondName, age, briber);

        if (briber) {
            deputy.giveBribe();
        }

        Fraction fraction = new Fraction(nameFraction.toUpperCase(), deputy);
        theVerkhovnaRadasList.add(new TheVerkhovnaRada(fraction));

        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();

        System.out.println("The Deputy successfully added");

    }

    public void removeDeputy(List<TheVerkhovnaRada> theVerkhovnaRadasList) {
        System.out.println("Please delete deputy from base");
        System.out.println();

        System.out.println("Please enter Deputy whom want to remove");
        System.out.println("---------");

        System.out.println("His first name: ");
        Scanner scanner3 = new Scanner(System.in);
        String firstName = scanner3.next();

        System.out.println("His second name: ");
        Scanner scanner4 = new Scanner(System.in);
        String secondName = scanner4.next();

        System.out.println("His age: ");
        Scanner scanner5 = new Scanner(System.in);
        int age = scanner5.nextInt();

        System.out.println("Enter fraction which you want to remove Deputy");
        Scanner scanner7 = new Scanner(System.in);
        String nameFraction = scanner7.next();


        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();

        while (iterator.hasNext()) {
            TheVerkhovnaRada next = iterator.next();

            if (firstName.equalsIgnoreCase(next.fraction.deputy.getFirstName()) && secondName.equalsIgnoreCase(next.fraction.deputy.getSecondName()) && age == next.fraction.deputy.getAge() && nameFraction.equalsIgnoreCase(next.fraction.getName())) {
                next.fraction.deputy = new Deputy();
            }


        }


    }

    public void showListBriberTakers(List<TheVerkhovnaRada> theVerkhovnaRadasList) {
        System.out.println("List bribe takers:");
        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();

        int count = 0;

        while (iterator.hasNext()) {
            TheVerkhovnaRada next = iterator.next();

            if (next.fraction.deputy.isBriber()) {
                count++;
                System.out.println(count + ". " + next.fraction.deputy.getFirstName() + " " + next.fraction.deputy.getSecondName());
            }
        }

    }


    public void showTheMostBriberTakers(List<TheVerkhovnaRada> theVerkhovnaRadasList) {
        Iterator<TheVerkhovnaRada> iterator = theVerkhovnaRadasList.iterator();

        int max = 0;
        String firstName = "";
        String secondName = "";


        while (iterator.hasNext()) {
            TheVerkhovnaRada next = iterator.next();

            if (max < next.fraction.deputy.getSizeOfBribe()) {
                firstName = next.fraction.deputy.getFirstName();
                secondName = next.fraction.deputy.getSecondName();
                max = next.fraction.deputy.getSizeOfBribe();
            }

        }
        System.out.println("The person who takes the most bribes is " + firstName + " " + secondName);
        System.out.println("Sum of max bribe = " + max);
    }


    public TheVerkhovnaRada(Fraction fraction) {
        this.fraction = fraction;
    }

    @Override
    public String toString() {
        return "TheVerkhovnaRada{" + "fraction=" + fraction + '}';
    }
}
