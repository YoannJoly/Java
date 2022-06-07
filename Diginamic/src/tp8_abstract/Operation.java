package tp8_abstract;

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

    abstract String getType();

}
