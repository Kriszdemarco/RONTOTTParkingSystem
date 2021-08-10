package parking;

public class Wallet {
    public double getMoney() {
        return money;
    }

    public double setMoney(double money) {
        this.money += money;
        return money;
    }

    private double money;

}
