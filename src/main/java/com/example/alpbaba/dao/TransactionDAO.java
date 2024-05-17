package com.example.alpbaba.dao;

import com.example.alpbaba.utils.DBUtil;
import com.example.alpbaba.models.Transaction;
import com.example.alpbaba.models.Transaction;
import com.example.alpbaba.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDAO {

    public void addTransaction(Transaction transaction) {
        String query = "INSERT INTO transactions (book_id, username, borrow_date, return_date) VALUES (?, ?, ?, ?)";
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, transaction.getBookId());
            statement.setString(2, transaction.getUsername());
            statement.setDate(3, java.sql.Date.valueOf(transaction.getBorrowDate()));
            statement.setDate(4, java.sql.Date.valueOf(transaction.getReturnDate()));
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Add other CRUD operations as needed
}
