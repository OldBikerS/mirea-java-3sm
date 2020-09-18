package practice2.task2;

public class Dog {

    String Name;
    int Years;

    public Dog ( String _Name , int _Years ) {

        this.Name = _Name;
        this.Years = _Years;

    }

    public String getName ( ) {

        return Name;

    }

    public void setName ( String _Name ) {

        this.Name = _Name;

    }

    public int getYears ( ) {

        return Years;

    }

    public void setYears ( int _Years ) {

        this.Years = _Years;

    }

    public int getYearsDog ( ) {

        return Years * 7;

    }

    public void setYearsHuman ( int _Years ) {

        this.Years = _Years / 7;

    }

    @Override
    public String toString ( ) {

        return "--> Dog: { " + "Name: " + Name + "; Years: " + Years + " } <--";

    }

}