public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setAge(25);
        cliente.setName("Rodrigo");
        cliente.setPhoneNumber("456328374");
        cliente.setCredit(45000);

        System.out.println("Nombre: " + cliente.getName() + " Edad: " +  cliente.getAge() + " Telefono: " + cliente.getPhoneNumber() + " Credito: " +  cliente.getCredit());

        Trabajador trabajador = new Trabajador();

        trabajador.setAge(45);
        trabajador.setName("Ramiro");
        trabajador.setPhoneNumber("234324234");
        trabajador.setSalario(2000);

        System.out.println("Nombre: " + trabajador.getName() + " Edad: " +  trabajador.getAge() + " Telefono: " + trabajador.getPhoneNumber() + " Salario: " +  trabajador.getSalario());
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

class Cliente extends Persona {
    private int credit;

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}

class Trabajador extends Persona {
    private int salario;

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
