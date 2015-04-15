class Exercicio5 {
  public static void main(String[] args) {
    long fatorial =1;
    for(int i = 1; i <= 40; i++) {
      fatorial = fatorial * i;
    }
    System.out.println("Fatorial = " + fatorial);
  }
}