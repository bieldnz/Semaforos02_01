package controllerCarros;

import java.util.concurrent.Semaphore;

public class SemaforoCarro extends Thread{
	
	int idCarro;
	Semaphore semaforo;
	
	public SemaforoCarro(Semaphore semaforo) {
		this.idCarro = (int)threadId();
		this.semaforo = semaforo;
	}
	
	public void run() {
		try {
			semaforo.acquire();
			System.out.println("#"+idCarro+" passou");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}finally {
			semaforo.release();
		}
	}
}
