# Pair 16: TodoApp

## Original Prompt 16: TodoApp

```
This is TodoApp.
Accepts style = "modern flat", storageKey = "todos" as parameters.
My problem is "Generate a complete single-page to-do list application", "with add, delete, and toggle-complete functionality", "persistent storage using localStorage with key", storageKey, "and a filter to show all, active, or completed items".
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations"; "Persist state across page reloads"; "Provide visual distinction between completed and active items".
You must not: "Use inline styles"; "Use external libraries or frameworks"; "Make network requests".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```

#### Variant 16.1
```
This is TodoApp.
Accepts style = "modern flat", storageKey = "todos" as parameters.
My problem is "Create a complete single-page to-do list application", "with add, delete, and toggle-complete functionality", "persistent storage using localStorage with key", storageKey, "and a filter to show all, active, or completed items".
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations"; "Persist state across page reloads"; "Provide visual distinction between completed and active items".
You must not: "Use inline styles"; "Use external libraries or frameworks"; "Make network requests".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 16.2 (shuffled: output and constraints before request)
```
This is TodoApp.
Accepts style = "modern flat", storageKey = "todos" as parameters.
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations"; "Persist state across page reloads"; "Provide visual distinction between completed and active items".
You must not: "Use inline styles"; "Use external libraries or frameworks"; "Make network requests".
My problem is "Generate a complete single-page to-do list application", "with add, delete, and toggle-complete functionality", "persistent storage using localStorage with key", storageKey, "and a filter to show all, active, or completed items".
Generate a natural language prompt.
```


#### Variant 16.3 (synonym variation)
```
This is TodoApp.
Accepts style = "modern flat", storageKey = "todos" as parameters.
My problem is "Build a self-contained task management web application", "supporting creation, removal, and completion toggling of tasks", "saving state in localStorage under key", storageKey, "and filtering by status: all, pending, or done".
You must: "Employ semantic HTML5 elements"; "Incorporate JavaScript for all data operations"; "Maintain state persistence across browser sessions"; "Visually differentiate completed from active tasks".
You must not: "Rely on inline styles"; "Depend on external libraries or frameworks"; "Issue network requests".
The output must: "Produce a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 16.4 (fully shuffled)
```
You must not: "Use inline styles"; "Use external libraries or frameworks"; "Make network requests".
This is TodoApp.
My problem is "Generate a complete single-page to-do list application", "with add, delete, and toggle-complete functionality", "persistent storage using localStorage with key", storageKey, "and a filter to show all, active, or completed items".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Accepts style = "modern flat", storageKey = "todos" as parameters.
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations"; "Persist state across page reloads"; "Provide visual distinction between completed and active items".
Generate a natural language prompt.
```


#### Variant 16.5 (no name, tag based)
```
Accepts style = "modern flat", storageKey = "todos" as parameters.
My problem is "Generate a complete single-page to-do list application", "with add, delete, and toggle-complete functionality", "persistent storage using localStorage with key", storageKey, "and a filter to show all, active, or completed items".
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations"; "Persist state across page reloads"; "Provide visual distinction between completed and active items".
You must not: "Use inline styles"; "Use external libraries or frameworks"; "Make network requests".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a tag based prompt.
```


#### Variant 16.6 (with context)
```
This is TodoApp.
Accepts style = "modern flat", storageKey = "todos" as parameters.
The given context is "Application should resemble a minimal productivity tool suitable for daily use".
My problem is "Generate a complete single-page to-do list application", "with add, delete, and toggle-complete functionality", "persistent storage using localStorage with key", storageKey, "and a filter to show all, active, or completed items".
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations"; "Persist state across page reloads"; "Provide visual distinction between completed and active items".
You must not: "Use inline styles"; "Use external libraries or frameworks"; "Make network requests".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 16.7 (no negative constraints)
```
This is TodoApp.
Accepts style = "modern flat", storageKey = "todos" as parameters.
My problem is "Generate a complete single-page to-do list application", "with add, delete, and toggle-complete functionality", "persistent storage using localStorage with key", storageKey, "and a filter to show all, active, or completed items".
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations"; "Persist state across page reloads"; "Provide visual distinction between completed and active items".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 16.8 (internal ordering shuffled)
```
This is TodoApp.
Accepts style = "modern flat", storageKey = "todos" as parameters.
My problem is "Generate a complete single-page to-do list application", "and a filter to show all, active, or completed items", "persistent storage using localStorage with key", storageKey, "with add, delete, and toggle-complete functionality".
You must: "Persist state across page reloads"; "Use semantic HTML5 elements"; "Provide visual distinction between completed and active items"; "Include JavaScript for all CRUD operations".
You must not: "Make network requests"; "Use inline styles"; "Use external libraries or frameworks".
The output must: "use ", style, " design aesthetics"; "Be a single valid HTML5 document with embedded CSS and JavaScript".
Generate a natural language prompt.
```


#### Variant 16.9 (different request decomposition)
```
This is TodoApp.
Accepts style = "modern flat", storageKey = "todos" as parameters.
My problem is "Design a to-do application as a single HTML page", "enabling users to add new tasks via a text input", "remove tasks with a delete button", "mark tasks as complete by clicking them", "save and load from localStorage key", storageKey, "and filter the displayed list by completion status".
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations"; "Persist state across page reloads"; "Provide visual distinction between completed and active items".
You must not: "Use inline styles"; "Use external libraries or frameworks"; "Make network requests".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use ", style, " design aesthetics".
Generate a natural language prompt.
```


#### Variant 16.10 (minimal)
```
My problem is "Generate a complete single-page to-do list application", "with add, delete, and toggle-complete functionality", "persistent storage using localStorage", "and a filter to show all, active, or completed items".
You must: "Use semantic HTML5 elements"; "Include JavaScript for all CRUD operations".
The output must: "Be a single valid HTML5 document with embedded CSS and JavaScript"; "use modern flat design aesthetics".
```
