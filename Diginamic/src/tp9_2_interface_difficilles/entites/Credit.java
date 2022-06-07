package tp9_2_interface_difficilles.entites;

public class Credit extends Operation {

    public Credit(String date, int ammountoperation) {
        super(date, ammountoperation);
    }

    @Override
    public
    String getType() {
        return "CREDIT";
    }

}
