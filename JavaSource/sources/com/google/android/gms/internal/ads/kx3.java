package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: MyApplication */
public abstract class kx3 {
    static final CharSequence a(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public static final StringBuilder b(StringBuilder sb, Iterable iterable, String str) {
        c(sb, iterable.iterator(), str);
        return sb;
    }

    public static final StringBuilder c(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                sb.append(a(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    sb.append(a(it.next()));
                }
            }
            return sb;
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    public static final String d(Iterable iterable, String str) {
        Iterator it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        c(sb, it, str);
        return sb.toString();
    }
}
