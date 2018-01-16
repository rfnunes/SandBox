package com.evaluation;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Diamond {

    public static void main(String[] args) {
        IntStream.rangeClosed(0, 16)
                 .boxed()
                 .forEach(i -> new Diamond().go(i));

    }

    private void go(int i) {

        List<String> lines =
        IntStream.range(0, (i/2)+1)
                 .mapToObj(line -> getLine(i, line))
                 .collect(Collectors.toList());

        /*
        List<String> lines = new ArrayList<>(i);

        for (int line = 0; line < (i / 2) + 1; line++) {
            lines.add(getLine(i, line));
        }
        */

        for (int x = 0; x < lines.size(); x++) {
            System.out.println(lines.get(x));
        }

        for (int x = lines.size() - 2; x >= 0; x--) {
            System.out.println(lines.get(x));
        }
    }

    private String getLine(int i, int line) {
        int spaces = (i / 2) - line;

        StringBuilder halfLine = new StringBuilder();
        int v;
        for (v = 1; v < line + 1; v++) {
            halfLine.append(v);
        }

        String spacesStr = getSpaces(spaces);

        return new StringBuilder().append(spacesStr)
                                  .append(halfLine)
                                  .append(v)
                                  .append(halfLine.reverse())
                                  .append(spacesStr).toString();
    }

    public String getSpaces(int n) {
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
