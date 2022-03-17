//    ______      __    __    __
//   / ____/___  / /_  / /_  / /__
//  / /   / __ \/ __ \/ __ \/ / _ \
// / /___/ /_/ / /_/ / /_/ / /  __/
// \____/\____/_.___/_.___/_/\___/

public class Sudoku {
   
    private static int[][] tab;

    public Sudoku(){
        tab = new int[9][9];

    }
    
    public void tableauVide(){
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9; j++){
                tab[i][j] = 0;               
            }        
        }

    }

    public void setTab(){
        tab[0][0] = 1;
        tab[0][5] = 7;
        tab[0][7] = 9;

        tab[1][1] = 3;
        tab[1][4] = 2;
        tab[1][8] = 8;

        tab[2][2] = 9;
        tab[2][3] = 6;
        tab[2][6] = 5;

        tab[3][2] = 5;
        tab[3][3] = 3;
        tab[3][6] = 9;

        tab[4][1] = 1;
        tab[4][4] = 8;
        tab[4][8] = 2;

        tab[5][0] = 6;
        tab[5][5] = 4;

        tab[6][0] = 3;
        tab[6][7] = 1;

        tab[7][1] = 4;
        tab[7][8] = 7;

        tab[8][2] = 7;
        tab[8][6] = 3;
        

    }


    public void affichTableau(){
        System.out.println(" ");
        for(int i = 0 ; i < tab.length ; i++){
            
            System.out.print("|");      
            for(int j = 0 ; j < tab.length; j++){                 
                System.out.print(tab[i][j]);
                System.out.print("|"); 
                
            }
            System.out.println(" ");

            

            System.out.println(" ");
        }
        System.out.println(" ");

    }

    public Boolean estPossible(int v, int i, int j){
        boolean r;
        r = true;

        for (int x = 0; x < tab.length; x++){
            if(tab[x][j] == v){
                r = false;
            }
        }

        for (int y = 0; y < tab.length; y ++){
            if(tab[i][y] == v){
                r = false;
            }
        }

        int x1 = 3*(i/3);
        int y1 = 3*(j/3);

        for(int x = 0; x < 3; x++){
            for (int y = 0; y < 3; y++){
                if(tab[x+x1][y+y1] == v){
                    r = false;
                }
            }
        }
        return r;
        
    }

    public int[] caseSuivante(int i, int j){
        int [] r = new int[2];
        if (i == 8 && j == 8){
            System.out.println("Vous êtes à la fin des limites");

            r[0]=i;
            r[1]=j+1;
            return r;
        }
        if (j == 8 ){

            r[0] = i + 1;
            j = 0;
            r[1] = j;

            //System.out.println(r[0] + "  " + r[1]);
            return r;
            
        }
        else{
            r[0]=i;
            r[1] = j + 1;

            //System.out.println(r[0] + "  " + r[1]);
            return r;
        }
    }

    public boolean solve(int i, int j)
    {
        boolean t = true;
        int r[] = new int [2];

        if (j == 9 && i == 8){
            return t;
        }
        if (tab[i][j] > 0){
            r = caseSuivante(i, j);
            return solve(r[0],r[1]);
        }        
        if (tab[i][j]==0){
            for (int v = 1; v <= 9; v++){
                if (estPossible(v, i, j)){
                    tab[i][j] = v;
                    boolean rep = solve(r[0], r[1]);
                    if (rep){
                        return t;
                    } 
                    else {
                        tab[i][j]=0;
                    }
                }
            }
        }
        return false;
    }
}



