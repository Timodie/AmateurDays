
public class Sudoku {

	private static final int D = 2;
	private static final int DD = D * D; // size of grid
	private static int count = 0;

	private static void solve(int[][] grid) {
		grid = grid.clone(); // do not change input
		System.out.println("there");
		search(grid, 0, 0);
	}

private static void search(int[][] grid, int i, int j) {
  if (i == DD) {
	  System.out.print(grid);
	  return;
  }
  	int nextI = i;
  	int nextJ = j;
  	++nextJ;
  	if (nextJ == DD) {
  		++nextI;
  		nextJ = 0;
  	}
  	if (grid[i][j] == 0) {
  		for (int g = 1; g <= DD; ++g) {
  			grid[i][j] = g;
  			if (consistent(grid, i, j))
  				search(grid, nextI, nextJ);
  		}
  		grid[i][j] = 0;
  	} else {
  		search(grid, nextI, nextJ);
  	}
	}

	private static boolean consistent(int[][] grid, int i, int j) {
		if (grid[i][j] == 0)
			return true;
		//test column
		for (int k = 0; k < DD; ++k) {
			if (k != i && grid[i][j] == grid[k][j])
				return false;
		}
		//test row
		for (int k = 0; k < DD; ++k) {
			if (k != j && grid[i][j] == grid[i][k])
				return false;
		}
		//test box
int ii = i - i % D;
int jj = j - j % D;
for (int boxI = 0; boxI < D; ++boxI) {
for (int boxJ = 0; boxJ < D; ++boxJ) {
if (ii + boxI == i && jj + boxJ == j)
continue;
if (grid[i][j] == grid[ii + boxI][jj + boxJ])
return false;
}
}
return true;
}
	private static void print(int[][] grid) {
		++count;
		System.out.println();
		System.out.println("Solution " + count);
		for (int i = 0; i < DD; ++i) {
			for (int j = 0; j < DD; ++j) {
				System.out.print(grid[i][j]);
}
			System.out.println();
}
}
public static void main(String[] args) {
	System.out.println("here");
	int[][] grid = new int[DD][DD];
//     if (args.length != DD)
//    	 
//    	 return;
     for (int i = 0; i < DD; ++i) {
    	 if (args[i].length() != DD)
    		 return;
    for (int j = 0; j < DD; ++j) {
	int g = args[i].charAt(j) -'0';
		if (g < 0 || g > DD)
			return;
		System.out.println("here2");
		grid[i][j] = g;
    }
     }
     for (int i = 0; i < DD; ++i) {
    	 for (int j = 0; j < DD; ++j) {
    		 System.out.println("here1");
    		 if (!consistent(grid, i, j))
    			 return;

}
}
	//System.out.println("here");
     solve(grid);
}

}
