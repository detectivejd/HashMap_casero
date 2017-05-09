/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapsimple;

/**
 *
 * @author detectivejd
 */
public class IteratorTest implements ITest
{
    @Override
    public void test() {
        MyMap<Integer,String>col= new MyMap();
        col.put(1, "Deborah");
        col.put(2, "Tommy");
        col.put(3, "Franco");
        col.put(4, "Manuela");
        col.put(5, "Miguel");
        col.put(6, "Denisse");
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
    
}
