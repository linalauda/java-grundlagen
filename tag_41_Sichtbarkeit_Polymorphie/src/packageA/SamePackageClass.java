package packageA;


import packageB.Child;

public class SamePackageClass {

    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.publicMethod();      // ✅ erlaubt
        parent.protectedMethod();   // ✅ erlaubt
        parent.defaultMethod();     // ✅ erlaubt

        Child c = new Child();

        c.protectedMethod();
    }
}
