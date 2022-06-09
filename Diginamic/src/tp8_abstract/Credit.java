package tp8_abstract;

public class Credit extends Operation {

    public Credit(final String date, final int ammountoperation) {
        super(date, ammountoperation);
    }

    @Override
    String getType() {
        return "CREDIT";
    }

}
