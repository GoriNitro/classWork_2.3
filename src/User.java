import java.lang.reflect.MalformedParameterizedTypeException;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name)
            throws IllegalNameException {
       if (name.length()>20){
            throw new IllegalNameException("Ошибка. Длинна имени " +
                   "Не может быть больше 20 символов "+
                  "Вы ввели: " + name);
        }
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age > 120){
            throw new IllegalAgeException("Ошибка. возраст " +
                    "Юзера не может быть больше 120 или меньше"+
                    " нуля. Вы ввели: " + age);
        }
        this.age = age;
    }
}
