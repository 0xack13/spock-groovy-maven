# spock-groovy-maven
Skeleton of using Spock with Maven.

To run/test the code, simple use maven as below:
```bash
mvn clean test
```

This should result in 2 passed tests:

```bash
[INFO] --- maven-surefire-plugin:3.0.0-M3:test (default-test) @ spock1 ---
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running AddSpec
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.061 s - in AddSpec
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.325 s
[INFO] Finished at: 2020-08-01T16:09:36+10:00
[INFO] ------------------------------------------------------------------------
```
