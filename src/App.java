import java.util.ArrayList;

public class App {

    public static int numGeneraciones = 5;
    public static void main(String[] args) throws Exception {
        
        ArrayList<Comuna> listaComunas = new ArrayList<Comuna>();
        ArrayList<Poblacion> listaPoblaciones = new ArrayList<Poblacion>();  
        ArrayList<Poblacion> listaHijos = new ArrayList<Poblacion>();

        listaComunas.add(new Comuna(2, "Calle Larga", 1.0));
        listaComunas.add(new Comuna(3, "San Esteban", 1.5)); 
        listaComunas.add(new Comuna(4, "Rinconada", 1.2));
        listaComunas.add(new Comuna(5, "Los Andes", 2.0));
        listaComunas.add(new Comuna(6, "Cabildo", 3.0));
        listaComunas.add(new Comuna(7, "La Ligua", 2.0));
        listaComunas.add(new Comuna(8, "Papudo", 1.0));
        listaComunas.add(new Comuna(9, "Petorca", 1.0));
        listaComunas.add(new Comuna(10, "Zapallar", 3.0));
        listaComunas.add(new Comuna(11, "Hijuelas", 4.0));
        listaComunas.add(new Comuna(12, "La Calera", 3.0));
        listaComunas.add(new Comuna(13, "La Cruz", 3.0));
        listaComunas.add(new Comuna(14, "Limache", 2.0));
        listaComunas.add(new Comuna(15, "Nogales", 2.5));
        listaComunas.add(new Comuna(16, "Olmué", 1.5));
        listaComunas.add(new Comuna(17, "Quillota", 2.0));
        listaComunas.add(new Comuna(18, "Algarrobo", 2.0));
        listaComunas.add(new Comuna(19, "Cartagena", 3.0));
        listaComunas.add(new Comuna(20, "El Quisco", 2.0));
        listaComunas.add(new Comuna(21, "El Tabo", 2.0));
        listaComunas.add(new Comuna(22, "San Antonio", 3.0));
        listaComunas.add(new Comuna(23, "Santo Domingo", 2.0));
        listaComunas.add(new Comuna(24, "Catemu", 3.0));
        listaComunas.add(new Comuna(25, "Llaillay", 3.0));
        listaComunas.add(new Comuna(26, "Panquehue", 1.0));
        listaComunas.add(new Comuna(27, "Putaendo", 2.5));
        listaComunas.add(new Comuna(28, "San Felipe", 2.0));
        listaComunas.add(new Comuna(29, "Santa María", 3.5));
        listaComunas.add(new Comuna(30, "Quilpue", 2.0));
        listaComunas.add(new Comuna(31, "Concón", 1.5));
        listaComunas.add(new Comuna(33, "Puchuncavi", 2.0));
        listaComunas.add(new Comuna(34, "Casablanca", 3.0));
        listaComunas.add(new Comuna(35, "Quintero", 3.5));
        listaComunas.add(new Comuna(36, "Valparaiso", 2.0));
        listaComunas.add(new Comuna(37, "Villa Alemana", 2.5));
        listaComunas.add(new Comuna(38, "Viña del Mar", 1.5));

        

        System.out.println("Lista de comunas de la ciudad de Valparaiso: ");
        System.out.println(" ");
        for(int i = 0; i < 36; i++) {
            System.out.println(i +  " "+ "ID: " + listaComunas.get(i).getId() + " Nombre:   " + listaComunas.get(i).getNombre());
        }
        
    
        //creacion de la lista de poblaciones
        System.out.println(" ");
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
            System.out.println(" ");
            System.out.println("Matriz " + (cantPoblaciones+1)); //sumar 1 para que no muestre 0
            System.out.println(" ");
            for(int i = 0; i < 6; i++) {
                for(int j = 0; j < 6; j++){
                    System.out.print(listaPoblaciones.get(cantPoblaciones).matriz[i][j]);
                }
                System.out.println();
            }
        }
        

        //Evolucion de la poblacion
        System.out.println(" ");
        System.out.print("Evolucionando poblaciones...");
        System.out.println(" ");

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
            System.out.println();
            System.out.println("Mostrar vector " + soluciones);
            System.out.println();
            
            for(int i = 0; i < 36; i++) {
                System.out.print(listaPoblaciones.get(soluciones).vector[i]);
            }
       
        }

        //Cruzar poblaciones
        System.out.println();
        System.out.println();
        System.out.println("Cruzando poblaciones...");
        int contador = 0;
        int largo = listaPoblaciones.size();
        

        while(contador < largo){
            listaHijos.add(new Poblacion());
            if(contador == 1 || contador % 2 != 0){
                listaHijos.get(contador).vector = listaPoblaciones.get(contador).vector;
            }
            else{
                for(int i = 18; i < 36; i++){
                    listaHijos.get(contador).vector[i] = listaPoblaciones.get(contador+1).vector[i];
                }
            }
            contador++;
        }

        //mutar poblaciones
        System.out.println("Mutando poblaciones...");
        for(int i = 0; i < listaHijos.size(); i++){
            for(int j = 0; j < 36; j++){
                if(Math.random() < 0.3){
                    if(listaHijos.get(i).vector[j] == 0){
                        listaHijos.get(i).vector[j] = 1;
                    }
                }
            }
        }

        //Seleccionar la mejor poblacion
        System.out.println("Seleccionando la mejor poblacion...");
        System.out.println();
        Double maxCoste = 0.0;
        Double mejorCosto = 0.0;
        int mejorPoblacion = 0;
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 36; j++){
                if(listaHijos.get(i).vector[j] == 1){
                    maxCoste = maxCoste + listaComunas.get(i).getCosto();
                    System.out.println("Posicion: " + j + " " + "Coste: " + listaComunas.get(j).getCosto() + " Nombre: " + listaComunas.get(j).getNombre());
                }
            }

            if(maxCoste > mejorCosto){
                mejorCosto = maxCoste;
                mejorPoblacion = i;
            }
        }
        System.out.println();
        System.out.println("La mejor poblacion es: " + mejorPoblacion);
        System.out.println();
        System.out.println("El vector resultante es:");
        for(int i = 0; i < 36; i++){
            System.out.print(listaHijos.get(mejorPoblacion).vector[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("El mejor costo es: " + mejorCosto);
        System.out.println();
        System.out.println("FIN del programa.. ");
        
    }
}
