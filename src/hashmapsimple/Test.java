package hashmapsimple;
public abstract class Test implements ITest
{
    MyMap<Integer,String>col= new MyMap();
    
    public Test() {
        this.restart();
    }
    protected void restart(){
        col.clear();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
    }
    protected void reverse(){
        col.clear();
        col.put(3, "Franco");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
        col.put(4, "Manuela");
        col.put(1, "Deborah");
        col.put(2, "Tommy");                
    }
    protected void pares(){
        col.clear();
        col.put(2, "Franco");
        col.put(4, "Miguel");
        col.put(6, "Denisse");
        col.put(8, "Manuela");
        col.put(10, "Deborah");
        col.put(12, "Tommy");
    }
    protected void primos(){
        col.clear();
        col.put(3, "Franco");
        col.put(5, "Miguel");
        col.put(7, "Denisse");
        col.put(11, "Manuela");
        col.put(13, "Deborah");
        col.put(17, "Tommy");
    }
    protected void elem1(){
        col.clear();
        col.put(1, "Deborah");
    }
    protected void elem2(){
        col.clear();
        col.put(1, "Deborah");
        col.put(2, "Franco");
    }
    protected void elem3(){
        col.clear();
        col.put(1, "Deborah");
        col.put(2, "Franco");
        col.put(3, "Tommy");
    }
    protected void check(boolean condition){        
        if(condition){
            Console.println(Console.ANSI_GREEN, "Prueba superada con exito, resultado: " + condition);
        } else {
            Console.println(Console.ANSI_RED, "Prueba fallida, resultado: " + condition);
        }
    }
}
