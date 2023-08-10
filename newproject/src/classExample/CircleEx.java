package classExample;

public class CircleEx {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.setRadius(10.0);
    System.out.println("circle = " + circle.getRadius());
  }
}

//캡슐화
class Circle {
  private double radius = 0.0;  //외부에 공개하지 않을 private radius 값


  /*
  //게터
  public double getRadius() {
    return radius;
  }
  //세터
  public void setRadius(double r) {
    radius = r;

  }--------------------------------------------*/



  //alt + insert로 게터 세터 만들 수 있음
  //public은 생략가능(컨스트럭처>셀렉트논)
  public Circle() {
  }
  public Circle(double radius) {
    this.radius = radius;
  }
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}