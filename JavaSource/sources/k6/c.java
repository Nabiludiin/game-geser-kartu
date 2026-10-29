package k6;

/* compiled from: MyApplication */
public abstract class c {
    private static final int a(int i7, int i8, int i9) {
        return c(c(i7, i9) - c(i8, i9), i9);
    }

    public static final int b(int i7, int i8, int i9) {
        if (i9 > 0) {
            if (i7 < i8) {
                return i8 - a(i8, i7, i9);
            }
        } else {
            if (i9 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i7 > i8) {
                return i8 + a(i7, i8, -i9);
            }
        }
        return i8;
    }

    private static final int c(int i7, int i8) {
        int i9 = i7 % i8;
        return i9 >= 0 ? i9 : i9 + i8;
    }
}
