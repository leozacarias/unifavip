
public class SingletonSimples {

	private static SingletonSimples instance;
	
	private SingletonSimples() {}
	
	public static SingletonSimples getInstance() {
		if(instance == null) {
			instance = new SingletonSimples();
		}
		return instance;
	}
	
}
