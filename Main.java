import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Officer firstOfficer = new Officer("Eriks", "White", 22456, "Brooklyn", 132);
        Officer secondOfficer = new Officer("David", "Black", 66758, "Manhattan", 32);
        Officer thirdOfficer = new Officer("Jack", "Red", 23765, "Queens", 5);

        System.out.println("Details of first officer:");
        System.out.println(firstOfficer.toString());
        System.out.println();

        System.out.println("Details of second officer:");
        System.out.println(secondOfficer.toString());
        System.out.println();

        System.out.println("Details of third officer:");
        System.out.println(thirdOfficer.toString());
        System.out.println();


        //Officer[] district99 = {firstOfficer, secondOfficer, thirdOfficer};
        ArrayList<Officer> district99= new ArrayList<>();
        district99.add(firstOfficer);
        district99.add(secondOfficer);
        district99.add(thirdOfficer);


        int counter = 0;
        for (Officer a : district99) {
            if (a.calculatedLevel() == 1) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " officers with level 1");

        int counter2 = 0;
        for (Officer a : district99) {
            if (a.calculatedLevel() > 1) {
                counter2++;
            }
        }
        System.out.println("There are " + counter2 + " officers with level that's bigger than 1");

        for (Officer a : district99) {
            if (a.getName().equals("John")) {
                System.out.println("There is an Officer with the name “John”");
            } else {
                System.out.println("There are no officers with the name “John” ");
                break;

            }

        }
        System.out.println(district99);

    }


}






