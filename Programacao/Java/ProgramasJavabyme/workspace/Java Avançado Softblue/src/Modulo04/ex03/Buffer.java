package Modulo04.ex03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Buffer {

	public static int dado;
	static ReentrantReadWriteLock chave = new ReentrantReadWriteLock();
	static Lock w = chave.writeLock();
	static Lock r = chave.readLock();
	static Condition c = w.newCondition();
	static Condition d = r.newCondition();
	public static boolean vazio = true;
	
public static int getDado() {
	r.lock();
	try{
	return dado;
	}finally{r.unlock();}
}

public static void setDado(int dado) {
	w.lock();
	try{
		
	Buffer.dado = dado;
	
	}finally{w.unlock();}
}
	
}
