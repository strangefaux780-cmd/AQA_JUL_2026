package org.prog.session6;

public class homework5 {
    public static void main(String[] args) {
        String[] emails=new String[]{
                "abc@test.com",
                "hello@domain.net",
                "ab@test.com",
                "abc@@test.com",
                "abc@test",
                "abc@.com",
                "abc@t.c"
        };
        for(int i=0;i< emails.length;i++){
                int atIndex = emails[i].indexOf("@");
            int dotIndex = emails[i].indexOf(".", atIndex);
            if (atIndex == emails[i].lastIndexOf("@")
                    && atIndex >= 3
                    && dotIndex != -1
                    && dotIndex != atIndex + 1
                    && emails[i].length() - atIndex - 1 >= 5) {
                System.out.println(emails[i]);

            }
        }

    }
}

