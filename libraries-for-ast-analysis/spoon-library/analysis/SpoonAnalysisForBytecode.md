# Spoon For Parsing Bytecode

### by Luiggy Mamani Condori

![Decompiler image](https://www.researchgate.net/publication/270960218/figure/fig4/AS:816907917725707@1571777433700/Execution-of-a-Decompiler.png)

_There are two ways to analyze bytecode with Spoon:_

_Bytecode resources can be added to the classpath (some information will be extracted through reflection). A decompiler may be used, and then, the analyzes will be performed on the decompiled sources._

_The Spoon JarLauncher is used to create the AST model from a jar. It automatically decompiles class files contained in the jar and analyzes them._

_The default decompiler CFR can be changed by providing an instance implementing._

---

-   Each decompiler has its own way of reconstructing source code from bytecode.

Java bytecode does not store all the information that was present in the original source code (such as local variable names or comments), and decompilers must infer and reconstruct this information. Depending on the algorithm and heuristics each decompiler uses, ASTs can vary in their level of accuracy and structure.

-   CFR:
    It is a Java bytecode decompiler, specifically designed to be very accurate when recovering the original source code.

**It does not apply significant optimization**, it focuses on the accuracy and readability of the resulting code. It tries to return the code as close as possible to its original form without making assumptions or modifications that are not strictly necessary.

-   Procyon:
    It is known for handling modern Java features, such as lambda expressions and generic types, that other decompilers may fail to process correctly.

**It applies some optimizations**, it can improve certain aspects of the code to make it more readable or efficient.
