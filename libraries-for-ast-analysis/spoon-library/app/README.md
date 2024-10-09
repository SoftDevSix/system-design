# Spoon Parsing Library

#### by Luiggy Mamani Condori

## What is Spoon?

-   Spoon is a Java library that provides a powerful set of tools for analyzing and transforming Java source code at compile-time.

-   **It's based on the Launcher class, which serves as an integrated command-line** tool leveraging the JDT-based (Eclipse) builder to parse, process, and manipulate Java programs.

-   Spoon allows to analyze Java files, classes, and methods and provides the ability to search for elements like methods by signature, properties, and locations. Additionally, Spoon enables developers to build custom code analyzers by implementing its abstraction for processors (AbstractProcessor), providing flexibility and extensibility in static code analysis.

## Main Features (Advantages):

**- File and Directory Analysis from Local Path:**
Spoon can analyze files or entire directories by taking in local paths as input. This feature allows the examination of complete projects, even an entire maven local project.

**- Parsing of Classes and Methods:**
Spoon can parse Java classes, **enabling detailed inspection of elements such as methods, method signatures, and properties.** We can search for specific methods by their signature and get detailed information about the code structure, including line numbers, declarations, modifiers, etc.

**- Code Printing:**
After modifying or just analized the abstract syntax tree (AST), we can print back in valid Java syntax.

**- Custom Code Analyzers via Processors:**

-   Spoon provides a way to build custom analyzers by implementing AbstractProcessor for different types of elements (classes, methods, etc.).

-   Posibilidad de agregar nuestros propios analizadores de codigo usando su abstraccion de procesadores (AbstractProcessor), for example, an empty catch implementations.

## Disadvantages:

**- Command-line Based Execution and Tools Dependency:**

-   It's command-line-based and depends on external tools such as the JDT (Java Development Tools) compiler for its execution.

-   However, this doesn't inherently impact performance in most cases.

**- Local Analysis Limitation:**

-   Spoon is designed primarily for analyzing files and directories from a local path, meaning it works best with physical file systems.

-   While it's possible to parse individual classes from plain text (using Launcher.parseClass()), doing so **limits the broader functionality**, such as analyzing entire directories or interacting with processors.

-   Processing classes from plain text, especially when handling multiple classes.

-   The powerful printing and custom processor functionality is only fully available when analyzing code from local files or directories. So, one workaround is to generate temporary files or use virtual file systems, which can then be processed by Spoon’s full capabilities. However, this workaround **could introduce additional performance overhead depending on the complexity of the file creation** and deletion operations.

---

### Resources

Official page:
https://spoon.gforge.inria.fr/first_analysis_processor.html

JavaDocs documentation:
https://spoon.gforge.inria.fr/mvnsites/spoon-core/apidocs/spoon/Launcher.html

Code examples:
https://github.com/SpoonLabs/spoon-examples/tree/master/src/main/java/fr/inria/gforge/spoon/analysis
