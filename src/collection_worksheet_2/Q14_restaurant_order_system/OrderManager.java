package collection_worksheet_2.Q14_restaurant_order_system;

import java.util.*;

public class OrderManager
{
    Deque<Order> c_order = new LinkedList<>();
    List<Order> o_history = new ArrayList<>();

    public void addOrderToFront(Order of)
    {
        c_order.addFirst(of);
    }
    public void addOrderToLast(Order ol)
    {
        c_order.addLast(ol);
    }
    public void removeOrderFromFront()
    {
        Order rf=c_order.removeFirst();
        if(rf != null)
            o_history.add(rf);
    }

    public void removeOrderFromBack()
    {
        Order rl=c_order.removeLast();
        if(rl!=null)
            o_history.add(rl);
    }
    public void currentOrders()
    {
        System.out.println("current order : ");
        for(Order o:c_order)
        {
            System.out.println(o);
        }
    }

    public void orderHistory()
    {
        System.out.println("Order History : ");
        for(Order o: o_history)
        {
            System.out.println(o);
        }
    }
}
