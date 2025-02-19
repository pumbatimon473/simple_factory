package com.assignment.question;

// Part 1: abstract common attrs and methods
public abstract class DocumentProcessor {
    // common attr
    private String documentName;

    // CTOR
    public DocumentProcessor(String documentName) {
        this.documentName = documentName;
    }

    public abstract DocumentType supportsType();

    // common methods
    public abstract void processDocument();

    public String getDocumentName() {
        return this.documentName;
    }

}