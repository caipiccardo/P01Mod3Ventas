
package p01mod3ventas;

import org.junit.Assert;
import org.junit.Test;

public class TestAgregar {
     @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta = new Venta("cod00X",33,33);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.agregar(venta);
        Assert.assertEquals(esperado, obtenido);
    }
}
