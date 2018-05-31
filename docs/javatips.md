## Java Documentation

### Parsing

#### Regex
The Java api documentation have a lot of great example to better understand what you can do with Regex

- [Class Pattern (use Regex)](http://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#sum)

Some Regex used for the project:

```java
[ _|,;>-] //All character between the brackets will be removed
[^a-h1-8] //Everything but letter from a to h or numbers from 1 to 8
```

#### Split

The split fonction `string.split(regex)` splits a string into multiple elements. here is a great read on it.
- [How to split a string](https://www.mkyong.com/java/java-how-to-split-a-string/)

It will be used to parse the Chess commands.

#### Trim
The trim function `string.toTrim()` removes all the spaces of a string.

- [How to trim()](https://www.tutorialspoint.com/java/java_string_trim.htm)

Here is a custom trim.

```java
/**
 * custom trim to remove every , or ;
 */
function trimStr(str) {
  return str.replace(",;",'');
}
```
