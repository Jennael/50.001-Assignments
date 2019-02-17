//package com.example.meimei.fqpreorder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

public class submitData {

    private static Connection connection = null;
    private static Statement statement;
    private ResultSet results;
    private String query;
    private String newHomeTeam;
    private String newAwayScore;
    private String newHomeScore;
    private String newAwayTeam;

    Connection conn = DriverManager.getConnection("jdbc:mysql://mysql2.000webhost.com/a4931569_users", username, pass);



    public static void submitTime(Date time){




    }

    public static void submitCount(int count) {

    }

    public MatchResults() throws ClassNotFoundException
    {
        try
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        }
        catch (ClassNotFoundException cnfEx)
        {
            throw new ClassNotFoundException(
                        "Unable to locate JDBC driver!");
        }
    }

    public void newMatchBean() throws SQLException, ClassNotFoundException
    {

        connectAndCreateStatement();
        String query = "INSERT INTO Results VALUES('" + newHomeTeam + "','"
                + newAwayTeam + "','" + newHomeScore + "','" + newAwayScore
                + "')";
        statement.executeUpdate(query);

        System.out.println("\nContents after insertion:\n");
        disconnectFromDb();

    }

    private static void connectAndCreateStatement() throws SQLException,ClassNotFoundException
    {
        try
        {
            connection = DriverManager.getConnection(
                                    "jdbc:odbc:FootballData","","");
        }
        catch (SQLException sqlEx)
        {
            throw new SQLException("Unable to connect to database!");
        }

        try
        {
            statement = connection.createStatement();
        }
        catch (SQLException sqlEx)
        {
            throw new SQLException("Unable to create SQL statement!");
        }
    }


    private static void disconnectFromDb() throws SQLException
    {
        try
        {
            connection.close();
        }
        catch (SQLException sqlEx)
        {
            throw new SQLException(
                    "Unable to disconnect from database!");
        }
    }
}