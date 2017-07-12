import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
public class StreamTest {
 
    public static void main(String[] args) {
        Person person = new Person("name", 21, Gender.Male);
        Person person0 = new Person("name2", 22, Gender.Female);
        Person person1 = new Person("name3", 23, Gender.Female);
        Person person2 = new Person("name4", 24, Gender.Male);
 
        List<Person> people = Arrays.asList(person, person0, person1, person2);
        
        Map<Integer, Person> map = people.stream().collect(Collectors.toMap((Person p) -> p.getAge(), (Person p) -> p));
        map.entrySet().forEach(System.out::println);
        
        System.out.println(list.stream()
                .filter(v->v>3)
                .reduce(0, (v,k)->v=v+k));
       
        System.out.println(people.stream()
                    .map((Person v)-> v.getName())
                    .reduce((v, k)-> v.concat(k)));
    }
  
}