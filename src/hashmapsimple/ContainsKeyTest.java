package hashmapsimple;
public class ContainsKeyTest extends Test
{
    private void probando_verificacion_normal(){
        try {
            col.containsKey(1);
            col.containsKey(3);
            col.containsKey(5);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada(){
        try {
            col.containsKey(null);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso(){
        try {
            col.containsKey(7);
            col.containsKey(8);
            col.containsKey(9);
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
    private void probando_verificacion_con_claves_negativas_que_debería_dar_falso(){
        try {
            col.containsKey(-7);
            col.containsKey(-8);
            col.containsKey(-9);
        } catch(Exception ex){
            ex.printStackTrace();
        }    
    }
    @Override
    public void test() {
        probando_verificacion_normal();
        System.out.println("");
        probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada();
        System.out.println("");
        probando_verificacion_con_claves_inexistentes_que_debería_dar_falso();
        System.out.println("");
        probando_verificacion_con_claves_negativas_que_debería_dar_falso();
    }    
}