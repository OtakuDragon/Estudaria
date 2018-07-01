import DaoInterface from "./DaoInterface"

export class Dao<T> implements DaoInterface<T>{
    nomeTabela: string = ""

    inserir(objeto: T): boolean {
        console.log("Insert")
        return true
    }
    atualizar(objeto: T): boolean {
        console.log("Update")
        return true
    }
    remover(id: number): T {
        console.log("Delete")
        return Object()
    }
    selecionar(id:number): T{
        console.log("Select")
        return Object()
    }
    selecionarTodos(): T[] {
        console.log("Select All")
        return []
    }

}