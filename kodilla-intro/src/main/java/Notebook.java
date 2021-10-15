public class Notebook {
    int weight;
    int price;
    int year;
public Notebook(int weight, int price, int year) {
    this.weight = weight;
    this.price = price;
    this.year = year;
}
public void checkPrice() {
    if (this.price < 600 ) {
        System.out.println("This notebook is very cheap.");}
    else if (this.price <= 1000) {
        System.out.println("The price is good.");}
    else {
        System.out.println("This notebook is expensive");}
    }
    public void checkWeight() {
        if (this.weight < 600 ) {
            System.out.println("This notebook is lightweight.");}
        else if (this.weight <= 1600) {
            System.out.println("The notebokk is not very heavy.");}
        else {
            System.out.println("This notebook is very heavy");}
    }
    public void checkYear() {
        if (this.year < 2017 ) {
            System.out.println("This notebook is very old.");}
        else if (this.year <= 2019) {
            System.out.println("This notebook is old.");}
        else {
            System.out.println("This notebook is new");}
    }
}