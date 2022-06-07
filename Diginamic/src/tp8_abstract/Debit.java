package tp8_abstract;

public class Debit extends Operation {

    public Debit(String date, int ammountoperation) {
        super(date, ammountoperation);
    }

    @Override
    String getType() {        
        return "DEBIT";
    }

}
