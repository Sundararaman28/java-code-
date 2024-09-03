class arrays{
  public static void main(String[] args) {
    // String[] cars = new String[3];
    // cars[0] = "bmw";
    // cars[1] = "carvolet";
    // cars[2] = "tesla";
    // System.out.println(cars[1]);

    // for (int i =0; i<cars.length;i++){
    //   System.out.println(cars[i]);
    //}

    //2D Array 
    String[][] cars = new String[3][3];
    cars[0][0] = "camero";
    cars[0][1] = "sundar";
    cars[0][2] = "raman";
    cars[1][0] = "mohan";
    cars[1][1] = "bhuvan";
    cars[1][2] = "dinesh";
    cars[2][0] = "karan";
    cars[2][1] = "maha";
    cars[2][2] = "vishnu";

    for(int i =0;i<cars.length;i++){
      for(int j =0;j<cars[i].length;j++){
        System.out.print(cars[i][j]+" ");
      }
      System.out.println("");
    }
  }
}