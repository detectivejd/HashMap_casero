package hashmapsimple;
public class UpTest extends Test
{
    private void probando_insercion_normal(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO INSERCIÓN NORMAL---"); 
        System.out.println(" ");
        this.check(col.size() == 4);
    }
    private void probando_inserción_con_claves_nulas_que_no_debería_funcionar(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");        
        /*-------------------------------------------------*/
        col.put(null, "Ramiro");
        col.put(null, "Felipe");
        col.put(null, "Valentino");
        col.put(null, "Joaquin");
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO INSERCIÓN CON CLAVES NULAS---"); 
        System.out.println(" ");
        this.check(col.size() == 4);
        this.check(col.size() == 8);
    }
    private void probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores(){
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Martin");        
        col.put(6, "Miltón");
        /*-------------------------------------------------*/
        col.put(1, "Micaela");
        col.put(3, "Serafín");
        col.put(5, "Agustin");
        /*-------------------------------------------------*/
        System.out.println("\t ---PROBANDO INSERCIÓN CON CLAVES EXISTENTES---"); 
        System.out.println(" ");
        this.check(col.size() == 6);
        this.check(col.size() == 9);
    }
    @Override
    public void test() {
        probando_insercion_normal();
        System.out.println(" ");
        probando_inserción_con_claves_nulas_que_no_debería_funcionar();
        System.out.println(" ");
        probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores();       
    }    
}