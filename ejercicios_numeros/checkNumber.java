package ejercicios_numeros;

import java.util.Scanner; // importa la clase Scanner para recibir la entrada del usuario                                                                            
                                                                                                                                                                     
public class checkNumber {                                                                                                                                           
                                                                                                                                                                     
                                                                                                                                                                     
                                                                                                                                                                     
                                                                                                                                                                     
                                                                                                                                                                     
        public static void main(String[] args) {                                                                                                                     
                Scanner sc = new Scanner(System.in); // Crea un nuevo objeto Scanner para recibir la entrada del usuario                                             
                System.out.print("Ingrese un número: "); // Pide al usuario que ingrese un número                                                                    
                int number = sc.nextInt(); // Lee la entrada del usuario y la almacena en la variable "number"                                                       
                int numberAbs = Math.abs(number); // pasa la variable number como valor absoluto                                                                                                                   
                int cantidadDigitos = Integer.toString(numberAbs).length(); // utiliza la variable numberAbs para validar la cantidad de digitos                                                                     
                checkNum(number); // Llama al método "checkNumb" y pasa el número como parámetro                                                                
                primeNumber(number);// Llama al método "primeNumber" y pasa el número como parámetro                                                                                                                                     
                rango(number); // Llama al método "rango" y pasa el número como parámetro                                                                                                                                          
                tipoUnidad(cantidadDigitos);// Llama al método "tipoUnidad" y pasa el número como parámetro    


                sc.close();// Cierra el objeto Scanner                                                                                                                         
                                                                                                                                                                     
                                                                                                                                                                     
        }                                                                                                                                                            
                                                                                                                                                                     
        public static void checkNum(int number) {                                                                                                                 
                if (number > 0) { // Si el número es mayor que cero                                                                                                  
                        System.out.println(number + " es un número positivo."); // Imprime que es un número positivo                                                 
                } else if (number < 0) { // Si el número es menor que cero                                                                                           
                        System.out.println(number + " es un número negativo."); // Imprime que es un número negativo                                                 
                } else { // Si el número es cero                                                                                                                     
                        System.out.println(number + " es cero."); // Imprime que es cero                                                                             
                }                                                                                                                                                    
        }                                                                                                                                                            
                                                                                                                                                                     
        public static void primeNumber(int number){                                                                                                                  
                // Se verifica si el número es par o no utilizando el operador módulo                                                                                
                if (number % 2 == 0) {// Si el resto de la división de "number" entre 2 es igual a cero                                                              
                        System.out.println(number + " Es un número par");                                                                                            
                }                                                                                                                                                    
                else{                                                                                                                                                
                        System.out.println(number + " No es un numero par");                                                                                         
                }                                                                                                                                                    
        }                                                                                                                                                            
                                                                                                                                                                     
        public static void rango(int number){
            // Comprobar si el número es mayor a cero y menor a diez                                                                                                                        
                if (  number > 0 && number < 10  ){                                                                                                                  
                        System.out.println(number + " Es menor a diez pero mayor a cero");
                        // Comprobar si el número es menor a cero                                                                           
                } else if (  number < 0  ){                                                                                                                          
                        System.out.println(number + " Es menor a cero (numero negativo)");
                        // Comprobar si el número es mayor o igual a diez                                                                           
                } else if (  number >= 10  ){                                                                                                                        
                        System.out.println(number + " El numero es mayor o igual a diez" );
                        // Si ninguna de las condiciones anteriores se cumple, el número es cero                                                                          
                } else{                                                                                                                                              
                        System.out.println(number + " El numero es cero");                                                                                           
                                                                                                                                                                     
                        }                                                                                                                                            
                                                                                                                                                                     
        }                                                                                                                                                            
                                                                                                                                                                     
        public static void tipoUnidad(int number){                                                                                                                   
                                                                                                                                                                     
               if (  number == 1  ){                                                                                                                                 
                       System.out.println("Tipo de numero = Unidades");                                                                                              
               } else if (  number == 2  ){                                                                                                                          
                       System.out.println("Tipo de numero = decenas");                                                                                               
               } else if (  number == 3  ){                                                                                                                          
                       System.out.println( "Tipo de numero = Centenas");                                                                                             
               }else if (  number == 4  ){                                                                                                                           
                       System.out.println("Tipo de numero = miles");                                                                                                 
               }else if (  number == 5  ){                                                                                                                           
                       System.out.println("Tipo de numero = decenas de miles");                                                                                      
               }else if (  number == 6  ){                                                                                                                           
                       System.out.println("Tipo de numero = centenas de miles");                                                                                     
               }else if (  number == 7  ){                                                                                                                           
                       System.out.println("Tipo de numero = millones");                                                                                              
               }else if (  number == 8  ){                                                                                                                           
                       System.out.println("Tipo de numero = decenas de millones");                                                                                   
               }else if (  number == 9  ){                                                                                                                           
                       System.out.println("Tipo de numero = centenas de millones");                                                                                  
               }else {                                                                                                                                               
                       System.out.println("Tipo de numero = miles de millones");                                                                                     
               }                                                                                                                                                     
        }                                                                                                                                                            
                                                                                                                                                                     
                                                                                                                                                                     
                                                                                                                                                                     
}                                                                                                                                                                    
                                                                                                                                                                     
                                                                                                                                                                     
                                                                                                                                                                     
                                                                                                                                                                     
                                                                                                                                                                     