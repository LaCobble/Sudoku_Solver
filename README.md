# Sudoku Solver

[![CI](https://github.com/LaCobble/Sudoku_Solver/actions/workflows/ci.yml/badge.svg)](https://github.com/LaCobble/Sudoku_Solver/actions/workflows/ci.yml)
[![License: MIT](https://img.shields.io/badge/license-MIT-blue.svg)](LICENSE)
![Java 17](https://img.shields.io/badge/Java-17-orange.svg)
![Console](https://img.shields.io/badge/UI-console-lightgrey.svg)

A Java program that solves a 9 x 9 Sudoku grid with a **backtracking** algorithm and prints the result in the console.

## What it does

`Main` loads a sample grid (`0` = empty cell), prints it, runs a few checks of the helper methods, solves the grid and prints the solution.

## Screenshots

<table>
  <tr>
    <td align="center" valign="top" width="50%"><img src="docs/images/sudoku-input.webp" alt="Input grid printed by the program, with 0 for empty cells"><br><sub>Input grid (0 = empty)</sub></td>
    <td align="center" valign="top" width="50%"><img src="docs/images/sudoku-solved.webp" alt="Solved grid printed by the program"><br><sub>Solved grid</sub></td>
  </tr>
</table>

*Rendered from the real console output of `java -cp out Main`. "Affichage du tableau début / fin" means "initial / final grid".*

To solve another grid, edit the values in `Sudoku.setTab()`.

## Requirements

- A JDK (tested with JDK 17).

## Build and run

```bash
git clone https://github.com/LaCobble/Sudoku_Solver.git
cd Sudoku_Solver
javac -encoding UTF-8 -d out *.java
java -cp out Main
```

## Project structure

```
├── Main.java    # Demo: prints the grid, tests the helpers, solves and prints the solution
└── Sudoku.java  # The grid and the solver
```

Main methods of `Sudoku`:

| Method | Role |
| --- | --- |
| `tableauVide()` | Initialises an empty grid. |
| `setTab()` | Sets the grid to solve (edit it to try another puzzle). |
| `affichTableau()` | Prints the grid. |
| `estPossible(...)` | Checks whether a value can be placed in a cell without breaking the row, column and 3 x 3 box rules. |
| `caseSuivante(...)` | Returns the coordinates of the next cell (row by row). |
| `solve(row, col)` | Recursive backtracking solver. |

## What it demonstrates

- **Backtracking**: try a value in an empty cell, recurse to fill the rest of the grid, undo the choice when a dead end is reached.
- Constraint checking on rows, columns and 3 x 3 boxes.
- Recursive problem solving on a 2D array.

The solver targets standard puzzles; very hard grids can take much longer, since there is no heuristic to choose the next cell.

## Context

Second-year Computer Science assignment at university (2022). Method names and messages are in French.

## Contributing

This is an archived learning project, but issues and pull requests are welcome: see [CONTRIBUTING.md](CONTRIBUTING.md) and the [Code of Conduct](CODE_OF_CONDUCT.md).

## License

[MIT](LICENSE) © LaCobble
