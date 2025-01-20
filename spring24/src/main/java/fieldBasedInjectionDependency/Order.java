package fieldBasedInjectionDependency;

public class Order {

	 private String itemId;
	 private PaymentDetails paymentDetails;

	    public Order(String itemId, PaymentDetails paymentDetails) {
	        this.itemId = itemId;
	        this.paymentDetails = paymentDetails;
	    }

	    	public String getItemId() {
	        return itemId;
	    }

	    public PaymentDetails getPaymentDetails() {
	        return paymentDetails;
	    }
	

	public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public void setPaymentDetails(PaymentDetails paymentDetails) {
			this.paymentDetails = paymentDetails;
		}


	
}
