package tp9_2_interface_difficilles.entites;

public abstract class Operation {

    private String date;
    private int ammountoperation;

    public Operation(String date, int ammountoperation) {
        this.date = date;
        this.ammountoperation = ammountoperation;
    }

    public String getDate() {
        return date;
    }

    public int getAmmountoperation() {
        return ammountoperation;
    }

    public abstract String getType();

}
