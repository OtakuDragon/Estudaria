"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
var Carro_1 = require("./Carro");
var Moto_1 = __importDefault(require("./Moto"));
var Pessoa_1 = require("./Pessoa");
var Concessionaria_1 = require("./Concessionaria");
var Dao_1 = require("./Dao");
// Main 
//Criar carros
var carro1 = new Carro_1.Carro("Fox", 4);
var carro2 = new Carro_1.Carro("Gol", 4);
var carro3 = new Carro_1.Carro("Uno", 2);
//Montar lista de carros da concessionaria
var listaDeCarros = [carro1, carro2, carro3];
var concessionaria = new Concessionaria_1.Concessionaria("Rua 78", listaDeCarros);
//Comprar carro
var cliente = new Pessoa_1.Pessoa("João", "Fox");
console.log(cliente);
concessionaria.mostrarListaDeCarros().map(function (carro) {
    if (carro.modelo == cliente.dizerCarroPreferido()) {
        cliente.comprarCarro(carro);
    }
});
console.log(concessionaria.fornecerHorariosDeFuncionamento());
console.log(cliente);
var moto = new Moto_1.default();
console.log(moto);
moto.acelerar();
console.log(moto);
var dao = new Dao_1.Dao();
dao.inserir(concessionaria);
