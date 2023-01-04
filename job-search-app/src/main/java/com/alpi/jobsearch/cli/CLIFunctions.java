package com.alpi.jobsearch.cli;

import java.util.HashMap;
import java.util.Map;

public class CLIFunctions {


    public static Map<String, Object> toMap(CLIArguments cliArguments) {
        Map<String, Object> params = new HashMap<>();

        params.put("q", cliArguments.getQuery());
        params.put("location", cliArguments.getLocation());
        params.put("full_time", cliArguments.isFullTime());
        params.put("start", cliArguments.getPagination());
        params.put("hl", cliArguments.getLanguage());

        if(cliArguments.isMarkDown()) {
            params.put("markdown", true);
        }

        return params;
    }
}
