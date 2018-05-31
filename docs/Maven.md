
## Maven Documentation

[Get started](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)

create the project

```
mvn archetype:generate -DgroupId=sylhare -DartifactId=jchess -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Build the project (inside jchess)

```
mvn package
```

Run and test the project

```
java -cp target/jchess-1.0-SNAPSHOT.jar com.github.sylhare.App
```

This command will clean the project, copy dependencies, and package the project (executing all phases up to package, of course).

```
mvn clean dependency:copy-dependencies package
```

Generating the site

```
mvn site
```