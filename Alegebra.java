class Algebra{
  public static void main(String[] args) {


    
    // plotTable(6);
    // printMultiplicationTable();
    
    


    
  }
  
  // prints a multiplication table with row 12 and column 9
  public static void printMultiplicationTable(){
    for (int m = 1; m < 9 ; m++ ) {
      for (int g = 1; g <= 12 ;g++ ) {
        System.out.print("     " + g * m);
      }
      System.out.println();
    }
  }



  // plots a simple quadratic function table with given x-direction limit
  public static void plotTable(int xSize){

    System.out.println("(x , y)");
    for (int i = 0; i < xSize ;i++ ) {
      System.out.println("(" + i + " , " + findY(i) + ")");
    }


  }


  // a method for plotTable method for finding The y value for The variable X, in the plotTable Method loop.
  public static int findY(int y){

    int Y = (int)Math.pow(y, 2);

    return Y;
  }
}
