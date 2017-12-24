public class Withdrawal extends Transaction {

	private int from;
	private Money amount;

	/**
	 * 
	 * @param atm
	 * @param session
	 * @param card
	 * @param pin
	 */
	public Withdrawal(ATM atm, Session session, Card card, int pin) {
		// TODO - implement Withdrawal.Withdrawal
		throw new UnsupportedOperationException();
	}

	public Message getSpecificsFromCustomer() {
		// TODO - implement Withdrawal.getSpecificsFromCustomer
		throw new UnsupportedOperationException();
	}

	public Receipt completeTransaction() {
		// TODO - implement Withdrawal.completeTransaction
		throw new UnsupportedOperationException();
	}

}