public class Program {
    public static void main(String arg[]) {

        Food food = new Food("burger", 10);
        //food.display();
        //System.out.println("Price: "+ food.getPrice());

        Pizza pizza= new Pizza ();
        pizza.addTopping("Pepperoni");
        pizza.addTopping("Pinapple");
     //   pizza.display();

        Order order=new Order();
        order.addFood(food);
        order.addFood(pizza);
        order.display();




    }

}
