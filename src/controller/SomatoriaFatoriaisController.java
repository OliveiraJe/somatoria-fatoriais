package controller;

public class SomatoriaFatoriaisController {
	public SomatoriaFatoriaisController() {
		super();
	}

	public double somatoria(int a) {
		// condição de parada quando n chega a 1, retorna o primeiro termo(1/1 = 1)
		if (a == 1) {
			return 1.0;
		}

		// a soma de N termos é(o termo atual 1/N) + (a soma dos termos de 1 até n-1)
		else {
			return (1.0 / fatorial(a)) + somatoria(a - 1);
		}
	}

	public int fatorial(int a) {
		// condição de parada. O fatorial de 1 é definido como 1.
		// Quando n chega a 1, a função para de chamar a si mesma e retorna 1.
		if (a == 1) {
			return 1;
		}
		// O fatorial de n é o próprio n multiplicado pelo fatorial de n - 1.
		else {
			return a * fatorial(a - 1);
		}
	}
}
