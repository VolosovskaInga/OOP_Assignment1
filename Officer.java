import java.util.Scanner;

public class Officer {
    public String name;
    public String surname;
    public int officerID;
    public String workingDistrict;
    public int crimesSolved;

    Officer(String name, String surname, int officerID, String workingDistrict, int crimesSolved) {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.workingDistrict = workingDistrict;
        this.crimesSolved = crimesSolved;
    }

    public Officer() {

    }

    public Officer(Scanner input) {

    }

    public String toString() {
        return name + " " + surname + ": Officers ID: " + officerID + "; Working district: " + workingDistrict +
                "; Number of solved crimes is: " + crimesSolved;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public Integer getOfficerID() {
        return officerID;
    }

    public void setWorkingDistrict(String workingDistrict) {
        this.workingDistrict = workingDistrict;
    }

    public String getWorkingDistrict() {
        return workingDistrict;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public Integer getCrimesSolved() {
        return crimesSolved;
    }

    public void printDetails() {
        System.out.println("Name:" + getName() + "; Surname:" + getSurname() + "; Officer ID:" + getOfficerID() +
                "; Working district:" + getWorkingDistrict() + "; Number of solved crimes:" + getCrimesSolved());
    }

    public int calculatedLevel() {
        if (crimesSolved >= 0 && crimesSolved <= 20) {
            return 1;
        }
        if (crimesSolved >= 21 && crimesSolved <= 40) {
            return 2;
        }
        if (crimesSolved >= 41) {
            return 3;
        } else {
            return 0;
        }

    }


}
