package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: MyApplication */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f1754b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final i f1755a;

    /* compiled from: MyApplication */
    static class a {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    private g(i iVar) {
        this.f1755a = iVar;
    }

    public static g a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? d(a.a(localeArr)) : new g(new h(localeArr));
    }

    static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static g d(LocaleList localeList) {
        return new g(new n(localeList));
    }

    public Locale c(int i7) {
        return this.f1755a.get(i7);
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && this.f1755a.equals(((g) obj).f1755a);
    }

    public int hashCode() {
        return this.f1755a.hashCode();
    }

    public String toString() {
        return this.f1755a.toString();
    }
}
