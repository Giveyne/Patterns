package BuilderTwo;

public class People {
    private final String name;
    private final Integer age;
    private final String sex;
    public People (String name, Integer age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
    public void printPeople(){
        System.out.println("You find people\n Name: " + name +
                            "\n age: " + age+
                             "\n sex: " + sex);
    }
    private static class Builder{
        private String name;
        private Integer age;
        private String sex;
        private Builder(String name){
            this.name = name;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public People print(){
            return new People(name, age, sex);
        }
    }

    public static void main(String[] args) {
        People igor = new People.Builder("Igor").setAge(35).setSex("male").print();
        igor.printPeople();
    }
}
