
package operaciones;


public class PruebaMatematica {
    public static void main(String[] arg){
        Matematica ob1 = new Matematica();
        ob1.a = 25;
        ob1.b = 35;
        ob1.sumar();
        
        int res = ob1.sumar1();
        System.out.println("res - " + res);
        System.out.println("El resultado de la suma es "+ob1.sumar1());
        }
}
