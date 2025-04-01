package padroesestruturais.bridge;

public class DevBackend extends Cargo {

    public DevBackend(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.senioridade.percentualAumento());
    }

}
