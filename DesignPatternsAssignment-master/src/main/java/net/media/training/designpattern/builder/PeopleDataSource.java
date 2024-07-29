package net.media.training.designpattern.builder;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: path
 * Date: Jul 19, 2011
 * Time: 10:04:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class PeopleDataSource {
    public static String getPeopleXml(List<Person> persons) {
        String finalXML = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

        XMLTagBuilder peopleBuilder = new XMLTagBuilder("People");
        peopleBuilder.attribute("number", String.valueOf(persons.size()));

        for (Person person : persons) {

            XMLTagBuilder personBuilder = new XMLTagBuilder("Person");
            personBuilder.attribute("id", String.valueOf(person.getId()));
            personBuilder.attribute("name", person.getName());

            personBuilder.children(
                    new XMLTagBuilder("Address").children(
                            new XMLTagBuilder("City").children(person.getCity()).build()
                    ).children(
                            new XMLTagBuilder("Country").children(person.getCountry()).build()
                    ).build()
            );
            peopleBuilder.children(personBuilder.build());
        }

        finalXML += peopleBuilder.build();

        return finalXML;
    }
}