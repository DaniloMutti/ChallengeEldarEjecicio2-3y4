package ar.com.eldar.eldarchallenge.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormater {
    
    public String fechaFormat(LocalDate date){    
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
            return date.format(formatter);
        } catch (Exception e) {
           return null;
        } 
    }

    public LocalDate toLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date, formatter);

    }
    public Double getYear(LocalDate date){
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YY");
            return Double.parseDouble(date.format(formatter));
        } catch (Exception e) {
           return null;
        }
    }
}
