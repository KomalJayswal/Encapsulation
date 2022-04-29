package net.learning.oop.services;

import net.learning.oop.model.AccountDetails;
import org.springframework.http.ResponseEntity;

/**
 * Now Ashsish went home, and via net Banking wants to check his Account Balance.
 */

public interface BankService {

    /**
     *
     * @param accountDetails
     * @return
     */
    String updateAccountDetails(AccountDetails accountDetails);

    /**
     *
     * @return
     */
    ResponseEntity<AccountDetails> getAccountDetails();
}
