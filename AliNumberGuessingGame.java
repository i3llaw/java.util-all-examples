import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        // إنشاء ArrayList لتخزين أسماء الطلاب
        ArrayList<String> studentNames = new ArrayList<String>();

        // إضافة أسماء الطلاب إلى القائمة
        studentNames.add("أحمد");
        studentNames.add("فاطمة");
        studentNames.add("علي");

        // عرض عدد الطلاب في القائمة
        System.out.println("عدد الطلاب: " + studentNames.size());

        // عرض أسماء الطلاب في القائمة
        for (String name : studentNames) {
            System.out.println(name);
        }

        // إزالة اسم الطالب علي من القائمة
        studentNames.remove("علي");

        // عرض عدد الطلاب في القائمة بعد إزالة اسم الطالب علي
        System.out.println("عدد الطلاب بعد إزالة اسم الطالب علي: " + studentNames.size());

        // عرض أسماء الطلاب المتبقين في القائمة
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}