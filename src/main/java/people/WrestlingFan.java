package people;

public class WrestlingFan extends People { ;
    private int cashMoney;
    private boolean fanBoyStatus;
    private String favouriteWrestler;

    public WrestlingFan(String name, int age, int cashMoney, boolean fanBoyStatus, String favouriteWrestler) {
        super(name, age);
        this.cashMoney = cashMoney;
        this.fanBoyStatus = fanBoyStatus;
        this.favouriteWrestler = favouriteWrestler;
    }

    public int getCashMoney() {
        return cashMoney;
    }

    public void setCashMoney(int cashMoney) {
        this.cashMoney = cashMoney;
    }

    public boolean isFanBoyStatus() {
        return fanBoyStatus;
    }

    public void setFanBoyStatus(boolean fanBoyStatus) {
        this.fanBoyStatus = fanBoyStatus;
    }

    public String getFavouriteWrestler() {
        return favouriteWrestler;
    }

    public void setFavouriteWrestler(String favouriteWrestler) {
        this.favouriteWrestler = favouriteWrestler;
    }
}

