package homeWork.bank;

@SuppressWarnings("serial")
public class TransaktionsException extends Exception {

	public TransaktionsException() {
		super("Sie haben eine negative Einzahlung get�tigt oder ihr Konto �berzogen.");
	}
}