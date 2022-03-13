public class Main {

    public static void main(String[] args) {

		Sudoku s = new Sudoku();
        s.setTab();
        System.out.println("Affichage du tableau début");
        s.affichTableau();
        System.out.println("  ");

        System.out.println("Test de est possible");
        System.out.println("  ");

        boolean f = s.estPossible(1, 1, 2);
        System.out.println(f);
        System.out.println("  ");
        
        boolean d = s.estPossible(8, 6, 6);
        System.out.println(d);
        System.out.println("  ");

        boolean e = s.estPossible(5, 4, 3);
        System.out.println(e);
        System.out.println("  ");

        boolean x = s.estPossible(8, 0, 0);
        System.out.println(x);
        System.out.println("  ");

        System.out.println("Test de case suivante : ");
        System.out.println("  ");
        s.caseSuivante(0, 0);
        s.caseSuivante(4, 8);
        s.caseSuivante(8, 8);
        System.out.println("  ");

        s.solve(0,0);
        System.out.println("  ");

        
        System.out.println("Affichage du tableau fin");
        s.affichTableau();
        System.out.println("  ");
    }
}
