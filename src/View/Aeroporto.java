package View;

import java.util.concurrent.Semaphore;

import Controller.ThreadAeroporto;

public class Aeroporto {
	public static void main(String[] args) {
		Semaphore limite = new Semaphore(2);
		String direcao = null;

		for (int i = 1; i <= 12; i++) {
			
			int random = (int) (Math.random()*2);

			if (random == 0)
				direcao = "norte";
			if (random == 1)
				direcao = "sul";
			
			Thread t = new ThreadAeroporto(i, limite, direcao);
			t.start();
		}
	}
}
