
public class SingletonSicronizado {
	
	private static SingletonSicronizado instance;
	
	private SingletonSicronizado() {}
	
	public synchronized static SingletonSicronizado getInstance() {
		if(instance == null) {
			instance = new SingletonSicronizado();
		}
		return instance;
	}

}
