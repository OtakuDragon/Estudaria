import { Carro } from "./Carro";
import { ConcessionariaInterface } from "./ConcessionariaInterface";

export class Concessionaria implements ConcessionariaInterface {
    private endereco: string
    private listaDeCarros: Carro[]

    constructor(endereco: string, listaDeCarros: Carro[]){
        this.endereco = endereco
        this.listaDeCarros = listaDeCarros
    }

    public fornecerEndereco(): string {
        return this.endereco
    }

    public mostrarListaDeCarros(): Carro[]{
        return this.listaDeCarros
    }

    public fornecerHorariosDeFuncionamento(): string {
        return "Seg. à Sex. 08:00 ás 18:00"
    }
}