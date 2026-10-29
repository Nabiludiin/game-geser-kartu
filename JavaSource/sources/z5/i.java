package z5;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import w5.n;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class i extends p {

    /* renamed from: b, reason: collision with root package name */
    public static final q f27942b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f27943a = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: MyApplication */
    static class a implements q {
        a() {
        }

        @Override // w5.q
        public p a(w5.d dVar, a6.a aVar) {
            if (aVar.c() == Date.class) {
                return new i();
            }
            return null;
        }
    }

    @Override // w5.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized Date a(b6.a aVar) {
        if (aVar.R() == b6.b.NULL) {
            aVar.L();
            return null;
        }
        try {
            return new Date(this.f27943a.parse(aVar.O()).getTime());
        } catch (ParseException e8) {
            throw new n(e8);
        }
    }

    @Override // w5.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized void c(b6.c cVar, Date date) {
        cVar.L(date == null ? null : this.f27943a.format((java.util.Date) date));
    }
}
