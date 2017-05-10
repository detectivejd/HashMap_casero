package hashmapsimple;
public class ContainsKeyTest extends Test
{
    private void probando_verificacion_normal(){
        this.check(col.containsKey(1));
        this.check(col.containsKey(3));
        this.check(col.containsKey(5));
    }
    private void probando_verificacion_con_claves_nulas_que_no_debería_obtener_nada(){
        this.check(col.containsKey(null));
    }
    private void probando_verificacion_con_claves_inexistentes_que_debería_dar_falso(){
        this.check(col.containsKey(7));
        this.check(col.containsKey(8));
        this.check(col.containsKey(9));
    }
    private void probando_verificacion_con_claves_negativas_que_debería_dar_falso(){
        this.check(col.containsKey(-7));
        this.check(col.containsKey(-8));
        this.check(col.containsKey(-9));
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