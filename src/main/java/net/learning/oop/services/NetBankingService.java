package net.learning.oop.services;

import net.learning.oop.model.CustomerDetails;
import org.springframework.http.ResponseEntity;

/**
 * Now Ashsish went home, and via net Banking wants to check his Account Balance.
 */

public interface NetBankingService {

    /**
     *
     * @param customerDetails
     * @return
     */
    default String updateAccountDetails(CustomerDetails customerDetails){
        return null;
    }

    /**
     *
     * @return
     */
    ResponseEntity<CustomerDetails> getAccountDetails();
}
