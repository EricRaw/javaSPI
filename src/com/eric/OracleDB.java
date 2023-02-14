package com.eric;

/**
 * @author EricRaww
 * @create 2023-02-14
 * @description
 */
public class OracleDB implements DBSearch{
    @Override
    public String search(String key) {
        return "oracle got "+key;
    }
}
