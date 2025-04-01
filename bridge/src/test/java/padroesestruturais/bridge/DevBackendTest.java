package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevBackendTest {

    @Test
    void retornarSalarioDevBackendJunior() {
        Senioridade senioridade = new Junior();
        DevFrontend devFrontend = new DevFrontend(1000.0f);
        devFrontend.setSenioridade(senioridade);
        assertEquals(1100.0f, devFrontend.calcularSalario(), 0.0f);
    }

    @Test
    void retornarSalarioDevBackendPleno() {
        Senioridade senioridade = new Pleno();
        DevFrontend devFrontend = new DevFrontend(1000.0f);
        devFrontend.setSenioridade(senioridade);
        assertEquals(1200.0f, devFrontend.calcularSalario(), 0.0f);
    }

    @Test
    void retornarSalarioDevBackendSenior() {
        Senioridade senioridade = new Senior();
        DevFrontend devFrontend = new DevFrontend(1000.0f);
        devFrontend.setSenioridade(senioridade);
        assertEquals(1300.0f, devFrontend.calcularSalario(), 0.0f);
    }

}