# Pair 18: Calculator

## Original Prompt 18: Calculator

```
This is Calculator.
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Generate a single-page calculator web application", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places".
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
You must not: "Use eval() for expression evaluation"; "Use inline styles"; "Use external libraries".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```

#### Variant 18.1
```
This is Calculator.
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Create a single-page calculator web application", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places".
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
You must not: "Use eval() for expression evaluation"; "Use inline styles"; "Use external libraries".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 18.2 (shuffled: negative constraints first)
```
This is Calculator.
You must not: "Use eval() for expression evaluation"; "Use inline styles"; "Use external libraries".
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Generate a single-page calculator web application", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places".
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 18.3 (synonym variation)
```
This is Calculator.
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Build a self-contained calculator web application", "performing addition, subtraction, multiplication, and division", "featuring a button-based numeric keypad, a formula display, and an answer display", "truncating results to", precision, "decimal places".
You must: "Employ semantic HTML5 elements"; "Incorporate JavaScript for safe expression parsing"; "Handle division by zero with an error message"; "Accept keyboard input for numbers and operators".
You must not: "Invoke eval() for computation"; "Rely on inline styles"; "Include external libraries".
The output must: "Produce a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 18.4 (fully shuffled)
```
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
This is Calculator.
You must not: "Use eval() for expression evaluation"; "Use inline styles"; "Use external libraries".
My problem is "Generate a single-page calculator web application", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places".
Accepts style = "modern flat", precision = "2" as parameters.
Generate a natural language prompt.
```


#### Variant 18.5 (no name, no prompt type)
```
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Generate a single-page calculator web application", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places".
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
You must not: "Use eval() for expression evaluation"; "Use inline styles"; "Use external libraries".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
```


#### Variant 18.6 (tag based)
```
This is Calculator.
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Generate a single-page calculator web application", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places".
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
You must not: "Use eval() for expression evaluation"; "Use inline styles"; "Use external libraries".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a tag based prompt.
```


#### Variant 18.7 (no negative constraints)
```
This is Calculator.
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Generate a single-page calculator web application", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places".
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 18.8 (with context)
```
This is Calculator.
Accepts style = "modern flat", precision = "2" as parameters.
The given context is "Calculator is intended for embedding into a larger dashboard application".
My problem is "Generate a single-page calculator web application", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places".
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
You must not: "Use eval() for expression evaluation"; "Use inline styles"; "Use external libraries".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 18.9 (internal ordering shuffled)
```
This is Calculator.
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Generate a single-page calculator web application", "with a numeric keypad, an expression display, and a result display", "rounding results to", precision, "decimal places", "supporting basic arithmetic operations: addition, subtraction, multiplication, and division".
You must: "Support keyboard input for digits and operators"; "Handle division by zero gracefully"; "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation".
You must not: "Use external libraries"; "Use eval() for expression evaluation"; "Use inline styles".
The output must: "use ", style, " design aesthetics"; "Be a single valid HTML5 document with embedded CSS and JavaScript".
Generate a natural language prompt.
```


#### Variant 18.10 (different request decomposition)
```
This is Calculator.
Accepts style = "modern flat", precision = "2" as parameters.
My problem is "Produce a browser-based arithmetic calculator", "with buttons for digits 0 through 9 and operators plus, minus, times, and divide", "a screen showing the current expression", "a separate area showing the computed result to", precision, "decimal places", "and a clear button to reset".
You must: "Use semantic HTML5 elements"; "Include JavaScript for expression parsing and evaluation"; "Handle division by zero gracefully"; "Support keyboard input for digits and operators".
You must not: "Use eval() for expression evaluation"; "Use inline styles"; "Use external libraries".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```
