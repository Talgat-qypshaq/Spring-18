package kz.edu.manglayev.dao;

import kz.edu.manglayev.model.SpreadSheet;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.security.GeneralSecurityException;

@Component
public class SheetsDAO
{
    public String getData()
    {
        System.out.println("DATA START:");
        SpreadSheet ss = new SpreadSheet();
        try
        {
            ss.RunSpreadSheet();
        }
        catch (GeneralSecurityException | IOException exception)
        {
            exception.printStackTrace();
        }
        System.out.println("DATA END.");
        return "Data from Google Sheets";
    }
}