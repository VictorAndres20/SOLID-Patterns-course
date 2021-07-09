# Project for practice all SOLID and software development patterns of Udemy Course

## SOLID

**Single Responsibility Principle**
"A class should have only one reason to change" — Robert C. Martin

**Open Close Principle**
¿Is our project ready for extensions?

"Software entities (classes, modules, functions...) shuold be open for extensions but closed for modifications"
- Bertrand Meyer

**Liskov Substitution Principle**
```
Class T <|---Extends--- Class S
x = T()
y = S()
def(x) === def(y)

Substitution 'x' for 'y' is true
```

- Barbara Liskov

**Interface Segregation Principle**
You should segregate functionalitites in Interfaces. With this, you can extend classes for functionalities that the client needs

**Dependency Inversion Principle**
"
A: High-Level modules should not depend on Low-Level modules. Both should depend on Abstractions

B: Abstractions should not depend upon details. Details should depend on Abstractions.
"

- Robert C Martin


## Creational patterns

**Abstract Factory Pattern**
"Provide an interface for creating families of related or dependent onjects without specifying their concrete classes"

- GoF

```
public inteface AbstractFactory{
    IStudentsRepo createStudentsRepo();
    ICoursesRepo createCoursesRepo();
}

public class FactorySpecific implements AbstractFactory{}
```

**Builder Pattern**
"Separate the construction of a complex object from its representation so that the same construction process can create different representations"

- GoF

```
public class Person {
    private String name, city, job, school;
    private int age;
    private Person(){}
    public static class Builder {
	private Person person;
		
	public Builder(String name) {
	    person = new Person();
	    person.name = name;
	}
		
	public Builder setCity (String city) {
	    person.city = city;
	    return this;
	}
		
	public BuilderOld setOld(int age) {
            if(age < 18) throw new IllegalArgumentException("es menor de edad " + age);
            person.age = age;
            person.job = null;
            return new BuilderOld(person);
	}
		
	public BuilderYoung setYoung(int age) {
            if (age >= 18) throw new IllegalArgumentException("es mayor de edad " + age);
            person.age = age;
            person.school = school;
            return new BuilderYoung(person);
	}
	
	public Persona build() {
	    return person;
	}
    }

    // Restrictions
    public static class BuilderOld{
	private Person person;
	public BuilderOld(Person personP){
	    person=personP;
	}

	public BuilderOld setJob(String job){
	    person.job = job;
	    return this;	
	}

	public Person build(){
	    return person;
	}
    }

    public static class BuilderYoung{
	private Person person;
	public BuilderYoung(Person personP){
	    person=personP;
	}

	public BuilderYoung setSchool(String school){
	    person.school = school;
	    return this;
	}

	public Person build(){
	    return person;
	}
    }
}


// USAGE
Person son = new Person.Builder("Peter")
    .setYoung(4)
    .setSchool("Colegio de Selva")
    .build();
```

**Factory Method Pattern**
"Define an interface for creating an object, but let subclasses decide which class to instantiate.
The factory method lets a class defer instatiations it uses to subclasses"

- GoF

IProduct <=------ AbstractCreator [factoryMethod():IProduct , abstract create():Product]
    / \                 / \
     |                   |
     |                   |
   Extends            Extends
     |                   |
     |                   |
ConcreteProduct <=----ConcreteCreator [create():Product]

