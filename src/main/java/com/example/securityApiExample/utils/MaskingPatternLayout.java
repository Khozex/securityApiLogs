package com.example.securityApiExample.utils;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class MaskingPatternLayout extends PatternLayout {

    @Override
    public String doLayout(ILoggingEvent event) {
        String originalMessage = super.doLayout(event);
        return maskSensitiveData(originalMessage);
    }

    private String maskSensitiveData(String message) {
        if (message == null) return null;

        message = message.replaceAll(
                "[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+",
                "[REDACTED-EMAIL]"
        );

        message = message.replaceAll(
                "optInCode=['\"]?\\d{4,8}['\"]?",
                "optInCode='[REDACTED-CODE]'"
        );

        return message;
    }
}
