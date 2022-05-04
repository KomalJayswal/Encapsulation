package net.learning.oop.controller;

import lombok.RequiredArgsConstructor;
import net.learning.oop.model.CustomerDetails;
import net.learning.oop.services.NetBankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Net Banking to retrive or update the Bank Details of the Customer
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/netBanking")

public class IntBankingController {

    @Autowired
    private NetBankingService netBankingService;

    @PostMapping("/update/Bank/Details")
    public String submitImportDocument(@RequestBody CustomerDetails requestPayload)  {
        return netBankingService.updateAccountDetails(requestPayload);
    }

    @GetMapping("/get/Bank/Details")
    public ResponseEntity<CustomerDetails> submitImportDocument() {
        return netBankingService.getAccountDetails();
    }
}
