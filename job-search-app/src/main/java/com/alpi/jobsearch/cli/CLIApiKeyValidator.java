package com.alpi.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIApiKeyValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        if(!value.matches("^[a-zA-Z\\d!@#$%&*()_+-=]}|:;'<>,.?/~`]+$")) {
            System.err.println("The search criteria is not valid");
            throw new ParameterException("Letters and numbers only");
        }
    }

}
