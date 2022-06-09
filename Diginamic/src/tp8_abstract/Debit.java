package tp8_abstract;

public class Debit extends Operation {

    public Debit(final String date, final int ammountoperation) {
        super(date, ammountoperation);
    }

    @Override
    String getType() {        
        return "DEBIT";
    }

}
