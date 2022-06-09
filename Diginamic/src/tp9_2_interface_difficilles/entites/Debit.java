package tp9_2_interface_difficilles.entites;

public class Debit extends Operation {

    public Debit(final String date, final int ammountoperation) {
        super(date, ammountoperation);
    }

    @Override
    public
    String getType() {        
        return "DEBIT";
    }

}
