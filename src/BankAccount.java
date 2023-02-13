public class BankAccount {
    private Double amount;

    public BankAccount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        System.out.println("Ваш баланс составляет " + amount + " сом");
        return amount;
    }

    public Double deposit(Double sum) {
        amount += sum;
        System.out.println("На ваш баланс было зачислено " + sum + " сом");
        return amount;
    }

    public Double withDraw(Double sum) throws LimitException {
        if (amount - sum < 0) {
            throw new LimitException("Ошибка. Вы не можете снять " + sum + " сом. " +
                    "\nВаш остаток составляет " + amount,
                    amount);
        }
        amount = amount - sum;
        System.out.println("С вашего баланса было снято " + sum);
        return amount;
    }


}
