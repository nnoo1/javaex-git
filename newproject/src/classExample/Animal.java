package classExample;

//상속

//부모클래스
class Animal {
  void 숨쉰다(){
    System.out.println("숨쉰다");
  }
  void 먹는다(){
    System.out.println("먹는다");
  }
  void 움직인다(){
    System.out.println("움직인다");
  }
}

//자식
class Bird extends Animal {
  void 헤엄친다(){
    System.out.println("헤엄친다");

  }
}

class Tiger extends Animal {
  void 달린다(){
    System.out.println("달린다");

  }
}
