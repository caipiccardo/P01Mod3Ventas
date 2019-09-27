
package p01mod3ventas;

import java.util.ArrayList;

public class P01Mod3Ventas {

    public static void main(String[] args) {
         ColeccionVentas lista = new ColeccionVentas();
         Venta venta;
         String codigo;

         venta = new Venta("cod001",20,10);
         lista.agregar(venta);
         venta = new Venta("cod002",2,2);
         lista.agregar(venta);
         venta = new Venta("cod003",10,10);
         lista.agregar(venta);
         
         ListarVentas(lista.listar());
         
        
         
         
         System.out.println("---------MODIFICAR");
         System.out.println("");
         venta= new Venta("cod003",1,1);
         lista.modificar(venta);
         ListarVentas(lista.listar());
        
         System.out.println("----------ELIMINAR");
         System.out.println("");
         codigo = "cod002";
         lista.eliminar(codigo);
         ListarVentas(lista.listar());
        
         
    }
 
    public static void ListarVentas(ArrayList<Venta> lista){
             for (Venta v : lista) {
             System.out.println("Codigo :"+v.getCodigo());
             System.out.println("Precio :"+v.getPrecio());
             System.out.println("Cantidad :"+v.getCantidad());
                 System.out.println("-----------------");
        }
    }
    }
    

