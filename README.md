# Sudoku Solver

This Java project aims to automatically solve a given Sudoku grid. The algorithm works for a normal (simple) Sudoku grid, but may require adjustments for more complex grids. This project was developed as a second-year assignment for a Computer Science program in a university.

## Usage

1. Clone the repository to your local machine:

```bash
git clone https://github.com/LaCobble/Sudoku_Solver
```

## How It Works
The Sudoku class represents the Sudoku grid and contains the necessary methods for solving the puzzle. The algorithm uses a backtracking approach to explore all possible solutions until a valid solution is found.

The tableauVide method initializes an empty Sudoku grid.

The setTab method sets the initial values of the Sudoku grid to solve. Modify this method to provide your own Sudoku grid.

The affichTableau method displays the Sudoku grid on the console.

The estPossible method checks if it's possible to place a value at a given position in the grid without breaking any Sudoku rules.

The caseSuivante method returns the coordinates of the next empty cell in the grid.

The solve method implements the backtracking algorithm to solve the Sudoku puzzle.

The Main class contains the main method where you can initialize a Sudoku object, set the initial grid, and call the solving algorithm.

## Example
Here's an example usage of the Sudoku solver:
```
Sudoku s = new Sudoku();
s.setTab();
System.out.println("Initial Sudoku grid:");
s.affichTableau();
System.out.println();

s.solve(0, 0);
System.out.println();

System.out.println("Solved Sudoku grid:");
s.affichTableau();
System.out.println();
```
![image](https://user-images.githubusercontent.com/71151090/158797723-044c161f-1ada-405f-95b3-0529e0fb0a2f.png)

## Contributing
Contributions to this project are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License
This project is licensed under the MIT License. For more information, see the LICENSE file.

Feel free to customize the content, such as adding more information about the project or providing additional sections as needed.

If you have any further questions, please let me know!
