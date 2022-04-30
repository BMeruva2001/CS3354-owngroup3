public class Pay
{
    public static String[] existing = {"1111111111111111", "0322", "012", "Bruce Wayne"};

    public static String card(String creditNum, String expiryDate, String CVV, String cardName) {
    	if (checkCreditNum(creditNum) == true && checkExpiry(expiryDate) == true && checkCVV(CVV)== true && checkCardName(cardName)== true) {
    		return "Successful Payment";
		}
		else {
			return "Failed Payment";
		}
    }

    public static boolean checkCreditNum(String creditNum) {
    	for (String credit : existing) {
    		if (creditNum.equals(credit)) {
    			return true;
    		}
    	}
    	return false;
    }

     public static boolean checkExpiry(String expiryDate) {
	    	for (String exp : existing) {
	    		if (expiryDate.equals(exp)) {
	    			return true;
	    		}
	    	}
	    	return false;
    }

    public static boolean checkCVV(String CVV) {
		    	for (String cvv : existing) {
		    		if (CVV.equals(cvv)) {
		    			return true;
		    		}
		    	}
		    	return false;
    }

    public static boolean checkCardName(String cardName) {
			    	for (String name : existing) {
			    		if (cardName.equals(name)) {
			    			return true;
			    		}
			    	}
			    	return false;
    }
}
