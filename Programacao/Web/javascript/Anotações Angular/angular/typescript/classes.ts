import { Carro } from "./Carro";
import Moto from "./Moto";
import { Pessoa } from "./Pessoa";
import { Concessionaria } from "./Concessionaria";
import { Dao } from "./Dao";

// Main 
//Criar carros
let carro1 = new Carro("Fox", 4)
let carro2 = new Carro("Gol", 4)
let carro3 = new Carro("Uno", 2)

//Montar lista de carros da concessionaria
let listaDeCarros: Carro[] = [carro1, carro2, carro3]

let concessionaria: Concessionaria = new Concessionaria("Rua 78", listaDeCarros)

//Comprar carro
let cliente = new Pessoa("João", "Fox")
console.log(cliente)

concessionaria.mostrarListaDeCarros().map((carro: Carro) => {
    if(carro.modelo == cliente.dizerCarroPreferido()){
        cliente.comprarCarro(carro)
    }
})

console.log(concessionaria.fornecerHorariosDeFuncionamento())
console.log(cliente)

let moto = new Moto()
console.log(moto)
moto.acelerar()
console.log(moto)

let dao: Dao<Concessionaria> = new Dao<Concessionaria>();
dao.inserir(concessionaria)
