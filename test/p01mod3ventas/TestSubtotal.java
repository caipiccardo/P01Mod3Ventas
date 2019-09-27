
package p01mod3ventas;

import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class TestSubtotal {
   @Test
   public void testSubTotal(){
       
       System.out.println("Subtotal");
        String codigo="cod001";
        Venta venta=new Venta("cod001", 10, 10);
        ColeccionVentas instance=new ColeccionVentas();
        instance.agregar(venta);
        int esperado=100;  
        int obtenido=instance.subTotal(codigo);
        Assert.assertEquals(esperado, obtenido);
 } 
}

