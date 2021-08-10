package parking;

public abstract class Vehicle {
    private String type;
    private int year;
    private String licensePlate;
    private Wallet wallet;

    public Vehicle(String type, int year, String licensePlate) {
        this.type = type;
        this.year = year;
        this.licensePlate = licensePlate;
        this.wallet=new Wallet();
    }


    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void recevedMoney(double money){

    }
    public double pay(double money){
        return wallet.setMoney(money*(-1));
    }


}
