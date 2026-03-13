# 🧬 DNA to Protein Translator

Project developed in **Java** that simulates part of the **Central Dogma of Molecular Biology**:

DNA → RNA → Protein

The application receives a **DNA sequence**, performs **transcription to RNA**, and then **translation into amino acids** using a **genetic code table stored in a HashMap**.

This project was created to practice **Java programming**, **data structures**, and apply **bioinformatics concepts**.

---

## ⚙️ Features

- **DNA → RNA transcription** (Thymine `T` replaced by Uracil `U`)
- **RNA → protein translation** using codon triplets
- **Stop codon detection** (`UAA`, `UAG`, `UGA`)
- **Codon dictionary implemented with HashMap**
- **Modular architecture using packages**
- **Code documented using Javadoc**

---

## 🏗️ Project Structure

The project follows a **layered structure** separating responsibilities:

```
DTPTProject
│
├── MainPackage
│   │
│   ├── App.java
│   │   Application entry point
│   │
│   ├── Service
│   │   └── TranslatorService.java
│   │       Handles transcription and translation logic
│   │
│   └── Model
│       └── GeneticCode.java
│           Stores the codon → amino acid mapping
```

### Classes

**App**

- Entry point of the application
- Demonstrates the DNA → RNA → Protein workflow

**TranslatorService**

Responsible for:

- Transcribing DNA into RNA
- Translating RNA into a protein chain

**GeneticCode**

- Stores the **genetic code table**
- Uses a **HashMap** to map RNA codons to amino acids

---

## 🛠️ Technologies

- **Java**
- **HashMap (Java Collections)**
- **Javadoc documentation**

---

## 🚀 How to Run

Clone the repository:

```
git clone https://github.com/guthspedro10/DNA-to-Protein-Translator.git
```

Navigate to the project folder:

```
cd DNA-to-Protein-Translator
```

Compile the project:

```
javac DTPTProject/MainPackage/App.java
```

Run the application:

```
java DTPTProject.MainPackage.App
```

---

## 💻 Example

Input DNA sequence:

```
ATGGTTGCTTAA
```

Transcription:

```
AUGGUUGCUUAA
```

Translation result:

```
Met-Val-Ala
```

Console output:

```
Generated mRNA:  AUGGUUGCUUAA
Final Protein:   Met-Val-Ala
```

---

## 🎯 Project Goal

This project was developed to:

- Practice **Java programming**
- Apply concepts from **bioinformatics**
- Simulate biological processes from **molecular biology**
- Demonstrate the use of **data structures such as HashMap**
- Practice **clean code organization using packages**

---

## 📚 Possible Future Improvements

- Add **complete genetic code table (all codons)**
- Add **DNA sequence validation**
- Support **FASTA file input**
- Create a **graphical interface**

---

## 📌 Project Status

✅ **Completed** – Educational project focused on learning **Java and Bioinformatics concepts**.
