
package p01mod3ventas;

import org.junit.Assert;
import org.junit.Test;

public class TestModificar {
 @Test
 public void testModificar(){
        System.out.println("Modificar");
        Venta venta = new Venta("cod002",22,99);
        ColeccionVentas instance = new ColeccionVentas();
        instance.agregar(venta);
        boolean esperado = true;
        boolean obtenido = instance.modificar(venta);
        Assert.assertEquals(esperado, obtenido);
 }
    
}
