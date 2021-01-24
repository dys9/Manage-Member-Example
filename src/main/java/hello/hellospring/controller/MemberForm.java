package hello.hellospring.controller;

// PostMaping("/members/new")에 의해 생성되는 Class Object
public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    //setter는 Spring이 접근함. 신기하다.
    public void setName(String name) {
        this.name = name;
    }
}
