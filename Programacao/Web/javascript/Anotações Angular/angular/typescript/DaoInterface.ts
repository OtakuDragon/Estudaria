export default interface DaoInterface<T> {
    nomeTabela: string

    inserir(objeto: T): boolean
    atualizar(objeto: T): boolean
    remover(id: number): T
    selecionar(id:number): T
    selecionarTodos(): T[]
}