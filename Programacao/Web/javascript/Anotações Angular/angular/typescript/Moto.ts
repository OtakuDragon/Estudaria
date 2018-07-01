import Veiculo from "./Veiculo"

export default class Moto extends Veiculo{
    public acelerar(): void {
        this.velocidade = this.velocidade + 20
    }
}