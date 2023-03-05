public class Main {
    public static void main(String[] args) {
        int resultado = sumarTresNumeros(2, 3, 5);
        System.out.println("La suma de los tres numeros es: " + resultado);

        coche miCoche = new coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int sumarTresNumeros(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        return suma;
    }
}

class coche {
    public int puertas = 3;

    public void incrementarPuertas() {
        this.puertas++;
    }
}
