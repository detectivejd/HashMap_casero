package hashmapsimple;
public class UpTest extends Test
{
    private void probando_insercion_normal(){
        this.check(col.size() == 6);
    }
    private void probando_inserción_con_claves_nulas_que_no_debería_funcionar(){
        col.put(null, "Ramiro");
        col.put(null, "Felipe");
        col.put(null, "Valentino");
        col.put(null, "Joaquin");
        /*-------------------------------------------------*/
        this.check(col.size() == 6);
    }
    private void probando_insercion_con_claves_existentes_que_deberia_cambiar_sus_valores(){
        col.put(1, "Micaela");
        col.put(3, "Serafín");
        col.put(5, "Agustin");
        /*-------------------------------------------------*/
        this.check(col.size() == 6);
    }
    private void probando_insercion_con_claves_negativas(){
        col.put(-1, "Micaela");
        col.put(-5, "Serafín");
        col.put(-9, "Agustin");
        /*-------------------------------------------------*/
        this.check(col.size() == 9);
    }
    private void probando_insercion_repetida(){
        col.put(1, "Deborah");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        /*-------------------------------------------------*/
        this.check(col.size() == 9);
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
    }    
}