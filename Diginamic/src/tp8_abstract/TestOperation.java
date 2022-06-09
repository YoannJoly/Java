package tp8_abstract;

public class TestOperation {

    static int result = 0;

    public static void main(final String[] args) {
        final Operation[] operations = { new Credit("01/26/12", 236), new Credit("26/11/18", 1230),
                new Debit("26/08/21", 658), new Debit("23/04/19", 214) };

        for (final Operation operation : operations) {
            System.out.println(operation.getType() + operation.getDate() + "  " + operation.getAmmountoperation());

            if (operation.getType().equals("CREDIT")) {
                result = result + operation.getAmmountoperation();
            } else if (operation.getType().equals("DEBIT")) {
                result = result - operation.getAmmountoperation();
            }
        }

        System.out.println(result);
    }

}
