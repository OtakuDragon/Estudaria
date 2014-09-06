package Modulo04.exemploFutureTask;

import java.util.concurrent.Callable;

public class Cousin implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		
		
		return Daughter.CheckHerFacebook();
	}

}
