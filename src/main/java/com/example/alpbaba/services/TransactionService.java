package com.example.alpbaba.services;

import com.example.alpbaba.dao.TransactionDAO;
import com.example.alpbaba.models.Transaction;
import com.example.alpbaba.dao.TransactionDAO;
import com.example.alpbaba.models.Transaction;

public class TransactionService {
    private TransactionDAO transactionDAO;

    public TransactionService() {
        this.transactionDAO = new TransactionDAO();
    }

    public void addTransaction(Transaction transaction) {
        transactionDAO.addTransaction(transaction);
    }

    // Add other business logic as needed
}
