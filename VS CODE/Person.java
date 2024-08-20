public class Person {
    private String name;
    private int age;
  
    // Constructor with no parameters
    public Person() {
      name = "";
      age = 0;
    }
  
    // Constructor with name parameter
    public Person(String name) {
      this.name = name;
      age = 0;
    }
  
    // Constructor with age parameter
    public Person(int age) {
      name = "";
      this.age = age;
    }
  
    // Constructor with name and age parameters
    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }
  
    // Getter methods
    public String getName() {
      return name;
    }
  
    public int getAge() {
      return age;
    }
  }
  