# 🧬 Genetic Sequence Translator

Project developed in **`Java`** that simulates the **`Central Dogma of Molecular Biology`**:

DNA → RNA → Protein

The application receives a **DNA sequence**, performs **transcription to RNA**, and then **translation into amino acids** using a codon table stored in a **HashMap**.

---

## ⚙️ Features

- **DNA to RNA transcription** (T → U)
- **RNA to protein translation**
- Identification of the **Start Codon (AUG)**
- Automatic stop at **Stop Codons (UAA, UAG, UGA)**
- Use of **HashMap as a codon dictionary**
- Code documented using **Javadoc**

---

## 🛠️ Technologies

- Java
- HashMap (Java Collections)

---

## 🚀 How to Run

```
git clone https://github.com/guthspedro10/DNA-to-Protein-Translator.git

cd DNA-to-Protein-Translator

javac DNA-to-Protein-Translator.java

java DNA-to-Protein-Translator
```

---

## 💻 Example

Input:

```
DNA: ATGGTTTAA
```

Process:

```
RNA: AUGGUUUAA
```

Output:

```
Protein: Met - Val
```

---

## 🎯 Project Goal

This project was developed to:

- Practice **`Java programming`**
- Apply concepts from **`bioinformatics`**
- Simulate real processes of **`molecular biology`**
- Demonstrate the use of **data structures such as HashMap**

---

## 📚 Possible Future Improvements

- Implement sequence input via **`FASTA file`**
- Create a **`graphical interface`**
- Add **`DNA sequence validation`**

---

## 📌 Project Status

✔ In progress
