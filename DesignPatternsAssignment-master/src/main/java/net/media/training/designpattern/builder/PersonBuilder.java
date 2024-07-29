package net.media.training.designpattern.builder;

public class PersonBuilder {
    private String name;
    private int id;
    private String city;
    private String country;

    PersonBuilder() {

    }

    PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    PersonBuilder id(int id) {
        this.id = id;
        return this;
    }

    PersonBuilder city(String city) {
        this.city = city;
        return this;
    }

    PersonBuilder country(String country) {
        this.country = country;
        return this;
    }

    Person build() {
        return new Person(this.name, this.id, this.city, this.country);
    }
}
