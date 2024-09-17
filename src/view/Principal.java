package view;

import java.util.concurrent.Semaphore;

import controllerCarros.SemaforoCarro;

public class Principal {
	public static void main(String[] args) {
		int permissoes = 1;
		Semaphore semaforo = new Semaphore(permissoes);
		for(int x = 0; x < 4; x++) {
			SemaforoCarro carro = new SemaforoCarro(semaforo);
			carro.start();
		}
	}
}
