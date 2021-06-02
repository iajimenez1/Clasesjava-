package operaciones;


public class Matematica {
    int a;
    int b;
    public void sumar(){
        int resultado = this.a + this.b;
        System.out.println("El resultado es "+resultado);
    }
    public int sumar1(){
        int resultado = this.a + this.b;
        return resultado;
    }
    public void sumar2(int arg1, int arg2){
        this.a = arg1;
        this.b = arg2;
        System.out.println("El resultado del metodo con parametros es "+(this.a+this.b));
    }
}
    