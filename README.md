# 🧬 DNA to Protein Translator

Full-stack web application developed in Java (Spring Boot) and Vanilla JavaScript that simulates part of the Central Dogma of Molecular Biology:

DNA → RNA → Protein

The application receives a DNA sequence, performs transcription to RNA, executes translation into an amino acid chain using a genetic code dictionary, and automatically persists the transaction history in a relational database.

This project was built to practice Full-Stack Software Development, RESTful API architecture, Database Persistence, and apply Bioinformatics concepts.

---

## ⚙️ Features

- RESTful API Endpoint for DNA processing (POST /convert).
- DNA → RNA Transcription (Thymine T replaced by Uracil U).
- RNA → Protein Translation using codon triplets starting at the Start Codon (AUG).
- Stop Codon Detection (UAA, UAG, UGA) to terminate protein synthesis.
- Complete Codon Dictionary implemented via HashMap.
- SQL Database Persistence: Automatically saves each processing entry (id auto-increment, dna, rna, protein) using Spring Data JPA.
- Responsive Web UI built with HTML, CSS, and JavaScript.
- CORS Enabled for seamless client-server communication.

---

## 🏗️ Project Architecture

The project follows a standard Spring Boot layered architecture:

src/main/java/com/pedroguths/dna2proteintranslator/
├── controller/
│   └── DNAController.java        # REST Controller handling HTTP requests
├── dto/
│   ├── requestDTO/
│   │   └── DNARequest.java       # Request payload mapping
│   └── responseDTO/
│       └── DNAResponse.java      # Response payload mapping
├── model/
│   ├── DNAModel.java             # JPA Entity mapping to the SQL database table
│   └── GeneticCode.java          # HashMap mapping codons to amino acids
├── repository/
│   └── DNARepository.java        # Spring Data JPA Repository for database queries
└── service/
    └── DNAService.java           # Core transcription, translation, and persistence logic

---

## 🛠️ Technologies

### Backend & Database
- Java 17+
- Spring Boot (Web, REST API)
- Spring Data JPA / Hibernate
- MySQL (Managed via MySQL Workbench)
- Maven (Dependency & Build Management)

### Frontend
- HTML5 & CSS3
- JavaScript (ES6+) (Fetch API)

---

## 🔌 API Reference

### Convert DNA Sequence

POST /convert

Request Body:
{
  "dna": "ATGACTGCCAATTGA"
}

Response (200 OK):
{
  "rna": "AUGACUGCCAAUUGA",
  "protein": "Met-Thr-Ala-Asn"
}

---

## 🚀 How to Run

### Prerequisites
- Java Development Kit (JDK 17+)
- MySQL Server & MySQL Workbench
- Maven (or use the included ./mvnw wrapper)

### 1. Database Setup
Configure your MySQL database connection in src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/dna_db
spring.datasource.username=YOUR_MYSQL_USER
spring.datasource.password=YOUR_MYSQL_PASSWORD
spring.jpa.hibernate.ddl-auto=update

### 2. Clone the repository
git clone https://github.com/guthspedro10/DNA-to-Protein-Translator.git
cd DNA-to-Protein-Translator

### 3. Run the Backend API
./mvnw spring-boot:run
(The server will start on http://localhost:8080)

### 4. Run the Frontend
Simply open the index.html file in your browser or serve it using Live Server in VS Code.

---

## 💻 Example Usage

1. Open the Web UI.
2. Paste a DNA sequence starting with ATG (e.g., ATGACTGCCAATTGA).
3. Click Convert.
4. View the transcribed RNA sequence and resulting Protein chain in real time.
5. Check MySQL Workbench to see the auto-incremented record saved in the database.

---

## 📚 Possible Future Improvements

- Add DNA sequence validation (regex check for valid A, T, C, G bases).
- Add support for FASTA file uploads.
- Add GET endpoints to retrieve saved translation history in the UI.
- Add automated unit tests with JUnit 5 & Mockito.

---

## 📌 Project Status

✅ Completed – Full-stack educational project focused on Spring Boot, Web APIs, Relational Databases, and Bioinformatics.
