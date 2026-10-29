package z5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import w5.n;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class c extends p {

    /* renamed from: d, reason: collision with root package name */
    public static final q f27914d = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f27915a = DateFormat.getDateTimeInstance(2, 2, Locale.US);

    /* renamed from: b, reason: collision with root package name */
    private final DateFormat f27916b = DateFormat.getDateTimeInstance(2, 2);

    /* renamed from: c, reason: collision with root package name */
    private final DateFormat f27917c = d();

    /* compiled from: MyApplication */
    static class a implements q {
        a() {
        }

        @Override // w5.q
        public p a(w5.d dVar, a6.a aVar) {
            if (aVar.c() == Date.class) {
                return new c();
            }
            return null;
        }
    }

    private static DateFormat d() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    private synchronized Date e(String str) {
        try {
            try {
                try {
                } catch (ParseException unused) {
                    return this.f27917c.parse(str);
                }
            } catch (ParseException e8) {
                throw new n(str, e8);
            }
        } catch (ParseException unused2) {
            return this.f27915a.parse(str);
        }
        return this.f27916b.parse(str);
    }

    @Override // w5.p
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date a(b6.a aVar) {
        if (aVar.R() != b6.b.NULL) {
            return e(aVar.O());
        }
        aVar.L();
        return null;
    }

    @Override // w5.p
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void c(b6.c cVar, Date date) {
        if (date == null) {
            cVar.q();
        } else {
            cVar.L(this.f27915a.format(date));
        }
    }
}
