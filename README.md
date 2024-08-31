# PLHS
Programing Language HTML Syntax

<img align="center" width="50%" src="https://github.com/Trollhunters501/PLHS/blob/main/Dise%C3%B1o%20sin%20t%C3%ADtulo_20240831_081942_0000.png"/>
# How to use?
## Java
Example:

```java
package example;
import Creadores.Program.PLHS.*;
public class Example{
  public Example(){
    Engine engHP = new Engine();
    //eval
    try{
      engHP.eval("code...");
    }catch(ExceptionPLHS e){
      e.printStackTrace();
    }
    //put java object in PLHS
    engHP.put("nameTag", "Object");
    engHP.put("System", System.class);
    try{
      engHP.eval("<plhs><head><title>Example</title></head><body><System isDiv json='out.println' args='`Hello World`'/></body></plhs>");
    }catch(ExceptionHTMLP e){
      e.printStackTrace();
    }
  }
}
```
More Info in [Wiki!](https://github.com/Trollhunters501/PLHS/wiki)

## Browser

In your project add PLHS and [JwebAssembly](https://github.com/i-net-software/JWebAssembly) and follow the JWebAssembly instructions, and [Wiki](https://github.com/Trollhunters501/PLHS/wiki) by PLHS.

# Credits
[Jsoup](https://jsoup.org)
