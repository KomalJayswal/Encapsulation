package net.learning.oop.controller;

import lombok.RequiredArgsConstructor;
import net.learning.oop.model.AccountDetails;
import net.learning.oop.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/accountDetails")

public class BankController {

    @Autowired
    private BankService bankService;

    @PostMapping("/vessel-voyage/documents")
    public String submitImportDocument(@RequestBody AccountDetails requestPayload)  {
        return bankService.updateAccountDetails(requestPayload);
    }

    @GetMapping("/vessel-voyage")
    public ResponseEntity<AccountDetails> submitImportDocument() {
        return bankService.getAccountDetails();
    }
}
