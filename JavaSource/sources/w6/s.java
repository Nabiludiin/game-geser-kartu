package w6;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyApplication */
public abstract class s extends r {
    public static final String I(String str, int i7) {
        q6.i.e(str, "<this>");
        if (i7 >= 0) {
            String substring = str.substring(t6.d.b(i7, str.length()));
            q6.i.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i7 + " is less than zero.").toString());
    }

    public static char J(CharSequence charSequence) {
        q6.i.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(q.n(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
