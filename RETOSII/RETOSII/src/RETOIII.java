import java.util.Scanner;

public class RETOIII {
    public static void main(String[] args) {

        //Declarar variables
        int letras, intentos;
        String palabra;
        boolean p=false;
        //Instanciar la clase scanner
        Scanner capturar = new Scanner(System.in);

        //Solicitar  cuantas letras tiene la palabra que va a utilizar
        System.out.println("de cuantas letras es la palabra");
        letras=capturar.nextInt();
        System.out.println("cuantos intentos tiene");
        intentos=capturar.nextInt();

        //array
        String [] palabra1 = new String [letras];


        //solicitar la palabra
        for(int i=0; i<palabra1.length; i++){
            System.out.println("Ingrese la letra "+i);
            palabra1[i]=capturar.nextLine();
            }
            System.out.println("ingrese una letra");
            palabra=capturar.nextLine();

            for(int i=0; i<palabra1.length; i++){
                if(palabra1[i].equals(palabra)){
                    p=true;
                }
            }
                if(p==false){
                    System.out.println("la letra es incorrecta");
                    intentos=intentos-1;

                }else{
                    System.out.println("la letra es correcta");
                }
                if(intentos==0){
                    System.out.println("te haz quedado sin intentos, haz perdido");
                }
    }
}
