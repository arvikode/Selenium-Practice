public class AbstractClassExample {
    public static void main(String[] args){
        dog mydog = new dog();
        mydog.sound();
        mydog.friendly();
    }

}

abstract class animal{
    abstract void sound();

    public void friendly(){
        System.out.println("Yes");
    }
}

class dog extends animal {
    void sound(){
        System.out.println("Bark");
    }

}
