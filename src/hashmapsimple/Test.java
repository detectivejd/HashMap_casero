package hashmapsimple;
public abstract class Test implements ITest
{
    MyMap<Integer,String>col;    
    public Test() {
        col= new MyMap();
        cargando(restart1());
    }
    private void cargando(Object [][] arreglo){
        col.clear();
        for (Object[] arreglo1 : arreglo) {
            col.put(Integer.valueOf(arreglo1[0].toString()), arreglo1[1].toString());
        }
    }
    protected Object[][] restart1(){
        return new Object[][] {
            new Object[]{1,"Deborah"},
            new Object[]{2,"Tommy"},
            new Object[]{3,"Franco"},
            new Object[]{4,"Manuela"},
            new Object[]{5,"Miguel"},
            new Object[]{6,"Denisse"}
        };        
    }
    protected Object[][] reverse1(){
        return new Object[][]{
            new Object[]{3,"Franco"},
            new Object[]{5,"Miguel"},
            new Object[]{6,"Denisse"},
            new Object[]{4,"Manuela"},
            new Object[]{1,"Deborah"},
            new Object[]{2,"Tommy"}
        };                
    }
    protected Object[][] pares1(){
        return new Object[][]{
            new Object[]{2,"Franco"},
            new Object[]{4,"Miguel"},
            new Object[]{6,"Denisse"},
            new Object[]{8,"Manuela"},
            new Object[]{10,"Deborah"},
            new Object[]{12,"Tommy"}
        };                
    }
    protected Object[][] primos1(){
        return new Object[][]{
            new Object[]{3,"Franco"},
            new Object[]{5,"Miguel"},
            new Object[]{7,"Denisse"},
            new Object[]{11,"Manuela"},
            new Object[]{13,"Deborah"},
            new Object[]{17,"Tommy"}
        };                
    }
    protected Object[][] zero(){
        return new Object[][] {
            new Object[]{0,"Deborah"},
        };        
    }
    protected Object[][] elem_1(){
        return new Object[][]{ new Object[]{1,"Deborah"} };        
    }
    protected Object[][] elem_2(){
        return new Object[][]{
            new Object[]{1,"Deborah"},
            new Object[]{2,"Franco"}
        };
    }
    protected Object[][] elem_3(){
        return new Object[][]{
            new Object[]{1,"Deborah"},
            new Object[]{2,"Franco"},
            new Object[]{3,"Tommy"} 
        };
    }    
    protected Object[][] giantKey(){
        return new Object[][]{
            new Object[]{1000,"Deborah"},
            new Object[]{3000,"Franco"},
            new Object[]{6050,"Tommy"} 
        };
    }
    protected Object[][] negativeKey(){
        return new Object[][]{
            new Object[]{-1,"Micaela"},
            new Object[]{-3,"Serafín"},
            new Object[]{-9,"Joaquín"} 
        };
    }
    protected Object[][] nullKey(){
        return new Object[][]{
            new Object[]{null,"Felipe"},
            new Object[]{null,"Ramiro"},
            new Object[]{null,"Monetta"} 
        };
    }
    protected void comprobar_que(boolean condition) throws Exception{        
        if(!condition){           
            throw new Exception();
        }
    }
}
