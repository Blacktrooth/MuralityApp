



public class Equations {

    private double length;
    private double width;
    private double price;


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void proSize(double length, double width){
        System.out.println("The size of your project is " + (length * width) + "square feet.");
    }

    public void projCost (double price, double length, double width){
        System.out.println("The estimated cost of your project is " + "$" +  price * (length * width));

    }



}



