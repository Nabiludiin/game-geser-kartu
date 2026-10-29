package z5;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import w5.n;
import w5.p;
import w5.q;

/* compiled from: MyApplication */
public final class j extends p {

    /* renamed from: b, reason: collision with root package name */
    public static final q f27944b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final DateFormat f27945a = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: MyApplication */
    static class a implements q {
        a() {
        }

        @Override // w5.q
        public p a(w5.d dVar, a6.a aVar) {
            if (aVar.c() == Time.class) {
                return new j();
            }
            return null;
        }
    }

    @Override // w5.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public synchronized Time a(b6.a aVar) {
        if (aVar.R() == b6.b.NULL) {
            aVar.L();
            return null;
        }
        try {
            return new Time(this.f27945a.parse(aVar.O()).getTime());
        } catch (ParseException e8) {
            throw new n(e8);
        }
    }

    @Override // w5.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized void c(b6.c cVar, Time time) {
        cVar.L(time == null ? null : this.f27945a.format((Date) time));
    }
}
