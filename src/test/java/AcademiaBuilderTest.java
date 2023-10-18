package src.test.java;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import src.main.java.Academia;
import src.main.java.AcademiaBuilder;


class AcademiaBuilderTest{

    @Test 
    void deveRetornarExcecaoParaNomeInvalido(){
        try {
            AcademiaBuilder academiaBuilder = new AcademiaBuilder();
            Academia academia = academiaBuilder
                  .setNome("Marcelo")
                    .setCelular(null)
                    .setComorbidade("")
                    .setCpf("")
                    .setMatricula("")
                    .setDataNascimento("")
                  .build();
            fail();
        } catch (IllegalAccessException error){
            assertEquals("Nome inválido", error.getMessage());
        }

    }

    @Test 
    void deveRetornarExcecaoParaCPFInvalido() {
        try {
            AcademiaBuilder academiaBuilder= new AcademiaBuilder();
            Academia academia = academiaBuilder
                    .setNome("Marcelo")
                    .setCelular(null)
                    .setComorbidade("")
                    .setCpf("")
                    .setMatricula("")
                    .setDataNascimento("")
                    .build();
            fail();
        } catch (IllegalArgumentException error) {
            assertEquals("CPF inválido", error.getMessage());
        }
    }

    @Test 
    void deveRetornarExcecaoParaMatriculaInvalida() {
        try {
            AcademiaBuilder academiaBuilder= new AcademiaBuilder();
            Academia academia = academiaBuilder
                    .setNome("Marcelo")
                    .setCelular(null)
                    .setComorbidade("")
                    .setCpf("")
                    .setMatricula("202110719")
                    .setDataNascimento("")
                    .build();
            fail();
        } catch (IllegalArgumentException error) {
            assertEquals("CPF inválido", error.getMessage());
        }
    }
}