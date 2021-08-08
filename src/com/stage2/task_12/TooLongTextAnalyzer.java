package com.stage2.task_12;

public class TooLongTextAnalyzer implements TextAnalyzer {
    int COMMENT_MAX_LENGTH = 32;

    @Override
    public Label processText(String text) {
        if(text.length() > COMMENT_MAX_LENGTH) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}
