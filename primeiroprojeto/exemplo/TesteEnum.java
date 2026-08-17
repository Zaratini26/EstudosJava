package primeiroprojeto.exemplo;

import entities.Order;
import entities.enums.OrderStatus;

import java.time.LocalDateTime;

public class TesteEnum {
    public static void main(String[] args) {

        Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

            


    }
}
