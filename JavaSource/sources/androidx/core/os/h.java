package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: MyApplication */
final class h implements i {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f1756c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f1757d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f1758e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f1759f = g.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f1760a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1761b;

    h(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f1760a = f1756c;
            this.f1761b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < localeArr.length; i7++) {
            Locale locale = localeArr[i7];
            if (locale == null) {
                throw new NullPointerException("list[" + i7 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                b(sb, locale2);
                if (i7 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f1760a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f1761b = sb.toString();
    }

    static void b(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // androidx.core.os.i
    public Object a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        Locale[] localeArr = ((h) obj).f1760a;
        if (this.f1760a.length != localeArr.length) {
            return false;
        }
        int i7 = 0;
        while (true) {
            Locale[] localeArr2 = this.f1760a;
            if (i7 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i7].equals(localeArr[i7])) {
                return false;
            }
            i7++;
        }
    }

    @Override // androidx.core.os.i
    public Locale get(int i7) {
        if (i7 < 0) {
            return null;
        }
        Locale[] localeArr = this.f1760a;
        if (i7 < localeArr.length) {
            return localeArr[i7];
        }
        return null;
    }

    public int hashCode() {
        int i7 = 1;
        for (Locale locale : this.f1760a) {
            i7 = (i7 * 31) + locale.hashCode();
        }
        return i7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i7 = 0;
        while (true) {
            Locale[] localeArr = this.f1760a;
            if (i7 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i7]);
            if (i7 < this.f1760a.length - 1) {
                sb.append(',');
            }
            i7++;
        }
    }
}
