
public class Main {

    public static void main(String[] args) {
        Officer firstOfficer = new Officer("Eriks", "White", 22456, "Brooklyn", 132);
        Officer secondOfficer = new Officer("David", "Black", 66758, "Manhattan", 32);
        Officer thirdOfficer = new Officer("Jack", "Red", 23765, "Queens", 5);

        System.out.println();
        System.out.println("Details of first officer:");
        System.out.println(firstOfficer);
        System.out.println();
        //Officer firstOfficer = new Officer();

        // firstOfficer.setName("Jon");
        //firstOfficer.setSurname("White");
        //firstOfficer.setOfficerID(22456);
        //firstOfficer.setWorkingDistrict("Brooklyn");
        //firstOfficer.setCrimesSolved(132);

        //System.out.println("Details of first officer:");
        //firstOfficer.printDetails();
        //System.out.println();

        //Officer secondOfficer = new Officer();
        //secondOfficer.setName("David");
        //secondOfficer.setSurname("Black");
        //secondOfficer.setOfficerID(66758);
        //secondOfficer.setWorkingDistrict("Manhattan");
        //secondOfficer.setCrimesSolved(34);

        System.out.println("Details of second officer:");
        secondOfficer.printDetails();
        System.out.println();

        //Officer thirdOfficer = new Officer();
        //thirdOfficer.setName("Jack");
        //thirdOfficer.setSurname("Red");
        //thirdOfficer.setOfficerID(23765);
        //thirdOfficer.setWorkingDistrict("Queens");
        //thirdOfficer.setCrimesSolved(5);

        System.out.println("Details of third officer:");
        thirdOfficer.printDetails();
        System.out.println();

        thirdOfficer.calculatedLevel();

        Officer[] district99 = {firstOfficer, secondOfficer, thirdOfficer};


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

    }


}






