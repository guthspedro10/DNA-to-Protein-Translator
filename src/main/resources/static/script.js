document.getElementById("btn-convert").addEventListener("click", async function () {

    let dnaInput = document.getElementById("dna").value;

    if (!dnaInput.trim()) {
        alert("Please enter a DNA sequence.");
        return;
    }

    try {
        let response = await fetch("http://localhost:8080/convert", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({ dna: dnaInput.trim() })
        });

        if (!response.ok) {
            throw new Error("Conversion error on server.");
        }

        let data = await response.json();

        document.getElementById("rna").value = data.rna;
        document.getElementById("protein").value = data.protein;

    } catch (error) {
        console.error(error);
        alert("Error connecting to the server. Please check if the backend is running.");
    }

});