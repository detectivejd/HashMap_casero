package hashmapsimple;
public class UpTest extends Test
{
    private void probando_insercion_normal(){
        this.check(col.size() == 6);
    }
    private void probando_inserción_con_claves_nulas_que_no_debería_funcionar(){
        this.restart();
        col.put(null, "Ramiro");
        col.put(null, "Felipe");
        col.put(null, "Valentino");
        col.put(null, "Joaquin");
        /*-------------------------------------------------*/
        this.check(col.size() == 6);
    }
    private void probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores(){
        this.restart();
        col.put(1, "Micaela");
        col.put(3, "Serafín");
        col.put(5, "Agustin");
        /*-------------------------------------------------*/
        this.check(col.size() == 6);
    }
    private void probando_insercion_con_claves_negativas(){
        this.restart();
        col.put(-1, "Micaela");
        col.put(-5, "Serafín");
        col.put(-9, "Agustin");
        /*-------------------------------------------------*/
        this.check(col.size() == 9);
    }
    private void probando_insercion_repetida(){
        this.restart();
        col.put(1, "Deborah");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*-------------------------------------------------*/
        this.check(col.size() == 6);
    } 
    private void probando_insercion_desordenada(){
        this.reverse();
        this.check(col.size() == 6);        
    }
    private void probando_insercion_claves_gigantes(){
        this.restart();
        col.put(1000, "Bahar");
        col.put(5000, "Ates");
        col.put(6050, "Nuran");
        /*-------------------------------------------------*/
        this.check(col.size() == 9);
    }
    private void probando_insercion_claves_pares(){
        this.pares();
        /*-------------------------------------------------*/
        this.check(col.size() == 6);
    }
    private void probando_insercion_claves_cero(){
        this.restart();
        col.put(0, "Bahar");
        /*-------------------------------------------------*/
        this.check(col.size() == 7);
    }
    private void probando_insercion_claves_primos(){
        this.primos();
        /*-------------------------------------------------*/
        this.check(col.size() == 6);
    }
    @Override
    public void test() {
        probando_insercion_normal();
        System.out.println(" ");
        probando_inserción_con_claves_nulas_que_no_debería_funcionar();
        System.out.println(" ");
        probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores();
        System.out.println(" ");
        probando_insercion_con_claves_negativas();
        System.out.println("");
        probando_insercion_repetida();
        System.out.println("");
        probando_insercion_desordenada();
        System.out.println("");
        probando_insercion_claves_gigantes();
        System.out.println("");
        probando_insercion_claves_pares();
        System.out.println("");
        probando_insercion_claves_cero();
        System.out.println("");
        probando_insercion_claves_primos();
    }    
}