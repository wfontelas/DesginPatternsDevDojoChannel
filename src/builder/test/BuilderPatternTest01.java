package builder.test;

import builder.dominio.Person;

/**
 * O design pattern builder nos facilita a criação e organização do objeto *
 */
public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person buildPerson = Person.PersonBuilder.builder()
                .firstName("William")
                .lastName("Fontelas")
                .username("willcda")
                .email("wfontelas@gmail.com")
                .build();
        System.out.println(buildPerson);
    }
}
