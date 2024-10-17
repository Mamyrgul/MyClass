public class University {

    private String [] name;
    private  String [] whichCountry;
    private String [] whichLanguage;
    private int [] price;

    public University (){}

    public University(String [] name, String [] whichCountry, String [] whichLanguage, int [] price){
        this.name=name;
        this.whichCountry=whichCountry;
        this.whichLanguage=whichLanguage;
        this.price= price;


    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getName() {
        return name;
    }

    public void setWhichCountry(String[] whichCountry) {
        this.whichCountry = whichCountry;
    }

    public String[] getWhichCountry() {
        return whichCountry;
    }

    public void setWhichLanguage(String[] whichLanguage) {
        this.whichLanguage = whichLanguage;
    }

    public String[] getWhichLanguage() {
        return whichLanguage;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public int[] getPrice() {
        return price;
    }
}
