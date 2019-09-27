
package p01mod3ventas;

import org.junit.Assert;
import org.junit.Test;

public class TestEliminar {
        @Test
 public void testEliminar(){
        System.out.println("Eliminar");
        String codigo="cod00x";
        Venta venta=new Venta("cod00x", 23,23);
        ColeccionVentas instance=new ColeccionVentas();
        instance.agregar(venta);
        boolean esperado=true;  
        boolean obtenido=instance.eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
 }  
    
}
