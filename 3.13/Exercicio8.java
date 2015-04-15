class Exercicio8 {
  public static void main(String[] args) {
    for (int n = 1; n <= 10; n++) {
      for (int i = 1; i <= n; i++) {
        if ((n * i) < 10) {
          System.out.print((n * i) + "   ");
        }
        else {
          System.out.print((n * i) + "  ");
        }
      }
      System.out.println("");
    }
  }
}