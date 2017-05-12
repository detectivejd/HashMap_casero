package hashmapsimple;
public class IteratorTest extends Test
{
    private void probando_recorridos_iterar1(){
        this.elem1();
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void probando_recorridos_iterar2(){
        this.elem2();
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    private void probando_recorridos_iterar3(){
        this.elem3();
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
    @Override
    public void test() {
        // este anda mal, porque no muestra el elemento
        probando_recorridos_iterar1(); 
        System.out.println("");
        probando_recorridos_iterar2();
        System.out.println("");
        probando_recorridos_iterar3();
    }
    
}
