package com.financialservices.application;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.financialservices.models.Account;
import com.financialservices.models.Transaction;

@RestController
public class FinancialServicesController {

	// Creates an account
	@PostMapping("/accounts")
	ResponseEntity<Account> createAccount(@RequestBody Account account) {
		return ResponseEntity.ok(account);
	}

	// Returns an account based on the account id
	@GetMapping("/accounts/{accountId}")
	ResponseEntity<Account> getAccount(@PathVariable int accountId) {
		return ResponseEntity.ok(new Account());
	}

	// Creates an account
	@PostMapping("/transactions")
	ResponseEntity<Transaction> createTransaction(@RequestBody Transaction transaction) {
		return ResponseEntity.ok(new Transaction());
	}

	// Returns an account based on the account id
	@GetMapping("/accounts/{accountId}")
	ResponseEntity<List<Transaction>> getAllTransactions(@RequestParam int accountId) {
		return ResponseEntity.ok(new ArrayList<Transaction>());
	}

}
