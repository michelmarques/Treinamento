class Exercicio6 {
  public static void main(String[] args) {
    int numeroAnterior = 0;
    int numeroAtual = 0;
    int fibonacci= 1;

    System.out.println(numeroAnterior);
    while(fibonacci <= 100) {
      System.out.println(fibonacci);
      numeroAtual = fibonacci;
      fibonacci += numeroAnterior;
      numeroAnterior = numeroAtual;      
    };
    System.out.println(fibonacci);
  };
};