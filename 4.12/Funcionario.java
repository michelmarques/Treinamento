class Funcionario {
   String nome;
   String departamento;
   double salario;
   String dataEntrada;
   String numeroRG;

  void recebeAumento(double valor) {
    this.salario += valor;
  }

  double calculaGanhoAnual() {
    double ganhoAnual = this.salario * 12;
    return ganhoAnual;
  }

  void mostra() {
    System.out.println("Nome: " + this.nome);
    System.out.println("Depatamento: " + this.departamento);
    System.out.println("Salario: " + this.salario);
    System.out.println("Data de Entrada: " + this.dataEntrada);
    System.out.println("RG: " + this.numeroRG);
  }
}