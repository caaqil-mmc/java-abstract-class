public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Omer omer;
        omer =new Jabril();
        omer.drink();
        omer =new Safiya();
        omer.drink();
        omer =new Asha();
        omer.drink();
    }
}

abstract  class  Omer{
    public abstract void drink();
}
class Jabril extends Omer{
    @Override
    public void drink() {
        System.out.println("Omer drunk honey");
    }
}
class Safiya extends Omer{
    @Override
    public void drink() {
        System.out.println("Omer drunk juice");
    }
}
class Asha extends Omer{
    @Override
    public void drink() {
        System.out.println("Omer drunk milk");
    }
}
