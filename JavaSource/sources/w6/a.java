package w6;

/* compiled from: MyApplication */
abstract class a {
    public static final int a(int i7) {
        if (2 <= i7 && i7 < 37) {
            return i7;
        }
        throw new IllegalArgumentException("radix " + i7 + " was not in valid range " + new t6.c(2, 36));
    }

    public static final int b(char c8, int i7) {
        return Character.digit((int) c8, i7);
    }

    public static final boolean c(char c8) {
        return Character.isWhitespace(c8) || Character.isSpaceChar(c8);
    }
}
