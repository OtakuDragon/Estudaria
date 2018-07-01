"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Concessionaria_1 = require("./Concessionaria");
var ConcessionariaDao = /** @class */ (function () {
    function ConcessionariaDao() {
        this.nomeTabela = "tb_concessionaria";
    }
    ConcessionariaDao.prototype.inserir = function (objeto) {
        console.log("Insert");
        return true;
    };
    ConcessionariaDao.prototype.atualizar = function (objeto) {
        console.log("Update");
        return true;
    };
    ConcessionariaDao.prototype.remover = function (id) {
        console.log("Delete");
        return new Concessionaria_1.Concessionaria("", []);
    };
    ConcessionariaDao.prototype.selecionar = function (id) {
        console.log("Select");
        return new Concessionaria_1.Concessionaria("", []);
    };
    ConcessionariaDao.prototype.selecionarTodos = function () {
        console.log("Select All");
        return [];
    };
    return ConcessionariaDao;
}());
