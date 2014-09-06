import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;


public class Aplicacao {

	public static void main(String[] args) throws Exception {
		
		ExecutorService e = Executors.newSingleThreadExecutor();
		
		Localizador l = new Localizador("c:/users/carlos", "softblue.txt");
		FutureTask<File> task = new FutureTask<File>(l);
		e.execute(task);
		
		while (!task.isDone()) {
			System.out.println("Aguarde! Procurando arquivo...");
			Thread.sleep(2000);
		}
		
		File file = task.get();
		
		if (file != null) {
			System.out.println("Local do arquivo: " + file.getPath());
			
		} else {
			System.out.println("Arquivo não encontrado");
		}
		
		e.shutdown();
	}
}
