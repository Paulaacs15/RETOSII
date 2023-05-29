import java.util.Scanner;


public class RETOV {
    
    public static void main(String[] args) {

        //
        int [] [] juego=new int [5][5];
        int res, res1, res2, res3;

        //Instacniar clase Scanner
        Scanner capturar= new Scanner(System.in);

        //solicitar posicion de la fila y posicion de la  columna
        for(int filas=0; filas<5; filas++){
            for(int columnas=0; columnas<5; columnas++){
                System.out.println("ingrese un simbolo en la posicion " + filas + "" + columnas);
                juego[filas][columnas]=capturar.nextInt();
            }
        }

        //mostrar
            System.out.println("Que posicion deseas encontrar ingrese una fila");
            res=capturar.nextInt();
            System.out.println("Que posicion deseas encontrar ingrese una columna");
            res1=capturar.nextInt();

            System.out.println("Que posicion deseas encontrar ingrese otra fila");
            res2=capturar.nextInt();
            System.out.println("Que posicion deseas encontrar ingrese otra columna");
            res3=capturar.nextInt();


            if((juego[res][res1]) == (juego[res2][res3])){
                System.out.println("Haz ganado");
            }else{
                System.out.println("Haz perdido");
            }
        }
    }
