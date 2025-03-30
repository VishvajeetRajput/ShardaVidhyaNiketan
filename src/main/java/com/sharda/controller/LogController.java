package com.sharda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    private static final String LOG_FILE_PATH = "logs/app.log"; // Path to your log file

    @GetMapping("getLogs")
    public List<String> getLogs(@RequestParam(defaultValue = "4000") int lines) throws IOException {
    	 List<String> logLines = new ArrayList<>();
         BufferedReader reader = null;

         try {
             reader = new BufferedReader(new FileReader(LOG_FILE_PATH));
             String line;

             // Read all lines into the list
             while ((line = reader.readLine()) != null) {
                 logLines.add(line);
             }
         } finally {
             if (reader != null) {
                 reader.close();
             }
         }

         // Determine the starting index to get the last 'lines' entries
         int startIndex = Math.max(0, logLines.size() - lines);

         // Return the desired lines
         return logLines.subList(startIndex, logLines.size());
     
    }
    
    
    
    
    
}
