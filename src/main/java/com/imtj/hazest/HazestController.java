package com.imtj.hazest;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HazestController {
    
    Logger logger = LoggerFactory.getLogger(HazestController.class);

    @GetMapping("/info")
    public Information getInfo(){
        logger.info("Request for Info received at {} ", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd HH:mm")) );

        Information info = new Information();
        
        info.setTs(System.currentTimeMillis());
        try{
            info.setHost( InetAddress.getLocalHost().getHostName() );
        }catch(UnknownHostException e){
            logger.warn("Unknown Host exception -> {}", e.getMessage());
            logger.error("Error", e);
            info.setHost(" Unknown ");
        }
        
        logger.info("Returning -> {} ", info);
        return info;
    }

}
