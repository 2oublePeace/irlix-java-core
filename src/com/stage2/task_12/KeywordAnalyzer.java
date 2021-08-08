package com.stage2.task_12;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    @Override
    public Label processText(String content) {
        for(String keyword : this.getKeywords()) {
            if (content.contains(keyword)) {
                return this.getLabel();
            }
        }
        return Label.OK;
    }

    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
}
