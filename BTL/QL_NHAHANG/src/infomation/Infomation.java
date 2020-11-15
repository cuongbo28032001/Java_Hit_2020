package infomation;

public abstract class Infomation {
    protected String name;
    protected String numberPhone;
    protected String address;
    protected int day, month, year;

    public Infomation() {
    }

    public Infomation(String name, String numberPhone, String address, int day, int month, int year) {
        this.name = name;
        this.numberPhone = numberPhone;
        this.address = address;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    abstract void InputInfo();
    abstract void OutputInfo();
}
