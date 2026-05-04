# Folder organization

This project contains test data proving Synapset results.
The following list explain the content of each subfolder.
- **requests**: contains all pairs (promptX.md, genX.yyy) of generated output starting from provided prompt.
The promptX.md file contains all variants of a specific prompt that can generate the same equivalent result of genX.yyy

# Prompt file outline

Each promptX.md file contains all variants of a specific prompt. They are all semantically equivalent, so that
can be used to generate the same result.
The file is organized as:

- **Original prompt**: it is the first version of an issued prompt. It was used to generate the genX.yyy result.
- **Variant X**: it is a semantically equivalent variant of a prompt, that have to lead to the same genX.yyy result.