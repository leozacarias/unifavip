
public class SingletonDuplaVerificacao {

	private static SingletonDuplaVerificacao instance;
	
	private SingletonDuplaVerificacao() {}
	
	public static SingletonDuplaVerificacao getInstance() {
		if(instance == null) {
			synchronized(SingletonDuplaVerificacao.class) {
				if(instance == null) {
					instance = new SingletonDuplaVerificacao();
				}
			}
		}
		return instance;
	}
	
}
