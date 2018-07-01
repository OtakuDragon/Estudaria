import Veiculo from "./Veiculo"

export class Carro extends Veiculo {
    private numeroDePortas: number = 0

    constructor(modelo: string, numeroDePortas: number){
        super()
        this.modelo = modelo
        this.numeroDePortas = numeroDePortas
    }
}