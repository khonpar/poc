/**
 *
 */
package com.creditcardprocessor.utils;

import com.creditcardprocessor.constants.CreditCardDataConstants;
import com.creditcardprocessor.model.CCTransactionRequestModel;
import com.creditcardprocessor.model.CreditCardData;

/**
 * @author
 * @project Credit-Card-Processor
 */

public class CCProcessorUtils {

    public static boolean validateCardDetails(CreditCardData creditCardData) {
        boolean cardResult = true;

        try {
            if (creditCardData.getCardNumber().length() > 19 || Long.parseLong(creditCardData.getCardNumber()) < 0) {
                cardResult = false;
            }
        } catch (NumberFormatException e) {
            cardResult = false;
        }

        return cardResult;
    }

    public static boolean validateChargeDetails(CCTransactionRequestModel request) {
        boolean chargeResult = true;

        try {
            String charges = request.getTransactionAmount();
            if (null == charges || !charges.startsWith(CreditCardDataConstants.POUND)) {
                chargeResult = false;
            } else {
                charges = charges.substring(1, request.getTransactionAmount().length());
                request.setTransactionAmount(charges);

                if (Double.parseDouble(charges) < 0) {
                    chargeResult = false;
                }
            }

        } catch (Exception e) {
            chargeResult = false;
        }

        return chargeResult;
    }

    public static String formatAmount(String amount) {
        String formattedAmount = null;
        amount = String.format("%.2f", Double.parseDouble(amount));
        if (Double.parseDouble(amount) >= 0) {
            formattedAmount = CreditCardDataConstants.POUND + amount;
        } else {
            formattedAmount = CreditCardDataConstants.NEGATIVE_POUND + String.format("%.2f", Math.abs(Double.parseDouble(amount)));
        }

        return formattedAmount;
    }

}
