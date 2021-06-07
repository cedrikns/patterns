package ru.tsedrik.builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Content content = new Content("Добрый день!", "С уважением,\n...");

//        Email email = new EmailBuilder()
//                .subject("subject")
//                .from("ya@ya.ru")
//                .to("to@to.ru")
//                .copyTo("copyto@copyto.ru")
//                .content(content)
//                .build();


//        Email email = new EmailBuilder()
//                .subject("subject")
//                .to("to@to.ru")
//                .copyTo("copyto@copyto.ru")
//                .content(content)
//                .build();

//        Email email = new EmailBuilder()
//                .subject("subject")
//                .to("to@to.ru")
//                .to("to2@to.ru")
//                .toAll(Arrays.asList("to3@to.ru", "to4@to.ru"))
//                .copyTo("copyto@copyto.ru")
//                .content(content)
//                .build();

//        Email email = new EmailBuilder()
//                .subject("subject")
//                .to("to@to.ru")
//                .content(content)
//                .build();

        Email email = new EmailBuilder()
                .subject("subject")
                .to("to@to.ru")
                .to("to2@to.ru")
                .toAll(Arrays.asList("to3@to.ru", "to4@to.ru"))
                .copyTo("copyto@copyto.ru")
                .copyToAll(Arrays.asList("copyto3@to.ru", "copyto4@to.ru"))
                .copyToAll(Arrays.asList("copyto3@to.ru", "to4@to.ru"))
                .content(content)
                .build();

        System.out.println(email);
    }
}
