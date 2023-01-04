package com.alpi.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {


    CLIArguments() {

    }

    @Parameter(
            names = "-key",
            required = true,
            validateWith = CLIApiKeyValidator.class,
            description = "Parameter defines the SerpApi private key to use."
    )
    private String apiKey;



    @Parameter(
            names = "-q",
            required = true,
            descriptionKey = "KEYWORD",
            validateWith = CLIKeywordValidator.class,
            description = "Parameter defines the query you want to search."
    )
    private String query;

    @Parameter(
            names = "-l",
            description = "Parameter defines from where you want the search to originate."
    )
    private String location;

    @Parameter(
            names = "-p",
            description = "It's used for pagination. (e.g., 0 (default) is the first page of results, 10 is the 2nd page of results, 20 is the 3rd page of results, etc.)."
    )
    private String pagination;

    @Parameter(
            names = "-lang",
            description = "Parameter defines the language to use for the Google Jobs search. It's a two-letter language code. (e.g., en for English)."
    )
    private String language;

    @Parameter(
            names = {"--full-time"},
            description = "Add if we want full-time jobs"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = "--markdown",
            description = "Get results in markdown"
    )
    private boolean isMarkDown = false;


    @Parameter(
            names = "--help",
            help = true,
            description = "Mostrar esta ayuda",
            validateWith = CLIHelpValidator.class
    )
    private boolean isHelp;


    public String getQuery() {
        return query;
    }

    public String getLocation() {
        return location;
    }

    public String getPagination() {
        return pagination;
    }

    public String getLanguage() {
        return language;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    public boolean isHelp() {
        return isHelp;
    }

   public String getApiKey() {
        return apiKey;
   }


    @Override
    public String toString() {
        return "CLIArguments{" +
               // "apiKey='" + apiKey + '\'' +
                ", query='" + query + '\'' +
                ", location='" + location + '\'' +
                ", pagination='" + pagination + '\'' +
                ", language='" + language + '\'' +
                ", isFullTime=" + isFullTime +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance() {
        return new CLIArguments();
    }
}
