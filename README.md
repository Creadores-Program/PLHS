# HTMLP
Advanced Tag Language called HTML+

# How to use?
## Java
Example:

```java
package example;
import Creadores.Program.HTMLP.*;
public class Example{
  public Example(){
    Engine engHP = new Engine();
    //eval
    engHP.eval("code...");
    //put java object in HTML+
    engHP.put("nameTag", "Object");
    engHP.put("System", System.class);
    try{
      engHP.eval("<htmlp><head><title>Example</title></head><body><System isDiv json='out.println' args='`Hello World`'/></body></htmlp>");
    }catch(ExceptionHTMLP e){
      e.printStackTrace();
    }
  }
}
```
More Info in Wiki!
