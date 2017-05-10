package hashmapsimple;
public class ContainsValueTest extends Test
{
    private void probando_verificacion_normal(){
        this.check(col.containsValue("Deborah"));
        this.check(col.containsValue("Franco"));
        this.check(col.containsValue("Miguel"));
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada(){
        this.check(col.containsValue(null));        
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso(){
        this.check(col.containsValue("Pepe"));
        this.check(col.containsValue("Luis"));
    }
    @Override
    public void test() {
        probando_verificacion_normal();
        System.out.println("");
        probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada();
        System.out.println("");
        probando_verificacion_con_claves_inexistentes_que_debería_dar_falso();
    }    
}