import java.time.LocalDate;

public class Car {
    private String [] name;
    private LocalDate when;
    private long [] price;
    private String [] color;

    public Car (){}

    public Car(String [] name, LocalDate  when, long[] price, String [] color){

        this.name=name;
        this.when=when;
        this.price=price;
        this.color=color;

     }

    public void setName(String[] name) {
        this.name = name;
    } public String [] getName(){
        return name;
    }

    public void setWhen(LocalDate when) {
        this.when = when;
    }

    public LocalDate getWhen() {
        return when;
    }

    public void setPrice(long[] price) {
        this.price = price;
    }

    public long[] getPrice() {
        return price;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public String[] getColor() {
        return color;
    }
}
