package com.emiratalent.operations;

import com.emiratalent.writers.Writer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateRemovalOperation implements Operation{
    @Override
    public void execute(Writer writer) {
        writer.setContent(new StringBuilder(removeDuplicate(writer.getContent().toString())));
    }

    private String removeDuplicate(String str){
            String regex;
            regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            Matcher match = pattern.matcher(str);
            while(match.find()) {
                str = str.replace(match.group(), match.group(1));
            }
            return str;
        }
}
