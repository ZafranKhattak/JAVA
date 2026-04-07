class Address {
    String city;
}

class Student {

    Address address;

    Student(Address address) {
        this.address = address;
    }

    void display() {
        System.out.println("Address: " + address.city);
    }
}

class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.city = "Lahore";

        Student student = new Student(address);
        student.display();
    }
}