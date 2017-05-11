package hashmapsimple;
public class IteratorTest extends Test
{
    private void probando_recorridos_todo(){
        this.restart();
        System.out.println(" --valores-- ");
        col.values().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --claves-- ");
        col.keySet().stream().forEach((s) -> {
            System.out.println(s);
        });
        System.out.println(" ");
        System.out.println(" --entradas-- ");
        col.entrySet().stream().forEach((e)->{
            System.out.println("clave -> "+ e.getKey() +" valor -> "+e.getValue());
        });
    }
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
        probando_recorridos_iterar1();
        System.out.println("");
        probando_recorridos_iterar2();
        System.out.println("");
        probando_recorridos_iterar3();
        System.out.println("");
        probando_recorridos_todo();
    }
    
}
