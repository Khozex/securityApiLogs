package com.example.securityApiExample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SecurityApiService {

    private static final Logger logger = LoggerFactory.getLogger(SecurityApiService.class);

    public void processOptIn(OptInCodeRequest request) {
        logger.info("Processing opt-in request: {}", request);

        boolean valid = validateCode(request.getOptInCode());

        if (valid) {
            logger.info("Opt-in code validated successfully for email.");
        } else {
            logger.warn("Invalid opt-in code for email.");
        }
    }

    private boolean validateCode(String code) {
        return code != null && code.matches("\\d{6}");
    }
}
