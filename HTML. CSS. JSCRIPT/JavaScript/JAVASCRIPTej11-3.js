let fra = prompt("ingrese una frase","est es un programa de JavaScript");
let mas_larga = (frase)=>{
    const palabras=frase.split(' ');
    let max=palabras[0];
    for (const palabra of palabras) {
        if(max.length<palabra.length)
        {
            max=palabra;
        }
    }
    return max;
};
alert(mas_larga(fra));