package com.AlexandreLoiola.PDFGenerationAndSigningService.enums;

import lombok.Getter;

@Getter
public enum SignatureType {
    DIGITAL("Digital"),
    HANDWRITTEN("Handwritten"),
    E_SIGNATURE("E-Signature");

    private final String type;

    SignatureType(String type) {
        this.type = type;
    }
}
