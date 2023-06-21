import java.net.ContentHandlerFactory;
import java.util.ArrayList;
import java.util.Vector;

public class App {

    public static int numGeneraciones = 5;
    public static void main(String[] args) throws Exception {
        
        ArrayList<Comuna> listaComunas = new ArrayList<Comuna>();
        ArrayList<Poblacion> listaPoblaciones = new ArrayList<Poblacion>();  
        ArrayList<Poblacion> listaHijos = new ArrayList<Poblacion>();

        Comuna comuna1 = new Comuna();
        comuna1.setId(2);
        comuna1.setNombre("Calle larga");    
        comuna1.setCosto(1.0); 
        listaComunas.add(comuna1);
        Comuna comuna2 = new Comuna();  
        comuna2.setId(3); 
        comuna2.setNombre("San Esteban");
        comuna2.setCosto(1.5);
        listaComunas.add(comuna2);
        Comuna comuna3 = new Comuna();
        comuna3.setId(4);
        comuna3.setNombre("Rinconada");
        comuna3.setCosto(1.2);
        listaComunas.add(comuna3);
        Comuna comuna4 = new Comuna();
        comuna4.setId(5);
        comuna4.setNombre("Los Andes");
        comuna4.setCosto(2.0);
        listaComunas.add(comuna4);
        Comuna comuna5 = new Comuna();
        comuna5.setId(6);
        comuna5.setNombre("Cabildo");
        comuna5.setCosto(3.0);
        listaComunas.add(comuna5);
        Comuna comuna6 = new Comuna();
        comuna6.setId(7);
        comuna6.setNombre("La Ligua");
        comuna6.setCosto(2.0);
        listaComunas.add(comuna6);
        Comuna comuna7 = new Comuna();
        comuna7.setId(8);
        comuna7.setNombre("Papudo");
        comuna7.setCosto(1.0);
        listaComunas.add(comuna7);
        Comuna comuna8 = new Comuna();
        comuna8.setId(9);
        comuna8.setNombre("Petorca");
        comuna8.setCosto(1.0);
        listaComunas.add(comuna8);
        Comuna comuna9 = new Comuna();
        comuna9.setId(10);
        comuna9.setNombre("Zapallar");
        comuna9.setCosto(3.0);
        listaComunas.add(comuna9);
        Comuna comuna10 = new Comuna();
        comuna10.setId(11);
        comuna10.setNombre("Hijuelas");
        comuna10.setCosto(4.0);
        listaComunas.add(comuna10);
        Comuna comuna11 = new Comuna();
        comuna11.setId(12);
        comuna11.setNombre("La Calera");
        comuna11.setCosto(3.0);
        listaComunas.add(comuna11);
        Comuna comuna12 = new Comuna();
        comuna12.setId(13);
        comuna12.setNombre("La Cruz");
        comuna12.setCosto(3.0);
        listaComunas.add(comuna12);
        Comuna comuna13 = new Comuna();
        comuna13.setId(14);
        comuna13.setNombre("Limache");
        comuna13.setCosto(2.0);
        listaComunas.add(comuna13);
        Comuna comuna14 = new Comuna();
        comuna14.setId(15);
        comuna14.setNombre("Nogales");
        comuna14.setCosto(2.5);
        listaComunas.add(comuna14);
        Comuna comuna15 = new Comuna();
        comuna15.setId(16);
        comuna15.setNombre("Olmué");
        comuna15.setCosto(1.5);
        listaComunas.add(comuna15);
        Comuna comuna16 = new Comuna();
        comuna16.setId(17);
        comuna16.setNombre("Quillota");
        comuna16.setCosto(2.0);
        listaComunas.add(comuna16);
        Comuna comuna17 = new Comuna();
        comuna17.setId(18);
        comuna17.setNombre("Algarrobo");
        comuna17.setCosto(2.0);
        listaComunas.add(comuna17);
        Comuna comuna18 = new Comuna();
        comuna18.setId(19);
        comuna18.setNombre("Cartagena");
        comuna18.setCosto(3.0);
        listaComunas.add(comuna18);
        Comuna comuna19 = new Comuna();
        comuna19.setId(20);
        comuna19.setNombre("El Quisco");
        comuna19.setCosto(2.0);
        listaComunas.add(comuna19);
        Comuna comuna20 = new Comuna();
        comuna20.setId(21);
        comuna20.setNombre("El Tabo");
        comuna20.setCosto(2.0);
        listaComunas.add(comuna20);
        Comuna comuna21 = new Comuna();
        comuna21.setId(22);
        comuna21.setNombre("San Antonio");
        comuna21.setCosto(3.0);
        listaComunas.add(comuna21);
        Comuna comuna22 = new Comuna();
        comuna22.setId(23);
        comuna22.setNombre("Santo Domingo");
        comuna22.setCosto(2.0);
        listaComunas.add(comuna22);
        Comuna comuna23 = new Comuna();
        comuna23.setId(24);
        comuna23.setNombre("Catemu");
        comuna23.setCosto(3.0);
        listaComunas.add(comuna23);
        Comuna comuna24 = new Comuna();
        comuna24.setId(25);
        comuna24.setNombre("Llay Llay");
        comuna24.setCosto(3.0);
        listaComunas.add(comuna24);
        Comuna comuna25 = new Comuna();
        comuna25.setId(26);
        comuna25.setNombre("Panquehue");
        comuna25.setCosto(1.0);
        listaComunas.add(comuna25);
        Comuna comuna26 = new Comuna();
        comuna26.setId(27);
        comuna26.setNombre("Putaendo");
        comuna26.setCosto(2.5);
        listaComunas.add(comuna26);
        Comuna comuna27 = new Comuna();
        comuna27.setId(28);
        comuna27.setNombre("San Felipe");
        comuna27.setCosto(2.0);
        listaComunas.add(comuna27);
        Comuna comuna28 = new Comuna();
        comuna28.setId(29);
        comuna28.setNombre("Santa María");
        comuna28.setCosto(3.5);
        listaComunas.add(comuna28);
        Comuna comuna29 = new Comuna();
        comuna29.setId(30);
        comuna29.setNombre("Quilpué");
        comuna29.setCosto(2.0);
        listaComunas.add(comuna29);
        Comuna comuna30 = new Comuna();
        comuna30.setId(31);
        comuna30.setNombre("Concón");
        comuna30.setCosto(1.5);
        listaComunas.add(comuna30);
        Comuna comuna31 = new Comuna();
        comuna31.setId(32);
        comuna31.setNombre("Puchuncaví");
        comuna31.setCosto(2.0);
        listaComunas.add(comuna31);
        Comuna comuna32 = new Comuna();
        comuna32.setId(33);
        comuna32.setNombre("Casa Blanca");
        comuna32.setCosto(3.0);
        listaComunas.add(comuna32);
        Comuna comuna33 = new Comuna();
        comuna33.setId(34);
        comuna33.setNombre("Quintero");
        comuna33.setCosto(3.5);
        listaComunas.add(comuna33);
        Comuna comuna34 = new Comuna();
        comuna34.setId(35);
        comuna34.setNombre("Valparaíso");
        comuna34.setCosto(2.0);
        listaComunas.add(comuna34);
        Comuna comuna35 = new Comuna();
        comuna35.setId(36);
        comuna35.setNombre("Villa Alemana");
        comuna35.setCosto(2.5);
        listaComunas.add(comuna35);
        Comuna comuna36 = new Comuna();
        comuna36.setId(37);
        comuna36.setNombre("Viña del Mar");
        comuna36.setCosto(1.5);
        listaComunas.add(comuna36);


        for(int i = 0; i < 36; i++) {
            System.out.println("ID: " + listaComunas.get(i).getId() + " Nombre: " + listaComunas.get(i).getNombre());
        }
        
    
        //creacion de la lista de poblaciones
        System.out.println("Creando poblaciones...");

        for(int cantPoblaciones = 0; cantPoblaciones < 6; cantPoblaciones++) {
            listaPoblaciones.add(new Poblacion());
            for(int i = 0; i < 6; i++) {
                for(int j = 0; j < 6; j++){
                    listaPoblaciones.get(cantPoblaciones).matriz[i][j] = 0;
                }
            }
            //agregar la matriz a la lista
            listaPoblaciones.get(cantPoblaciones).setMatriz(listaPoblaciones.get(cantPoblaciones).matriz);
        }

        //rellenar cada matriz de la lista con unos (antenas) con una probabilidad randon
        System.out.println("Rellenando poblaciones...");

        for(int cantPoblaciones = 0; cantPoblaciones < 5; cantPoblaciones++) {
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5; j++){
                    if(Math.random() < 0.5) {
                        listaPoblaciones.get(cantPoblaciones).matriz[i][j] = 1;
                    }
                }
            }
        }
        //mostrar el valor la lista de matrices
        System.out.println("Mostrando poblaciones...");

        for(int cantPoblaciones = 0; cantPoblaciones < 6; cantPoblaciones++) {
            System.out.println("Matriz: " + (cantPoblaciones+1)); //sumar 1 para que no muestre 0
            for(int i = 0; i < 6; i++) {
                for(int j = 0; j < 6; j++){
                    System.out.print(listaPoblaciones.get(cantPoblaciones).matriz[i][j]);
                }
                System.out.println();
            }
        }
        

        //Evolucion de la poblacion
        listaPoblaciones.get(0).evaluarPoblacion();
        System.out.print("Evolucionando poblaciones...");

        for(int soluciones= 0; soluciones < numGeneraciones; soluciones++){
            if(listaPoblaciones.get(soluciones).evaluarPoblacion()){
                //convertir la matriz en un vector 
                for(int i = 0; i < 6; i++) {
                    for(int j = 0; j < 6; j++){
                        listaPoblaciones.get(soluciones).vector[i*6+j] = listaPoblaciones.get(soluciones).matriz[i][j];
                    }
                }
            }
            //mostrar vector
            System.out.println();
            System.out.println("Mostrar vector " + soluciones);
            
            for(int i = 0; i < 36; i++) {
                System.out.print(listaPoblaciones.get(soluciones).vector[i]);
            }
       
        }

        //Cruzar poblaciones
        System.out.println("Cruzando poblaciones...");
        int contador = 0;
        int largo = listaPoblaciones.size();
        int ejem = listaHijos.size();
        System.out.println("Largo de la lista: " + ejem);
        
        while(contador < largo){
            System.out.println("Hola me caigo aqui ");
            for(int i = 0; i < 36;i++){
                if(i <= 18){
                    listaHijos.get(contador).vector[i] = listaPoblaciones.get(contador).vector[i];
                    
                }
                else{
                    listaHijos.get(contador+1).vector[i] = listaPoblaciones.get(contador+1).vector[i];
                }
            }
            contador++;
            contador++;
        }

        //mostrar vector
        System.out.println("Vector de hijos");
        int largo2 = listaHijos.size();
        int cont2 = 0;
        while(cont2 < largo2) {
            for(int i = 0; i < 36; i++){
                System.out.print(listaHijos.get(cont2).vector[i]);
            }
        }
        


        System.out.println("FIN del programa");
        
    }
}
