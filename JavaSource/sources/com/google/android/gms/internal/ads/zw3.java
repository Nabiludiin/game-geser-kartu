package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class zw3 {
    public static String a(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (d(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c8 = charArray[i7];
                    if (d(c8)) {
                        charArray[i7] = (char) (c8 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static String b(String str) {
        int length = str.length();
        int i7 = 0;
        while (i7 < length) {
            if (c(str.charAt(i7))) {
                char[] charArray = str.toCharArray();
                while (i7 < length) {
                    char c8 = charArray[i7];
                    if (c(c8)) {
                        charArray[i7] = (char) (c8 ^ ' ');
                    }
                    i7++;
                }
                return String.valueOf(charArray);
            }
            i7++;
        }
        return str;
    }

    public static boolean c(char c8) {
        return c8 >= 'a' && c8 <= 'z';
    }

    public static boolean d(char c8) {
        return c8 >= 'A' && c8 <= 'Z';
    }

    public static boolean e(CharSequence charSequence, CharSequence charSequence2) {
        int f8;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = charSequence.charAt(i7);
            char charAt2 = charSequence2.charAt(i7);
            if (charAt != charAt2 && ((f8 = f(charAt)) >= 26 || f8 != f(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int f(char c8) {
        return (char) ((c8 | ' ') - 97);
    }
}
