import java.util.ArrayList;
import java.util.Date;



public class People {
    private int age;
    private String name;
    private float balance;
    private boolean sex;
    private Date birthDay;
    private Object t;

    public People(int age) {
        this.age = age;
    }

    public People(int age, String name, float balance, boolean sex, Date birthDay) {
        this.age = age;
        this.name = name;
        this.balance = balance;
        this.sex = sex;
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                '}';
    }

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

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

}
