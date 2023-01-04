package com.alpi.jobsearch;


import com.alpi.jobsearch.api.APIJobs;
import com.alpi.jobsearch.cli.CLIArguments;
import com.alpi.jobsearch.cli.CLIFunctions;
import com.beust.jcommander.JCommander;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static com.alpi.jobsearch.CommanderFunctions.buildCommanderWithName;
import static com.alpi.jobsearch.CommanderFunctions.parseArguments;
import static com.alpi.jobsearch.api.APIFunctions.buildAPI;

public class Main {
    public static void main(String[] args) {

        JCommander jCommander = buildCommanderWithName(
                "job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCLI =
                parseArguments(jCommander, args, JCommander::usage)
                        .orElse(Collections.emptyList())
                        .stream()
                        .map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> cliArgumentsOptional =
                streamOfCLI.filter(cli -> !cli.isHelp())
                        .filter(cli -> cli.getQuery() != null)
                        .findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap)
                .map(params -> executeRequest(params, CLIArguments.newInstance().getApiKey()))
                .orElse(Stream.empty())
                .forEach(System.out::println);
    }

    private static Stream<JobPosition> executeRequest(Map<String, Object> params, String apiKey) {
        params.put("api_key", apiKey);
        APIJobs api = buildAPI(APIJobs.class, "https://serpapi.com", "search?engine=google_jobs");
        return Stream.of(params)
                .map(api::jobs)
                .flatMap(Collection::stream);

    }
}
