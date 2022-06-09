package tp8_abstract;

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

    abstract String getType();

}
