public class Main {
    public static void main(String[] args)
    {
        System.out.println(suma(1,20,30));
        coche miCoche = new coche();
        miCoche.agregar_puerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;
    }
}

class coche{
    int puertas = 0;

    public void agregar_puerta(){
        this.puertas++;
    }
}