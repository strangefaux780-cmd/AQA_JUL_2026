package org.prog.session17;

import io.cucumber.messages.ndjson.internal.com.fasterxml.jackson.core.sym.Name2;
import lombok.SneakyThrows;
import org.prog.session17.dto.PersonDto;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class dbPhoneTest {
    private String insertSQL =
            "INSERT INTO PHONES(PHONE_NAMES,CODE_PHONES,PRICE_PHONES) VALUES (?, ?, ?)";
    private Connection conn;

    @SneakyThrows
    @BeforeSuite
    public void connectDB() {
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/db",
                "root",
                "password");
    }

    @SneakyThrows
    @AfterMethod
    public void closeDB() {
        if (conn != null) {
            conn.close();
        }
    }

    public void phoneDB(String Name, String Code, String Price) throws SQLException {
        PreparedStatement phoneFind = conn.prepareStatement(insertSQL);
        phoneFind.setString(1, Name);
        phoneFind.setString(2, Code);
        phoneFind.setString(3, Price);
        phoneFind.execute();


    }

     }

