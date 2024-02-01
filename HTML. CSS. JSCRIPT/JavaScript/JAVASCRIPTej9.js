let fra = prompt("ingrese frase")

let fraN = "";
for (let i = 0; i < fra.length; i++) {
    let letra = fra.substring(i, i + 1);
    fraN = fraN + letra + " ";
    
}
console.log("la frase es : " +fraN)