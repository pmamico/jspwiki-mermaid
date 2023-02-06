# Mermaid Plugin for JSPWiki
for [JSPWiki](https://jspwiki.apache.org/) v2.10.1+  
[Mermaid](https://mermaid.js.org/syntax/classDiagram.html) v9.3.0

## Usage

```
{[mermaid

---
title: Node
---
flowchart LR
    id
}]
```


## Installation

1. download `bin/MermaidPlugin-1.0.jar` into `${JSPWIKI_HOME}/WEB-INF/lib/`
```shell
wget "https://github.com/pmamico/jspwiki-mermaid/blob/master/bin/MermaidPlugin-1.0.jar?raw=true" -O mermaid-plugin.jar
```
2. in `${JSPWIKI_HOME}/WEB-INF/jspwiki-custom.properties` file, edit the comma-delimited ``jspwiki.plugin.searchPath`` property to include the package designation of the plugin
```properties
jspwiki.plugin.searchPath = hu.pmamico.jspwiki.plugin
```
3. restart JSPWiki (or restart Tomcat)


## Build
```shell
mvn clean compile assembly:single antrun:run
```
