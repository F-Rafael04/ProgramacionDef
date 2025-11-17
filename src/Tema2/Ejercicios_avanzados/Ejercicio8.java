package EjerciciosAvanzadosTema2;

public class Ejercicio8 {
    public static void main(String[] args) {
        for (int i=1;i < 100;i++){
            if(i%2==0){
                if (i==2){
                    System.out.printf(i + " Es primo ");
                } else {
                    System.out.printf(i + " No es primo ");
                }
            }
            if (i%2!=0){
                System.out.printf(i + " Es primo ");
            }
        }
    }
}
