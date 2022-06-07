package tp8_abstract;

public class Credit extends Operation {

    public Credit(String date, int ammountoperation) {
        super(date, ammountoperation);
    }

    @Override
    String getType() {
        return "CREDIT";
    }

}
