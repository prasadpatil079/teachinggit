public class Main{
    public static void main(String[] args) {
        Pizza p1=new Pizza(false);
        p1.addExtraToppings();
        p1.addExtraCheese();
        p1.addTakeway();
        System.out.println("Kuchtoh");
       System.out.println(p1.getBill());
    }
}