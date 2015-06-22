### Create and manipulate Strings
String is immutable, it does not change after creation. Each character is 16-bit Unicode char. String is Object.
```java
String s = new String();
String s2 = s;
s = s.concat(" more stuff");
// s.equals(" more stuff");
// s2.equals("");
```

### Manipulate data using the StringBuilder class and its methods

StringBuilder vs StringBuffer:
    * StringBuilder is faster because its methods aren't synchronized
    * StringBuffer is synchronized, StringBuilder is not