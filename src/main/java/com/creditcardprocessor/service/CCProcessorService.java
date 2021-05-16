package com.creditcardprocessor.service;

import com.creditcardprocessor.model.CCGenericResponse;
import com.creditcardprocessor.model.CCTransactionRequestModel;
import com.creditcardprocessor.model.CreditCardData;
import com.creditcardprocessor.model.CreditCardListResponse;

/**
 * @author
 * @project Credit-Card-Processor
 */

public interface CCProcessorService {

    public CCGenericResponse addCard(CreditCardData creditCardData);

    public CreditCardListResponse getAllCards();

    public CCGenericResponse chargeCard(CCTransactionRequestModel CCTransactionRequestModel);

    public CCGenericResponse credit(CCTransactionRequestModel CCTransactionRequestModel);

}
