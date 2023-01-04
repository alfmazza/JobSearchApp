# Search-Job App

A simple application that allows you to search for job positions using the SerpApi API.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 8 or higher
- Gradle 6.5 or higher (optional)

### Installing

1. Clone the repository

   ```git clone https://github.com/alfmazza/JobSearchApp```

2. Change into the project directory

   ```cd search-job```

3. Build the project using Gradle

    ```./gradlew build```
    

Alternatively, you can build the project using the java command:

    javac com/alpi/jobsearch/*.java

### Usage

To use the app, navigate to the com.alpi.jobsearch directory and run the java command with the following arguments:

```java Main -q [query] -key [API key]```

Where [query] is the job position you want to search for and [API key] is your API key for the Google Jobs API.

For example:

```java Main -q "java developer" -key "1234567890abcdef"```

You can also use the -h flag to display the usage message:

```java Main -h```

## Built With

- [Feign](https://github.com/OpenFeign/feign) - A declarative HTTP client
- [JCommander](http://jcommander.org/) - A simple and flexible command line parser

## Author

alfmazza
