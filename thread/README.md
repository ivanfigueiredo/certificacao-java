import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

Lock lock = new ReentrantLock(); </br>
lock.unlock(); </br>
Se unlock() for chamado para liberar um bloquei que
não existe, será lançada uma exceção em tempo de execução:
IllegalMonitorStateException que extende RuntimeException.