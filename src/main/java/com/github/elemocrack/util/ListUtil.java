package com.github.elemocrack.util;

import java.util.List;

public class ListUtil {
    public static void showList(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
