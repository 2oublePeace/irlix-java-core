package com.stage1.task1;

public class Cast {
    /**
     * метод, конвертирующий true и false в 1 и 0 соответственно
     * @return 1 или 0 в соответствии с true/false
     */
    public static int booleanToInt(boolean term) {
        return (Boolean.toString(term).equals("true")) ? 1 : 0;
    }
}
