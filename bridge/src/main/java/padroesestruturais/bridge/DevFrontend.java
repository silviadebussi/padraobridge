package padroesestruturais.bridge;

public class DevFrontend extends Cargo {

    public DevFrontend(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {return this.salarioBase * (1 + this.senioridade.percentualAumento());}
}
