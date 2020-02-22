package standard.teste1.q69;

interface Account{
	default String getId() {
		return "0000";
	};
}
public interface PremiumAccount extends Account{
	
}
