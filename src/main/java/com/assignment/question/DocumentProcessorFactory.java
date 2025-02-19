package com.assignment.question;

// Part 3: Implement SimpleFactory
public class DocumentProcessorFactory {
    public static DocumentProcessor getDocumentProcessor(DocumentType documentType, String documentName) {
        switch (documentType) {
            case PRESENTATION:
                return new PresentationDocumentProcessor(documentName);
            case TEXT:
                return new TextDocumentProcessor(documentName);
            case SPREAD_SHEET:
                return new SpreadsheetDocumentProcessor(documentName);
            default:
                throw new IllegalArgumentException("Invalid document type: \"" + documentType + "\"");
        }
    }
}