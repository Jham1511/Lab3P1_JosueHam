package lab3p1_josueham;

import java.util.Scanner; 

public class Lab3P1_JosueHam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int opcion;
        do{
            System.out.println("");
            System.out.println("----- Bienvenido al menu del programa -----");
            System.out.println("1 -> Diptongo");
            System.out.println("2 -> Sumatoria Pi");
            System.out.println("3 -> Time Clock");
            System.out.println("4 -> Salir del programa");
            System.out.println("Ingrese que opcion desea: ");
            opcion = leer.nextInt();
            
            switch (opcion){
                case 1: {
                    String acum = " ";
                    System.out.println("Ingrese una cadena: ");
                    String palabra = leer.next().toLowerCase();
                    int cont_1 = 0;
                    
                    for (int i = 0; i < palabra.length(); i++) {
                        char letra = palabra.charAt(i);
                       
                        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                            switch (letra){
                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':cont_1++; 
                                break;
                            
                        }//Fin switch opcion No. 1
                            if(cont_1==2){
                                break;
                            }
                        
                        }//Fin If validacion vocales
                        else {
                            cont_1=0;
                        }//Fin else vocales
                    }//Fin For Opcion No. 1
                    System.out.println(cont_1);
                        if (cont_1 == 2) {
                            System.out.println("La palabra "+ palabra + " si es diptongo");
                        }//Fin if print
                        else {
                            System.out.println("La palabra " + palabra + " no es diptongo");
                        }//Fin else print
                }//Fin case 1
                break;
                
                case 2: {
                    System.out.println("Ingrese el valor K (limite): ");
                    double limite = leer.nextDouble(); 
                    double resultado = 0; 
                    
                        while (limite <= 0){
                            System.out.println("No se permiten numeros menores que 0");
                            System.out.println("Ingrese el valor K (limite): ");
                                limite = leer.nextDouble();
                                
                        }//Fin if validacion limite > 0
                        
                        double sum = 0.0; double pot = 1.0; double sum_2 = 0.0; double pi;
                        
                        for (double n = 0; n < limite; n++) {
                              double exp = 0.0;
                              double base = (2*n + 1);
                              exp = Math.pow(-1, n);
                              sum_2 = (exp)/(base);
                              sum = sum + sum_2;
                    }//Fin For No.1 Opcion No.2
                        
                         pi = sum *4;
                         System.out.println("El resultado es de: "+ pi);
                }//Fin case 2
                break; 
                
                case 3: {
                    System.out.println("Ingrese un numero entero impar: ");
                    int numero = leer.nextInt();
                    
                    while (numero % 2 == 0){
                        System.out.println("Solamente se permiten numeros enteros");
                        System.out.println("Ingrese un numero entero impar: ");
                        numero = leer.nextInt();   
                    }//Fin  while validacion opcion 3
                 
                   
                   
                    for (int i = 0; i < numero; i++) {
                        for (int j = 0; j < numero - i; j++) {
                                if ((j >= i) && (j < numero - i)) {
                                    System.out.print("*");
                            }//Fin If
                                else{ 
                                    System.out.print(" ");
                                }//Fin else 
                        }//Fin For J
                        System.out.println(" ");
                    }//Fin For i
                    
                    int base = numero - 1;
                   
                    for (int i = numero; i >= numero; i--) {
                        for (int j = numero; j < numero - i; j--) {
                            if ((j > i) && (j < numero - i)) {
                                System.out.print("*");
                            }//Fin if
                            else {
                            }//Fin else 
                            System.out.print("*");
                        }//Fin for j
                        System.out.println("*");
                    }//Fin for i

                }//Fin case 3
                break;
                
                default: 
                      System.out.println("Saliendo del programa...");
            }//Fin switch
        }while (opcion!=4);
    }//Fin del main 
    
}//Fin de la clase
