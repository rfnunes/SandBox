package com.ossnms.sandbox;

import java.text.MessageFormat;
import java.util.Arrays;

public class MessageFormatTest {

    public static void main(String[] args) {
        new MessageFormatTest().go();
    }

    private void go() {

        Arrays.stream(new int[]{99, 12, 10, 10, 13, 14, 15, 18})
              .filter(i -> i % 2 == 0)
              .distinct()
              .sorted()
              .findFirst();

        String mesg = "This {0} a {1}";
        String[] args = new String[]{"is", "message"};

        System.out.println(MessageFormat.format(mesg, (Object[]) args));
        System.out.println(MessageFormat.format(mesg, (Object[]) new String[]{}));

    }
}
