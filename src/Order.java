import java.util.ArrayList;
import java.util.List;

public class Order {
    protected List<Food> ordered;

    public Order(){
        ordered= new ArrayList<>();
    }

    public void addFood(Food food){
        ordered.add(food);
    }

    public int total(){
        int total = 0;
        for (Food f : ordered){
            total+= f.getPrice();

        }
        return  total;
    }

    public void display() {
        for (Food f : ordered){
            f.display();

        }
        System.out.println(total() + " kr TOTAL");
    }

    public boolean payWith(CreditCard card){
        boolean fundsSufficient= card.withdraw(total());
        if (fundsSufficient==false){
            System.out.println("ERROR: Payment failed");
        }
        return fundsSufficient;
    }

}
