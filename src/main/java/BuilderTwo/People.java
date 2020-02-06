package BuilderTwo;

public class People {
    private final String name;
    private final Integer age;
    private final String sex;
    public People (Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
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
            return new People(this);
        }
    }

    public static void main(String[] args) {
        People igor = new People.Builder().setName("Igor").setAge(35).setSex("male").print();
        igor.printPeople();
    }
}
