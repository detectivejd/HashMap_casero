package hashmapsimple;
public class UpTest extends Test
{
    
    private void probando_inserción_con_claves_nulas_que_no_debería_funcionar(){
        try {
            this.restart();
            col.put(null, "Ramiro");
            col.put(null, "Felipe");
            col.put(null, "Valentino");
            col.put(null, "Joaquin");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores(){
        try {
            this.restart();
            col.put(1, "Micaela");
            col.put(3, "Serafín");
            col.put(5, "Agustin");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_insercion_con_claves_negativas(){
        try {
            this.restart();
            col.put(-1, "Micaela");
            col.put(-5, "Serafín");
            col.put(-9, "Agustin");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_insercion_repetida(){
        try {
            this.restart();
            col.put(1, "Deborah");
            col.put(5, "Miguel");
            col.put(6, "Denisse");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    } 
    private void probando_insercion_desordenada(){
        try {
            this.reverse();
        } catch(Exception ex){
            ex.printStackTrace();
        }        
    }
    private void probando_insercion_claves_gigantes(){
        try {
            this.restart();
            col.put(1000, "Bahar");
            col.put(5000, "Ates");
            col.put(6050, "Nuran");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_insercion_claves_pares(){
        try {
            this.pares();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_insercion_claves_cero(){
        try {
            this.restart();
            col.put(0, "Bahar");
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_insercion_claves_primos(){
        try {
            this.primos();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    @Override
    public void test() {
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