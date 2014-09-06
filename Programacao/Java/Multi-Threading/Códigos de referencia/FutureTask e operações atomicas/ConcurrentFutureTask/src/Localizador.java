import java.io.File;
import java.util.concurrent.Callable;


public class Localizador implements Callable<File> {

	private String startDir;
	private String nomeArquivo;
	
	public Localizador(String startDir, String nomeArquivo) {
		this.startDir = startDir;
		this.nomeArquivo = nomeArquivo;
	}

	@Override
	public File call() throws Exception {
		return search(new File(startDir));
	}
	
	private File search(File dir) {
		
		File[] files = dir.listFiles();
		File result = null;
		
		if(files == null) {
			return null;
		}
		
		for (File file : files) {
			if (file.isDirectory()) {
				result = search(file);
				if (result != null) {
					break;
				}
			} else {
				if (file.getName().equalsIgnoreCase(nomeArquivo)) {
					return file;
				}
			}
		}
		
		return result;
	}
}
