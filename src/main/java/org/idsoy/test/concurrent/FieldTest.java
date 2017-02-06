package org.idsoy.test.concurrent;

import java.lang.reflect.Field;

/**
 * Created by idsoy on 2016/10/12.
 */
public class FieldTest {

    public static void main(String[] args) throws IllegalAccessException {

        MyField myField = new MyField();

        myField.setId("123");
        myField.setName("idsoy");

        Field[] fields =  myField.getClass().getDeclaredFields();

        for(Field field : fields) {
            if (!field.isAccessible())
                field.setAccessible(true);
            Object o = field.get(myField);
            System.out.println(o);
        }

    }

    private static class MyField {

        private String Id;

        private String name;

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
