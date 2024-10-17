public class Person {
    private String country;
    private String color;
    private int age;
    private int height;

    public Person(){}

    public Person (String country, String color,int age,int height){
        this.country=country;
        this.color=color;
        this.age=age;
        this.height=height;

    }

    public void setCountry(String country) {
        this.country = country;
    } public String getCountry(){
        return country;
    }

    public void setColor(String color) {
        this.color = color;
    } public  String getColor(){
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
}
