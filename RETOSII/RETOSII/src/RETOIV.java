import java.util.Scanner;


public class RETOIV {
   
    public static void main(String[] args) {
        
        //array
        int [] [] maquina=new int [4][4];

        //Instanciar la clase scanner
        Scanner capturar= new Scanner(System.in);

        //solictar el nombre y precio del producto
        for(int filas=0; filas<4; filas++){
            for(int columnas=0; columnas<4; columnas++){
                System.out.println("ingrese el nombre y precio del producto " + filas + columnas);
                maquina [filas][columnas]=capturar.nextInt();

            }
        }

        //mostrar
        for(int filas=0; filas<4; filas++){
            for(int columnas=0; columnas<4; columnas++){
                System.out.println( filas + "" + columnas + "El producto y el precio del producto es" + maquina [filas][columnas]);
            }
            System.out.println("");
        }
    }
}