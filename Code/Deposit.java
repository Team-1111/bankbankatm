public class Deposit extends Transaction {

	private int to;
	private Money amount;

	/**
	 * 
	 * @param atm
	 * @param session
	 * @param card
	 * @param pin
	 */
	public Deposit(ATM atm, Session session, Card card, int pin) {
		// TODO - implement Deposit.Deposit
		throw new UnsupportedOperationException();
	}

	public Message getSpecificsFromCustomer() {
		// TODO - implement Deposit.getSpecificsFromCustomer
		throw new UnsupportedOperationException();
	}

	public Receipt completeTransaction() {
		// TODO - implement Deposit.completeTransaction
		throw new UnsupportedOperationException();
	}

}