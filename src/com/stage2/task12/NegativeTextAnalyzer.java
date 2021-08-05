package com.stage2.task12;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public NegativeTextAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
