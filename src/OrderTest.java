
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * This is the Junit test class for testing all public methods in the Order class.
 * 
 * @author Aarif Razak ahr58, Julian Lee jl2203
 */

public class OrderTest {

    @Test
    public void testOrder() {

        Order order = new Order() ;
        
        // Test initialization
        assertEquals(0, order.lineNumber) ;

        Chicken chicken = new Chicken() ;
        assertEquals(true, order.add(chicken)) ;
        Beef beef = new Beef() ;
        order.add(beef) ;
        OrderLine orderLine = order.getOrders().get(1) ;
        assertEquals(true, order.remove(orderLine)) ; // Remove from orders
        assertEquals(false, order.remove(orderLine)) ; // Try to find order that doesn't exist

    }
    
}
