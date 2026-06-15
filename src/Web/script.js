document.getElementById("btn").addEventListener("click", async function(){

    let dna = document.getElementById("dna").value;

    let response = await fetch("http://localhost:8080/convert", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(dna)
    });

    let data = await response.json();

    document.getElementById("rna").value = data.rna;
    document.getElementById("protein").value = data.protein;

})