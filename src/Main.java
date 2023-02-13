public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0.0);
        bankAccount.deposit(20000.0);

        while (true){
            if (bankAccount.getAmount() == LimitException.getRemainingAmount()) {
                try {
                    bankAccount.withDraw(LimitException.getRemainingAmount());
                } catch (LimitException e) {
                    throw new RuntimeException(e);
                }
                break;
            }

            try {
                bankAccount.withDraw(6000.0);
                bankAccount.getAmount();
            } catch (LimitException le){
                System.out.println(le.getMessage());
            }
            System.out.println();
        }
    }
}