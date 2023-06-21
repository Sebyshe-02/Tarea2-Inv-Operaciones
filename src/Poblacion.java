public class Poblacion {

    public int[][] matriz = new int[5][5];

    public Poblacion(){

    }

    //Metodos
    public boolean evaluarPoblacion() {
        
        for(int i= 0; i < 5; i++){
            for(int j= 0; j < 5; j++){
                if(this.matriz[i][j-1] == 1){
                    return true;
                }
                else if(this.matriz[i][j+1] == 1){
                    return true;
                }
                else if(this.matriz[i-1][j] == 1){
                    return true;
                }
                else if(this.matriz[i+1][j] == 1){
                    return true;
                }
                else if(this.matriz[i][j] == 1){
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

    
        
    }