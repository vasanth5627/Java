package DateUtil;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateDemo {

    public static void getDateInUtc() throws ParseException {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS", Locale.US);
//        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//        String dateString = dateFormat.format(new Date());
//        Date dateNow = dateFormat.parse(dateString);
//        System.out.println("dateString: " + dateString);
//        System.out.println("dateNow:   " + dateNow);

//        Date date = new Date();
//
//
//        String timeZoneId = "UTC";
//
//        ZonedDateTime zonedDateTime = date.toInstant().atZone(TimeZone.getTimeZone(timeZoneId).toZoneId());
//
//        Date resultDate = Date.from(zonedDateTime.toInstant());
//        System.out.println("ZonedDateTime: " + resultDate);

        String utcDateString = "2023-08-24 15:08:42.420657";

        // Define a date format pattern for parsing
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");

        // Parse the UTC date string to LocalDateTime
        LocalDateTime utcDateTime = LocalDateTime.parse(utcDateString, DateTimeFormatter.ofPattern(sdf.toPattern()));

        // Convert LocalDateTime to Instant in UTC
        Instant instant = utcDateTime.toInstant(ZoneOffset.UTC);

        // Convert Instant to Date
        Date utcDate = Date.from(instant);

        // Print the UTC Date
        System.out.println("UTC Date: " + utcDate);
    }
    public static void main(String[] args) throws ParseException, JsonProcessingException {
//        Date date  = new Date();
//        System.out.println(date);
//        SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss yyyy");
//
//        // Set the input timezone to UTC
//        inputFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
//
//        // Parse the input date string
//        Date dateInUTC = inputFormat.parse("Thu Aug 24 15:08:42 2023");
//
//        // Output the parsed date in UTC timezone
//        System.out.println("Parsed Date in UTC: " + dateInUTC);

        String json = "[{\"id\":\"233e1b70e3b587a9a7284dc6b2f019dd\",\"lastAsinUpdateDate\":\"2022-02-16 19:54:59\"}]\n";
                //"{\"id\":\"f6ba58fd7bd6e9c06f634a907b274f98\",\"lastAsinUpdateDate\":\"2022-02-16 19:54:59\"},{\"id\":\"fc0d906aa9a6bd039e55ebdaef16b341\",\"lastAsinUpdateDate\":\"2022-02-16 19:54:59\"}]\n";
        //System.out.println(json);
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);

        for(JsonNode node:jsonNode){
           if(node.has("lastAsinUpdateDate")){
          ///     System.out.println(node.get("lastAsinUpdateDate"));
               ((ObjectNode) node).put("lastAsinUpdateDate", "2023-12-31");

           }
        }

      //  System.out.println(jsonNode);
        getDateInUtc();
    }
}
