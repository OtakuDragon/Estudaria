import DaoInterface from "./DaoInterface"
import {Concessionaria} from "./Concessionaria"

class ConcessionariaDao implements DaoInterface<Concessionaria>{

    nomeTabela: string = "tb_concessionaria"

    inserir(objeto: Concessionaria): boolean {
        console.log("Insert")
        return true
    }
    atualizar(objeto: Concessionaria): boolean {
        console.log("Update")
        return true
    }
    remover(id: number): Concessionaria {
        console.log("Delete")
        return new Concessionaria("",[])
    }
    selecionar(id:number): Concessionaria{
        console.log("Select")
        return new Concessionaria("",[])
    }
    selecionarTodos(): Concessionaria[] {
        console.log("Select All")
        return []
    }

}