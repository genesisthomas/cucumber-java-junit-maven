## Cucumber Java JUnit Maven Sample:

This cucumber sample contains multiple features files and executes them using JUnit Runners.

### Run the below command to pass scenario:

        mvn install

### Run **single** scenario:
    
        mvn install -Dcucumber.features="src/test/resources/features/first.feature"

### Run **single** tag:

        mvn install -Dcucumber.filter.tags="@fail"

### Run **multiple** tags:

        mvn install -Dcucumber.filter.tags="@pass or @fail"