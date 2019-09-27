
package p01mod3ventas;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class TestListar {
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<>();
        ArrayList<Venta> obtenido = instance.listar();
        Assert.assertEquals(esperado, obtenido);
                
    }
}
