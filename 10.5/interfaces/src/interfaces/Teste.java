package interfaces;

public class Teste {
	public static void main(String[] args) {
		// Criando as variáveis para os tipos criados
		AreaCalculavel r = new Retangulo(3, 2);
		AreaCalculavel q = new Quadrado(3);
		AreaCalculavel c = new Circulo(3);
		
		// Mostrando as áreas de cada variável
		System.out.println(r.calculaArea());
		System.out.println(q.calculaArea());
		System.out.println(c.calculaArea());
	}
}
