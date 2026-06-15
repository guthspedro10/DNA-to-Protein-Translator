document.getElementById("btn").addEventListener("click", async function () {

    let dna = document.getElementById("dna").value;

    if (!dna.trim()) {
        alert("Digite uma sequência de DNA");
        return;
    }

    try {

        let response = await fetch("http://localhost:8080/convert", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(dna)
        });

        if (!response.ok) {
            throw new Error("Erro na conversão");
        }

        let data = await response.json();

        document.getElementById("rna").value = data.rna;
        document.getElementById("protein").value = data.protein;

    } catch (error) {
        console.error(error);
        alert("Erro ao conectar com o servidor");
    }

});