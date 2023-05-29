import java.util.Scanner;

public class RETOII {
public static void main(String[] args) {
//Declarar variables
int num, can;

//Instanciar la clase scanner
Scanner capturar = new Scanner(System.in);

//Solicitar  cuantos competidores vas a participar
System.out.println("Cuantos competidores desea ingresar");
can=capturar.nextInt();

//Declaro e instancio el array que va almacenar los tiemepos ingresados por el usuario y los va organizados de mayor a menor
int [] tiempo = new int [can];
String [] nombre = new String [can];

//Capturo los tiempos que va a ingresar el usuario
for(int i=0; i<tiempo.length; i++){
System.out.println("Ingrese el tiempo de cada competidor "+i);
tiempo[i]=capturar.nextInt();
System.out.println("ingrese el nombre del competidor");
nombre[i]=capturar.next();
}

//Muestro los tiempos que ingreso
System.out.println("Los tiempos que ingreso son: ");
for(int resp:tiempo){
System.out.println(resp);
}
System.out.println("Los nombres que ingreso son: ");
for(String resp1:nombre){
System.out.println(resp1);
}

for(int i = 0; i < can - 1; i++){
    for(int j = 0; j < can - i - 1; j++){
    if(tiempo[j] > tiempo[j+1]){
    int posi = tiempo[j];
    tiempo[j] = tiempo[j+1];
    tiempo[j+1] = posi;
    }
    }
    }
    
    System.out.println("El jugador con el tiempo :" + tiempo[0]);    
    }
    }
