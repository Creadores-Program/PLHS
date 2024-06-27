# HTMLP
Advanced Tag Language called HTML+

# How to use?
## Java
Example:

```java
package example;
import Creadores.Program.HTMLP.Engine;
public class Example{
  public Example(){
    Engine engHP = new Engine();
    //eval
    engHP.eval("code...");
    //put java object in HTML+
    engHP.put("nameTag", "Object");
    engHP.put("System", System.class);
    engHP.eval("<htmlp><head><title>Example</title></head><body><System isDiv json='out.println' args='`Hello World`'/></body></htmlp>");
  }
}
```
