package org.prog.session17;

import io.cucumber.messages.ndjson.internal.com.fasterxml.jackson.core.sym.Name2;
import lombok.SneakyThrows;
import org.prog.session17.dto.PersonDto;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import java.sql.*;

public class dbPhoneTest {
    private String checkSQL = "SELECT * FROM PHONES WHERE PHONE_NAMES = ?";
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

    public boolean cHeckSQL(String keyName) throws SQLException {
        PreparedStatement checkPhoneKey = conn.prepareStatement(checkSQL);
        checkPhoneKey.setString(1, keyName);
        checkPhoneKey.executeQuery();
        ResultSet rs = checkPhoneKey.executeQuery();
        return rs.next();
    }
    public void phoneDB(String name, String code, String price) throws SQLException {
        PreparedStatement phoneFind = conn.prepareStatement(insertSQL);
        phoneFind.setString(1, name);
        phoneFind.setString(2, code);
        phoneFind.setString(3, price);
        phoneFind.execute();
    }

     }

