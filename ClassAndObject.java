public class ClassAndObject {
    public class InnerClassAndObject {
        void method(){
            System.out.println("This is method");
        }
    }

    public static void main(String[] args){
        ClassAndObject outerObject = new ClassAndObject();
        InnerClassAndObject object = outerObject.new InnerClassAndObject();

        object.method();
    }
}
