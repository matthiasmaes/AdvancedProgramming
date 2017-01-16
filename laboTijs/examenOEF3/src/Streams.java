
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static jdk.nashorn.internal.objects.NativeMath.random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tijs
 */
public class Streams {
    private final Random random ;
    List<Student> students;
    List<Eindwerk> eindwerken;
    List<String> opleidingen = new ArrayList<>();

    
    public Streams() {
        this.random = new Random(1);
        opleidingen.add("OPT");
        opleidingen.add("ICT");
        opleidingen.add("EO");
        CreateStudents();
        CreateEindwerken();
    }
    
    public void CreateStudents(){
        NaamGenerator namegen = new NaamGenerator();
        students = new ArrayList<Student>();
        for (int i = 0; i < 50; i++) {
            students.add(new Student(namegen.getRandomFirstName(),namegen.getRandomName(),namegen.getRandomNum()));
        }
    }
    
    public void CreateEindwerken(){
        NaamGenerator namegen = new NaamGenerator();
        eindwerken = new ArrayList<Eindwerk>();
        

        
        for (int i = 0; i < 50; i++) {
            String title = namegen.makeTitleWithRandomWords(5);
            int year = namegen.getRandomYear();
            String opleiding = opleidingen.get(random.nextInt(opleidingen.size()));
            Student student = students.get(random.nextInt(students.size()-1));
            eindwerken.add(new Eindwerk(title, year , opleiding, student));
        }
    }
    public void SortStudents(){
        System.out.println("*************Sort studenten******************");
       Comparator<Student> byFirstName = (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName());    
       Comparator<Student> byLastName = (s1, s2) -> s1.getLastName().compareTo(s2.getLastName());         
       Comparator<Student> byNumber = (s1, s2) -> s1.getNumber().compareTo(s2.getNumber());         
    
       students.stream().sorted(byLastName.thenComparing(byFirstName).thenComparing(byNumber)).forEach(e -> System.out.println(e));
       System.out.println(); 
    }
    
    public  Supplier<Stream<Eindwerk>> eindwerkenMaker = () -> {
            return eindwerken.stream();
        };
    
    public void FilterEindwerken(){
        System.out.println("*************Eindwerken******************");
        eindwerkenMaker.get().filter(e -> e.student.voornaam.contains("r"))
                             .forEach(e -> System.out.println(e));
        System.out.println("**********************************************");
        eindwerkenMaker.get().filter(e -> e.opleiding.equals("ICT"))
                             .forEach(e -> System.out.println(e));
        System.out.println("**********************************************");
        eindwerkenMaker.get().filter(e -> e.titel.endsWith("f "))
                             .forEach(e -> System.out.println(e));
        System.out.println();     
    }
    
    public void StreamOfStreams(){    
        System.out.println("*************Groupingby******************");
        List<Stream<Eindwerk>> lijst = new ArrayList();        
        for (String opl : this.opleidingen) {           
             lijst.add(eindwerkenMaker.get().filter((Eindwerk e) -> {                
                   return (e.opleiding.equals(opl));            
             }));        
        }        
        Stream<Stream<Eindwerk>> streamsEindw = lijst.stream();

        streamsEindw.map((Stream<Eindwerk> s)                
            -> s.collect(Collectors.groupingBy(e -> e.opleiding + e.jaartal,Collectors.counting())))                
                .forEach(m -> {                    
                    for (String key : m.keySet()) {                        
                         System.out.println(key + "  " + m.get(key));
                    }                
                });
        System.out.println(); 
    }
}
