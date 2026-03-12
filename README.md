# 🧬 Tradutor de Sequências Genéticas

Projeto em **`Java`** que simula o **`Dogma Central da Biologia Molecular`**:

DNA → RNA → Proteína

A aplicação recebe uma sequência de **DNA**, realiza a **transcrição para RNA** e depois a **tradução para aminoácidos** utilizando uma tabela de códons armazenada em um **HashMap**.

---

## ⚙️ Funcionalidades

- Transcrição de **DNA para RNA** (T → U)
- Tradução de **RNA para proteína**
- Identificação do **Start Codon (AUG)**
- Interrupção automática em **Stop Codons (UAA, UAG, UGA)**
- Uso de **HashMap como dicionário de códons**
- Código documentado com **Javadoc**

---

## 🛠️ Tecnologias

- Java
- HashMap (Java Collections)

---

## 🚀 Como Executar


git clone https://github.com/guthspedro10/DNA-to-Protein-Translator.git

cd DNA-to-Protein-Translator

javac DNA-to-Protein-Translator.java

java DNA-to-Protein-Translator


---

## 💻 Exemplo

Entrada:

```
DNA: ATGGTTTAA
```

Processo:

```
RNA: AUGGUUUAA
```

Saída:

```
Proteína: Met - Val
```

---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido para:

- Praticar **`programação em Java`**
- Aplicar conceitos de **`bioinformática`**
- Simular processos reais da **`biologia molecular`**
- Demonstrar o uso de **estruturas de dados como HashMap**

---

## 📚 Possíveis Melhorias Futuras

- Implementar leitura de sequências via **`arquivo FASTA`**
- Criar **`interface gráfica`**
- Adicionar **`validação de sequências de DNA`**

---

## 📌 Status do Projeto

✔ Em andamento 
