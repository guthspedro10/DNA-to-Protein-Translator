document.getElementById("btn").addEventListener("click", async function(){

    let dna = document.getElementById("dna");

    let response = await fetch("http://localhost:8080/convert", {
        method: "POST",
        body: JSON.stringify(dna)
    });

    let data = await response.json();

    document.getElementById("rna").value = data.rna;
    document.getElementById("protein").value = data.protein;

})