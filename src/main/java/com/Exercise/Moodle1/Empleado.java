package com.Exercise.Moodle1;

public class Empleado {
    private int id;
    private String name;
    private byte age;
    private short experience;
    private double salary;
    private float tall;
    private long serial;
    private char genre;
    private boolean status;

    public Empleado(int id, String name,byte age, short experience, double salary, float tall, long serial, char genre, boolean status){

        this.id = id;
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.salary = salary;
        this.tall = tall;
        this.serial = serial;
        this.genre = genre;
        this.status = status;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public byte getAge() { return age; }
    public void setAge(byte age) { this.age = age; }

    public String getName() { return name; }
    public void setAge(String name) { this.name = name; }

    public short getExperience() { return experience; }
    public void setExperience(short experience) { this.experience = experience; }

    public double getSalary() { return salary; }
    public void setAge(double salary) { this.salary = salary; }

    public float getTall() { return tall; }
    public void setTall(float tall) { this.tall = tall; }

    public long getSerial() { return serial; }
    public void setSerial(long serial) { this.serial = serial; }

    public char getGenre() { return genre; }
    public void setGenre(long serial) { this.serial = serial; }
    
    public boolean getStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }
    
}
