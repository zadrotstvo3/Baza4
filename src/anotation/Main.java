package anotation;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        String email = "!@#$%^&*()";
        boolean matches = email.matches("[!@#$%^&*()]{1,}");
//        System.out.println(matches);


        User user = new User(1,"vasya", "!@#$^&*4()");
        EmailHandler(user);
    }

     public static void EmailHandler(User user) throws IllegalAccessException {
         Class<? extends User> aClass = user.getClass();
         Field[] declaredFields = aClass.getDeclaredFields();
         for (Field fild : declaredFields) {
             fild.setAccessible(true);
             if (fild.isAnnotationPresent(EmailValidator.class)){
                 String email = (String) fild.get(user);
                 if (!email.matches("!@#$^&*4()")){
                     EmailValidator annotation = fild.getAnnotation(EmailValidator.class);
                     String message = annotation.message();
                     System.out.println(message);
                 }
             }
         }
     }
}
