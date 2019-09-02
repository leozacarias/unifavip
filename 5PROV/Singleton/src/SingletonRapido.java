
public class SingletonRapido {
	
	private static SingletonRapido instance = new SingletonRapido();
	
	private SingletonRapido() {}
	
	public static SingletonRapido getInstance() {
		return instance;
	}

}
