package sprint6.topic2.unitTests.lesson8;

public class NameConverter {

    // этот метод возвращает строку фамилия + имя из переданных параметров
    public String getFullName(String name, String surname){
        if (surname != null && !surname.isBlank() && name != null && !name.isBlank()){
            return surname + " " + name;
        }
        if (surname != null && !surname.isBlank()){
            return surname;
        }
        if (name != null && !name.isBlank()){
            return name;
        }
        throw new RuntimeException("Не введено ни одно значение");
    }

    // этот метод использует логику первого метода
    public String getFullNameByName(String name){
        return getFullName(name, null);
    }
    // этот метод использует логику первого метода
    public String getFullNameBySurname(String surname){
        return getFullName(null, surname);
    }

}