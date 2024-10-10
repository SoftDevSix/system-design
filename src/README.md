~~# Java Parser Library

--- 
The **Java Parsing Library** is a powerful tool that was designed to **parse, manipulate, and generate** Java source code.
This library helps with the ability to parse Java code into an **Abstract Syntax Tree (AST)**, which represents the
source code structure in a hierarchical format. By working with the AST, various operations can be performed such
as parsing, transformation, and code generation.

---
### What does this library do?
The Java Parser library provides a complete set of functions for working with Java source code:

- **Parsing:** converts Java source code into an **Abstract Syntax Tree (AST).**
- **Analysis:** allows to examine the structure and semantics of the code in depth.
- **Transformation:** allows to modify the AST to alter the structure of the code.
- **Generation:** can produce Java source code from a modified or newly created AST.

---
### How is the AST obtained?
The process of obtaining the abstract syntax tree involves several steps:

1. **Input Processing:** first accepts Java source code as input, either as a string or from a file.
2. **Lexical Analysis:** breaks down the input Java code into a series of tokens. These 
tokens represent the smallest units of meaning in the language, such as **keywords, identifiers, literals, and operators.**
3. **Syntactic Analysis:** the tokens are then analyzed according to the grammar rules of the _Java_ language. This step constructs
the basic structure of the **AST**, representing the hierarchical relationships between different elements of the code.
4. **Semantic Analysis:** the library performs additional checks and enriches the _AST_ with semantic information. This may include type 
**resolution, symbol table construction, and other language-specific analyses.**
5. **AST Construction:** and finally, the formed AST is created, representing the entire structure of the input Java code in a tree-like 
format. Each node in the tree corresponds to a construct in the source code, such as class declarations, method invocations, or expressions.

---
### Advantages 
The Java Parser library offers several advantages for working with Java source code:

- **Ease of Use:** it has good documentation, which allows you to quickly work with the AST without a steep learning curve.
- **Direct manipulation of the AST:** it gives us the abstract syntax tree (AST) directly, which is useful for performing code analysis in a very precise way.
- **Familiar way of obtaining the AST:** the way in which the AST is obtained is a process that is already familiar to us, since in the subject of **programming 
languages** we saw how to analyze a file, do lexical, syntactical and semantic analysis, and obtain the AST based on the Java grammar.
- **Performance:** JavaParser is known for being fast for common operations like code analysis and transformation.

---
### Disadvantages
Despite its advantages, the Java Parser library also has some disadvantages:

- **Limitations in deep semantic analysis:** although it has basic semantic analysis, it may not be as robust or advanced as that offered by more complex libraries 
such as Spoon or Eclipse JDT.
- **Limited in very large projects:** when working with large code bases, performance and the ability to handle multi-module projects may be compromised.

---
### Resources
- [JavaParser Documentation](https://www.javadoc.io/doc/com.github.javaparser/javaparser-core/latest/index.html)
- [JavaParser GitHub Repository](https://github.com/javaparser/javaparser/blob/master/readme.md)
- [JavaParser Book](https://leanpub.com/javaparservisited)
- [JavaParser Examples](https://www.javaguides.net/2024/05/guide-to-javaparser-library-in-java.html)

---
By: Axel Javier Ayala Siles