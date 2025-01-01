package com.AlexandreLoiola.PDFGenerationAndSigningService.enums;

import lombok.Getter;

@Getter
public enum DocumentStatus {
    PENDING("Pending"),
    SIGNED("Signed"),
    APPROVED("Approved"),
    REJECTED("Rejected"),
    EXPIRED("Expired");

    private final String status;

    DocumentStatus(String status) {
        this.status = status;
    }
}
