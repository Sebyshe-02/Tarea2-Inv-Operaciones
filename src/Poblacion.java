import java.util.ArrayList;

public class Poblacion {

    public int[][] matriz = new int[6][6];
    public int [] vector = new int[36];

    public Poblacion(){

    }

    //Metodos
    public boolean evaluarPoblacion() {
        
        for(int i = 0; i < 6; i++){
            for(int j= 0; j < 6; j++){
                int filaIzq = i -1;
                int filaDer = i +1;
                int columnaArriba = j -1;
                int columnaAbajo = j +1; 
                
                //evaluar si existe una antena en la posicion actual o en las aledañas
                if(this.matriz[i][j] == 1 ){
                    return true;
                }
                else if(columnaArriba >= 0 && this.matriz[i][j-1] == 1){
                    return true;
                }
                else if(columnaAbajo <= 6 && this.matriz[i][j+1] == 1){
                    return true;
                }
                else if(filaIzq >= 0 && this.matriz[i-1][j] == 1 && filaIzq >= 0){
                    return true;
                }
                else if(filaDer <= 6 && this.matriz[i+1][j] == 1 && filaDer <= 5){
                    return true;
                }
            }
        }
        return false;
    }


    //Getter y Setter
    public int[][] getMatriz() {
        return this.matriz;
    }

    public void setMatriz(int[][] matriz2) {
    }

    public void add(ArrayList<Poblacion> listaPoblaciones) {
    }

    
        
    }