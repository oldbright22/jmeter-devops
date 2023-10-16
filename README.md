Maven plugin that provides the ability to run JMeter tests as part of your build

The latest version is **3.8.0**, it requires Maven >= **3.9.0** and defaults to **Apache JMeter 5.6.2**.


Running the GUI
-----

Once you have added the plugin to your project you will be able to invoke the JMeter GUI using the following command:

```
mvn jmeter:configure jmeter:gui
```


Basic Usage
-----

### Add the plugin to your project

Add the plugin to the build section of your pom's project :

```
<plugin>
    <groupId>com.jmeter.devops</groupId>
    <artifactId>jmeter-devops</artifactId>
    <version>3.8.0</version>
    <executions>
        <!-- Generate JMeter configuration -->
        <execution>
            <id>configuration</id>
            <goals>
                <goal>configure</goal>
            </goals>
        </execution>
        <!-- Run JMeter tests -->
        <execution>
            <id>jmeter-tests</id>
            <goals>
                <goal>jmeter</goal>
            </goals>
        </execution>
        <!-- Fail build on errors in test -->
        <execution>
            <id>jmeter-check-results</id>
            <goals>
                <goal>results</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

### Reference JMX files and CSV data
Once you have created your JMeter tests, you'll need to copy them to `<Project Dir>/src/test/jmeter`.  

By default this plugin will pick up all the .jmx files in that directory, you can also put data files in this folder and reference them in your plan.

### Run the tests

```
mvn clean verify
```

All your tests will run in maven!

