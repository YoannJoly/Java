package tp9_2_interface_difficilles.entites;

public abstract class Operation {

    private final String date;
    private final int ammountoperation;

    public Operation(final String date, final int ammountoperation) {
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
