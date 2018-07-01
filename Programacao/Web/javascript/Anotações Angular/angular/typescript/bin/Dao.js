"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Dao = /** @class */ (function () {
    function Dao() {
        this.nomeTabela = "";
    }
    Dao.prototype.inserir = function (objeto) {
        console.log("Insert");
        return true;
    };
    Dao.prototype.atualizar = function (objeto) {
        console.log("Update");
        return true;
    };
    Dao.prototype.remover = function (id) {
        console.log("Delete");
        return Object();
    };
    Dao.prototype.selecionar = function (id) {
        console.log("Select");
        return Object();
    };
    Dao.prototype.selecionarTodos = function () {
        console.log("Select All");
        return [];
    };
    return Dao;
}());
exports.Dao = Dao;
