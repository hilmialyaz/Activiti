package org.milleni.dunning.datamodel.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final Map<String, Person> people = new ConcurrentHashMap<String, Person>();

    @PostConstruct
    public void init() {
        savePerson(new Person("Martin", "Fowler"));
        savePerson(new Person("James", "Gosling"));
    }

    /**
     *
     * @param firstName first name
     * @return {@link Person} that will be cached because of {@link Cacheable} under a name of <b>person</b>
     */
    @Cacheable("person")
    public Person getPerson(final String firstName) {
        System.out.println(String.format("Loading a person with firstName of : %s", firstName));
        return people.get(firstName);
    }

    /**
     * By usage of {@link CacheEvict} framework is being told to cache this input parameter in
     * a cache called <b>person</b>. Also the key for the cache is determined by an SpEl like:
     * <b>#person.firstName</b>
     * @param person {@link Person}
     */
    @CacheEvict(value = "person", key = "#person.firstName")
    public void savePerson(final Person person) {
        System.out.println(String.format("Saving a person with firstName of : %s", person.getFirstName()));
        people.put(person.getFirstName(), person);
    }
} 