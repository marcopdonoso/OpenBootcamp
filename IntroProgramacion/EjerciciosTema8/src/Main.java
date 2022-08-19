public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setAge(40);
        persona.setName("Marco");
        persona.setPhoneNumber("472086012");

        System.out.println(persona.getAge());
        System.out.println(persona.getName());
        System.out.println(persona.getPhoneNumber());
    }
}

class Persona {
    private int age;
    private String name;
    private String phoneNumber;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
