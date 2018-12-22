package test.boot.data.redis.controller.test;


public class Student {

            // 工号
            private String workNum;
            // 姓名
            private String name;
            // 性别 1男，2女
            private Boolean sex;
            // 年龄
            private Integer age;
            // 成绩
            private Integer score;

            public String getWorkNum() {
                return workNum;
            }

            public void setWorkNum(String workNum) {
                this.workNum = workNum;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Boolean getSex() {
                return sex;
            }

            public void setSex(Boolean sex) {
                this.sex = sex;
            }

            public Integer getAge() {
                return age;
            }

            public void setAge(Integer age) {
                this.age = age;
            }

            public Integer getScore() {
                return score;
            }

            public void setScore(Integer score) {
                this.score = score;
            }

    public Student(String workNum, String name, Boolean sex, Integer age, Integer score) {
        this.workNum = workNum;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public Student() {
    }


    @Override
    public String toString() {
        return "Student{" +
                "workNum='" + workNum + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
