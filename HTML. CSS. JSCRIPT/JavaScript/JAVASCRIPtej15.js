//Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo 
//con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El 
//radio del círculo lo proporcionará el usuario

//let Circulo = (parseInt(prompt("ingrese radio")));


//function calcularPerimetro(Circulo){
    //p = 2 * Math.PI * Circulo;
    //return p;
//}
//function calcularArea(Circulo){
   // m = Math.PI * Math.pow(Circulo, 2);
    //return m;
//}
//function circulo2(){
 //   this.calcularArea,
   // this.calcularPerimetro,
//}
//let circulo2 = new circulo2();



  ///console.log(circulo2);

  function calcularArea(radio) {
    return Math.PI * Math.pow(radio, 2);
  }
  function calcularPerimetro(radio) {
    return 2 * Math.PI * radio;
  }
  function Circulo(radio) {
    this.area = calcularArea(radio);
    this.calcularArea = calcularArea;
    this.perimetro = calcularPerimetro(radio);
    this.calcularPerimetro = calcularPerimetro;
  }
  let circu = new Circulo(parseInt(prompt("Ingresá el radio del círculo")));
   console.log(circu)