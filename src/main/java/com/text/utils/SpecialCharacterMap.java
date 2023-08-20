package com.text.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * A HashMap based implementation which will provide plain english text for every special characters.
 */
public class SpecialCharacterMap extends HashMap<Character,String> {

    private static final Map<Character, String> SPECIAL_CHARACTER_MAP = new HashMap<>();

    static {
        SPECIAL_CHARACTER_MAP.put('!', "Exclamation Mark");
        SPECIAL_CHARACTER_MAP.put('"', "Double Quote");
        SPECIAL_CHARACTER_MAP.put('#', "Hash");
        SPECIAL_CHARACTER_MAP.put('$', "Dollar Sign");
        SPECIAL_CHARACTER_MAP.put('%', "Percent");
        SPECIAL_CHARACTER_MAP.put('&', "Ampersand");
        SPECIAL_CHARACTER_MAP.put('\'', "Single Quote (Apostrophe)");
        SPECIAL_CHARACTER_MAP.put('(', "Left Parenthesis");
        SPECIAL_CHARACTER_MAP.put(')', "Right Parenthesis");
        SPECIAL_CHARACTER_MAP.put('*', "Asterisk");
        SPECIAL_CHARACTER_MAP.put('+', "Plus");
        SPECIAL_CHARACTER_MAP.put(',', "Comma");
        SPECIAL_CHARACTER_MAP.put('-', "Hyphen (Minus)");
        SPECIAL_CHARACTER_MAP.put('.', "Period");
        SPECIAL_CHARACTER_MAP.put('/', "Slash");
        SPECIAL_CHARACTER_MAP.put(':', "Colon");
        SPECIAL_CHARACTER_MAP.put(';', "Semicolon");
        SPECIAL_CHARACTER_MAP.put('<', "Less Than");
        SPECIAL_CHARACTER_MAP.put('=', "Equal");
        SPECIAL_CHARACTER_MAP.put('>', "Greater Than");
        SPECIAL_CHARACTER_MAP.put('?', "Question Mark");
        SPECIAL_CHARACTER_MAP.put('@', "At Sign");
        SPECIAL_CHARACTER_MAP.put('[', "Left Square Bracket");
        SPECIAL_CHARACTER_MAP.put('\\', "Backslash");
        SPECIAL_CHARACTER_MAP.put(']', "Right Square Bracket");
        SPECIAL_CHARACTER_MAP.put('^', "Caret");
        SPECIAL_CHARACTER_MAP.put('_', "Underscore");
        SPECIAL_CHARACTER_MAP.put('`', "Grave Accent (Backtick)");
        SPECIAL_CHARACTER_MAP.put('{', "Left Curly Brace (Brace Open)");
        SPECIAL_CHARACTER_MAP.put('|', "Vertical Bar (Pipe)");
        SPECIAL_CHARACTER_MAP.put('}', "Right Curly Brace (Brace Close)");
        SPECIAL_CHARACTER_MAP.put('~', "Tilde");

    }

    /**
     * This will provide plain english text value for any special character key
     * @param key the key whose associated value is to be returned
     * @return plain english text value for any special character key
     */
    @Override
    public String get(Object key) {
        return super.getOrDefault(key, SPECIAL_CHARACTER_MAP.get(key));
    }

}
