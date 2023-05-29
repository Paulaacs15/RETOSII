import java.util.Scanner;

public class RETOI {
    public static void main(String[] args) {

        //variables
        double promedio=0, suma=0;
        int cant;

        //Instanciar clase Scanner
        Scanner capturar= new Scanner(System.in);


        //solicitar al usuario
        System.out.println("ingrese la cantidad de notas");
        cant=capturar.nextInt();

        //inicializar
        int notas []=new int [cant];

        //capturar datos 
        for(int nota=0; nota<promedio; nota++){
            System.out.println("ingrese la nota");
            notas[nota]=capturar.nextInt();  
            suma= suma+notas[nota];
        }
        promedio=suma/cant;
 
            if(promedio <=3){
                System.out.println("Haz reprobado");

            }else if(promedio >=3 && promedio <=4.0){
                System.out.println("Haz pasado raspando");

            }else{
                System.out.println("Aprovasate");
            }

        
    }
}
