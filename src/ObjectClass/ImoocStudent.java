package ObjectClass;

public class ImoocStudent {

//    定义属性
    String nickname;

    String position;

    String city;

    String sex;

    public ImoocStudent(){
        System.out.println("无参构造方法");
    }

    public ImoocStudent(String nickname, String position) {
        this.nickname = nickname;
        this.position = position;
    }

    public ImoocStudent(String nickname, String position, String city, String sex) {
        this.nickname = nickname;
        this.position = position;
        this.city = city;
        this.sex = sex;
    }

    public void studyCourse(){
        System.out.println("学习课程");
    }

    public void postComment(){
        System.out.println("发表评论");
    }

    public void postArticle(){
        System.out.println("发表手记");
    }

    public static void main(String[] args) {
        ImoocStudent student=new ImoocStudent();
        student.nickname="Colorful";
        student.position="服务端工程师";
        student.city="北京";
        student.sex="男";

        System.out.println("昵称：" + student.nickname);
        System.out.println("职位：" + student.position);
        System.out.println("城市：" + student.city);
        System.out.println("性别：" + student.sex);

        ImoocStudent student1 = new ImoocStudent("慕女神", "UI设计师");
        System.out.println("昵称为：" + student1.nickname);
        System.out.println("职位为：" + student1.position);
    }
}
