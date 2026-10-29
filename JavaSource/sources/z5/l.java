package z5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;

/* compiled from: MyApplication */
public abstract class l {
    public static final w5.p A;
    public static final w5.q B;
    public static final w5.p C;
    public static final w5.q D;
    public static final w5.p E;
    public static final w5.q F;
    public static final w5.p G;
    public static final w5.q H;
    public static final w5.p I;
    public static final w5.q J;
    public static final w5.q K;
    public static final w5.p L;
    public static final w5.q M;
    public static final w5.p N;
    public static final w5.q O;
    public static final w5.p P;
    public static final w5.q Q;
    public static final w5.q R;

    /* renamed from: a, reason: collision with root package name */
    public static final w5.p f27949a;

    /* renamed from: b, reason: collision with root package name */
    public static final w5.q f27950b;

    /* renamed from: c, reason: collision with root package name */
    public static final w5.p f27951c;

    /* renamed from: d, reason: collision with root package name */
    public static final w5.q f27952d;

    /* renamed from: e, reason: collision with root package name */
    public static final w5.p f27953e;

    /* renamed from: f, reason: collision with root package name */
    public static final w5.p f27954f;

    /* renamed from: g, reason: collision with root package name */
    public static final w5.q f27955g;

    /* renamed from: h, reason: collision with root package name */
    public static final w5.p f27956h;

    /* renamed from: i, reason: collision with root package name */
    public static final w5.q f27957i;

    /* renamed from: j, reason: collision with root package name */
    public static final w5.p f27958j;

    /* renamed from: k, reason: collision with root package name */
    public static final w5.q f27959k;

    /* renamed from: l, reason: collision with root package name */
    public static final w5.p f27960l;

    /* renamed from: m, reason: collision with root package name */
    public static final w5.q f27961m;

    /* renamed from: n, reason: collision with root package name */
    public static final w5.p f27962n;

    /* renamed from: o, reason: collision with root package name */
    public static final w5.p f27963o;

    /* renamed from: p, reason: collision with root package name */
    public static final w5.p f27964p;

    /* renamed from: q, reason: collision with root package name */
    public static final w5.p f27965q;

    /* renamed from: r, reason: collision with root package name */
    public static final w5.q f27966r;

    /* renamed from: s, reason: collision with root package name */
    public static final w5.p f27967s;

    /* renamed from: t, reason: collision with root package name */
    public static final w5.q f27968t;

    /* renamed from: u, reason: collision with root package name */
    public static final w5.p f27969u;

    /* renamed from: v, reason: collision with root package name */
    public static final w5.p f27970v;

    /* renamed from: w, reason: collision with root package name */
    public static final w5.p f27971w;

    /* renamed from: x, reason: collision with root package name */
    public static final w5.q f27972x;

    /* renamed from: y, reason: collision with root package name */
    public static final w5.p f27973y;

    /* renamed from: z, reason: collision with root package name */
    public static final w5.q f27974z;

    /* compiled from: MyApplication */
    static class a extends w5.p {
        a() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Number a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return Double.valueOf(aVar.B());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    static class a0 extends w5.p {
        a0() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Number a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.F());
            } catch (NumberFormatException e8) {
                throw new w5.n(e8);
            }
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    static class b extends w5.p {
        b() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Number a(b6.a aVar) {
            b6.b R = aVar.R();
            int i7 = x.f27989a[R.ordinal()];
            if (i7 == 1) {
                return new y5.f(aVar.O());
            }
            if (i7 == 4) {
                aVar.L();
                return null;
            }
            throw new w5.n("Expecting number, got: " + R);
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    static class b0 extends w5.p {
        b0() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Number a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.F());
            } catch (NumberFormatException e8) {
                throw new w5.n(e8);
            }
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    static class c extends w5.p {
        c() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Character a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            String O = aVar.O();
            if (O.length() == 1) {
                return Character.valueOf(O.charAt(0));
            }
            throw new w5.n("Expecting character, got: " + O);
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Character ch) {
            cVar.L(ch == null ? null : String.valueOf(ch));
        }
    }

    /* compiled from: MyApplication */
    static class c0 extends w5.p {
        c0() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Number a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return Integer.valueOf(aVar.F());
            } catch (NumberFormatException e8) {
                throw new w5.n(e8);
            }
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    static class d extends w5.p {
        d() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String a(b6.a aVar) {
            b6.b R = aVar.R();
            if (R != b6.b.NULL) {
                return R == b6.b.BOOLEAN ? Boolean.toString(aVar.z()) : aVar.O();
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, String str) {
            cVar.L(str);
        }
    }

    /* compiled from: MyApplication */
    static class d0 extends w5.p {
        d0() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Number a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return Long.valueOf(aVar.G());
            } catch (NumberFormatException e8) {
                throw new w5.n(e8);
            }
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    static class e extends w5.p {
        e() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public BigDecimal a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return new BigDecimal(aVar.O());
            } catch (NumberFormatException e8) {
                throw new w5.n(e8);
            }
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, BigDecimal bigDecimal) {
            cVar.I(bigDecimal);
        }
    }

    /* compiled from: MyApplication */
    static class e0 extends w5.p {
        e0() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Number a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return Float.valueOf((float) aVar.B());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Number number) {
            cVar.I(number);
        }
    }

    /* compiled from: MyApplication */
    static class f extends w5.p {
        f() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public BigInteger a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                return new BigInteger(aVar.O());
            } catch (NumberFormatException e8) {
                throw new w5.n(e8);
            }
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, BigInteger bigInteger) {
            cVar.I(bigInteger);
        }
    }

    /* compiled from: MyApplication */
    private static final class f0 extends w5.p {

        /* renamed from: a, reason: collision with root package name */
        private final Map f27975a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f27976b = new HashMap();

        public f0(Class cls) {
            try {
                for (Enum r42 : (Enum[]) cls.getEnumConstants()) {
                    String name = r42.name();
                    x5.c cVar = (x5.c) cls.getField(name).getAnnotation(x5.c.class);
                    if (cVar != null) {
                        name = cVar.value();
                        for (String str : cVar.alternate()) {
                            this.f27975a.put(str, r42);
                        }
                    }
                    this.f27975a.put(name, r42);
                    this.f27976b.put(r42, name);
                }
            } catch (NoSuchFieldException unused) {
                throw new AssertionError();
            }
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Enum a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return (Enum) this.f27975a.get(aVar.O());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Enum r32) {
            cVar.L(r32 == null ? null : (String) this.f27976b.get(r32));
        }
    }

    /* compiled from: MyApplication */
    static class g extends w5.p {
        g() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public StringBuilder a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return new StringBuilder(aVar.O());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, StringBuilder sb) {
            cVar.L(sb == null ? null : sb.toString());
        }
    }

    /* compiled from: MyApplication */
    static class h extends w5.p {
        h() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public StringBuffer a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return new StringBuffer(aVar.O());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, StringBuffer stringBuffer) {
            cVar.L(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* compiled from: MyApplication */
    static class i extends w5.p {
        i() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public URL a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            String O = aVar.O();
            if ("null".equals(O)) {
                return null;
            }
            return new URL(O);
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, URL url) {
            cVar.L(url == null ? null : url.toExternalForm());
        }
    }

    /* compiled from: MyApplication */
    static class j extends w5.p {
        j() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public URI a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            try {
                String O = aVar.O();
                if ("null".equals(O)) {
                    return null;
                }
                return new URI(O);
            } catch (URISyntaxException e8) {
                throw new w5.h(e8);
            }
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, URI uri) {
            cVar.L(uri == null ? null : uri.toASCIIString());
        }
    }

    /* compiled from: MyApplication */
    static class k extends w5.p {
        k() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Class a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Class cls) {
            if (cls == null) {
                cVar.q();
                return;
            }
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: z5.l$l, reason: collision with other inner class name */
    static class C0166l extends w5.p {
        C0166l() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public InetAddress a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return InetAddress.getByName(aVar.O());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, InetAddress inetAddress) {
            cVar.L(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* compiled from: MyApplication */
    static class m extends w5.p {
        m() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public UUID a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return UUID.fromString(aVar.O());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, UUID uuid) {
            cVar.L(uuid == null ? null : uuid.toString());
        }
    }

    /* compiled from: MyApplication */
    static class n implements w5.q {

        /* compiled from: MyApplication */
        class a extends w5.p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ w5.p f27977a;

            a(w5.p pVar) {
                this.f27977a = pVar;
            }

            @Override // w5.p
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Timestamp a(b6.a aVar) {
                Date date = (Date) this.f27977a.a(aVar);
                if (date != null) {
                    return new Timestamp(date.getTime());
                }
                return null;
            }

            @Override // w5.p
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public void c(b6.c cVar, Timestamp timestamp) {
                this.f27977a.c(cVar, timestamp);
            }
        }

        n() {
        }

        @Override // w5.q
        public w5.p a(w5.d dVar, a6.a aVar) {
            if (aVar.c() != Timestamp.class) {
                return null;
            }
            return new a(dVar.k(Date.class));
        }
    }

    /* compiled from: MyApplication */
    static class o extends w5.p {
        o() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Calendar a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            aVar.k();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (aVar.R() != b6.b.END_OBJECT) {
                String H = aVar.H();
                int F = aVar.F();
                if ("year".equals(H)) {
                    i7 = F;
                } else if ("month".equals(H)) {
                    i8 = F;
                } else if ("dayOfMonth".equals(H)) {
                    i9 = F;
                } else if ("hourOfDay".equals(H)) {
                    i10 = F;
                } else if ("minute".equals(H)) {
                    i11 = F;
                } else if ("second".equals(H)) {
                    i12 = F;
                }
            }
            aVar.p();
            return new GregorianCalendar(i7, i8, i9, i10, i11, i12);
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Calendar calendar) {
            if (calendar == null) {
                cVar.q();
                return;
            }
            cVar.g();
            cVar.o("year");
            cVar.H(calendar.get(1));
            cVar.o("month");
            cVar.H(calendar.get(2));
            cVar.o("dayOfMonth");
            cVar.H(calendar.get(5));
            cVar.o("hourOfDay");
            cVar.H(calendar.get(11));
            cVar.o("minute");
            cVar.H(calendar.get(12));
            cVar.o("second");
            cVar.H(calendar.get(13));
            cVar.k();
        }
    }

    /* compiled from: MyApplication */
    static class p extends w5.p {
        p() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Locale a(b6.a aVar) {
            if (aVar.R() == b6.b.NULL) {
                aVar.L();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(aVar.O(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Locale locale) {
            cVar.L(locale == null ? null : locale.toString());
        }
    }

    /* compiled from: MyApplication */
    static class q extends w5.p {
        q() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public w5.g a(b6.a aVar) {
            switch (x.f27989a[aVar.R().ordinal()]) {
                case 1:
                    return new w5.l(new y5.f(aVar.O()));
                case 2:
                    return new w5.l(Boolean.valueOf(aVar.z()));
                case 3:
                    return new w5.l(aVar.O());
                case 4:
                    aVar.L();
                    return w5.i.f27176q;
                case 5:
                    w5.e eVar = new w5.e();
                    aVar.j();
                    while (aVar.t()) {
                        eVar.l(a(aVar));
                    }
                    aVar.o();
                    return eVar;
                case 6:
                    w5.j jVar = new w5.j();
                    aVar.k();
                    while (aVar.t()) {
                        jVar.l(aVar.H(), a(aVar));
                    }
                    aVar.p();
                    return jVar;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, w5.g gVar) {
            if (gVar == null || gVar.i()) {
                cVar.q();
                return;
            }
            if (gVar.k()) {
                w5.l g8 = gVar.g();
                if (g8.r()) {
                    cVar.I(g8.n());
                    return;
                } else if (g8.p()) {
                    cVar.M(g8.l());
                    return;
                } else {
                    cVar.L(g8.o());
                    return;
                }
            }
            if (gVar.h()) {
                cVar.e();
                Iterator it = gVar.c().iterator();
                while (it.hasNext()) {
                    c(cVar, (w5.g) it.next());
                }
                cVar.j();
                return;
            }
            if (!gVar.j()) {
                throw new IllegalArgumentException("Couldn't write " + gVar.getClass());
            }
            cVar.g();
            for (Map.Entry entry : gVar.e().m()) {
                cVar.o((String) entry.getKey());
                c(cVar, (w5.g) entry.getValue());
            }
            cVar.k();
        }
    }

    /* compiled from: MyApplication */
    static class r implements w5.q {
        r() {
        }

        @Override // w5.q
        public w5.p a(w5.d dVar, a6.a aVar) {
            Class c8 = aVar.c();
            if (!Enum.class.isAssignableFrom(c8) || c8 == Enum.class) {
                return null;
            }
            if (!c8.isEnum()) {
                c8 = c8.getSuperclass();
            }
            return new f0(c8);
        }
    }

    /* compiled from: MyApplication */
    static class s implements w5.q {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Class f27979q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ w5.p f27980r;

        s(Class cls, w5.p pVar) {
            this.f27979q = cls;
            this.f27980r = pVar;
        }

        @Override // w5.q
        public w5.p a(w5.d dVar, a6.a aVar) {
            if (aVar.c() == this.f27979q) {
                return this.f27980r;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27979q.getName() + ",adapter=" + this.f27980r + "]";
        }
    }

    /* compiled from: MyApplication */
    static class t implements w5.q {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Class f27981q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Class f27982r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ w5.p f27983s;

        t(Class cls, Class cls2, w5.p pVar) {
            this.f27981q = cls;
            this.f27982r = cls2;
            this.f27983s = pVar;
        }

        @Override // w5.q
        public w5.p a(w5.d dVar, a6.a aVar) {
            Class c8 = aVar.c();
            if (c8 == this.f27981q || c8 == this.f27982r) {
                return this.f27983s;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27982r.getName() + "+" + this.f27981q.getName() + ",adapter=" + this.f27983s + "]";
        }
    }

    /* compiled from: MyApplication */
    static class u extends w5.p {
        u() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
        
            if (r8.F() != 0) goto L27;
         */
        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.util.BitSet a(b6.a r8) {
            /*
                r7 = this;
                b6.b r0 = r8.R()
                b6.b r1 = b6.b.NULL
                if (r0 != r1) goto Ld
                r8.L()
                r8 = 0
                return r8
            Ld:
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.j()
                b6.b r1 = r8.R()
                r2 = 0
                r3 = r2
            L1b:
                b6.b r4 = b6.b.END_ARRAY
                if (r1 == r4) goto L82
                int[] r4 = z5.l.x.f27989a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L70
                r6 = 2
                if (r4 == r6) goto L6b
                r6 = 3
                if (r4 != r6) goto L54
                java.lang.String r1 = r8.O()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L3d
                if (r1 == 0) goto L3b
                goto L76
            L3b:
                r5 = r2
                goto L76
            L3d:
                w5.n r8 = new w5.n
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L54:
                w5.n r8 = new w5.n
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L6b:
                boolean r5 = r8.z()
                goto L76
            L70:
                int r1 = r8.F()
                if (r1 == 0) goto L3b
            L76:
                if (r5 == 0) goto L7b
                r0.set(r3)
            L7b:
                int r3 = r3 + 1
                b6.b r1 = r8.R()
                goto L1b
            L82:
                r8.o()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: z5.l.u.a(b6.a):java.util.BitSet");
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, BitSet bitSet) {
            if (bitSet == null) {
                cVar.q();
                return;
            }
            cVar.e();
            for (int i7 = 0; i7 < bitSet.length(); i7++) {
                cVar.H(bitSet.get(i7) ? 1L : 0L);
            }
            cVar.j();
        }
    }

    /* compiled from: MyApplication */
    static class v implements w5.q {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Class f27984q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Class f27985r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ w5.p f27986s;

        v(Class cls, Class cls2, w5.p pVar) {
            this.f27984q = cls;
            this.f27985r = cls2;
            this.f27986s = pVar;
        }

        @Override // w5.q
        public w5.p a(w5.d dVar, a6.a aVar) {
            Class c8 = aVar.c();
            if (c8 == this.f27984q || c8 == this.f27985r) {
                return this.f27986s;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + this.f27984q.getName() + "+" + this.f27985r.getName() + ",adapter=" + this.f27986s + "]";
        }
    }

    /* compiled from: MyApplication */
    static class w implements w5.q {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Class f27987q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ w5.p f27988r;

        w(Class cls, w5.p pVar) {
            this.f27987q = cls;
            this.f27988r = pVar;
        }

        @Override // w5.q
        public w5.p a(w5.d dVar, a6.a aVar) {
            if (this.f27987q.isAssignableFrom(aVar.c())) {
                return this.f27988r;
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + this.f27987q.getName() + ",adapter=" + this.f27988r + "]";
        }
    }

    /* compiled from: MyApplication */
    static /* synthetic */ class x {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27989a;

        static {
            int[] iArr = new int[b6.b.values().length];
            f27989a = iArr;
            try {
                iArr[b6.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27989a[b6.b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27989a[b6.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27989a[b6.b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27989a[b6.b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27989a[b6.b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27989a[b6.b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27989a[b6.b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27989a[b6.b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27989a[b6.b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: MyApplication */
    static class y extends w5.p {
        y() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return aVar.R() == b6.b.STRING ? Boolean.valueOf(Boolean.parseBoolean(aVar.O())) : Boolean.valueOf(aVar.z());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Boolean bool) {
            if (bool == null) {
                cVar.q();
            } else {
                cVar.M(bool.booleanValue());
            }
        }
    }

    /* compiled from: MyApplication */
    static class z extends w5.p {
        z() {
        }

        @Override // w5.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a(b6.a aVar) {
            if (aVar.R() != b6.b.NULL) {
                return Boolean.valueOf(aVar.O());
            }
            aVar.L();
            return null;
        }

        @Override // w5.p
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(b6.c cVar, Boolean bool) {
            cVar.L(bool == null ? "null" : bool.toString());
        }
    }

    static {
        k kVar = new k();
        f27949a = kVar;
        f27950b = b(Class.class, kVar);
        u uVar = new u();
        f27951c = uVar;
        f27952d = b(BitSet.class, uVar);
        y yVar = new y();
        f27953e = yVar;
        f27954f = new z();
        f27955g = a(Boolean.TYPE, Boolean.class, yVar);
        a0 a0Var = new a0();
        f27956h = a0Var;
        f27957i = a(Byte.TYPE, Byte.class, a0Var);
        b0 b0Var = new b0();
        f27958j = b0Var;
        f27959k = a(Short.TYPE, Short.class, b0Var);
        c0 c0Var = new c0();
        f27960l = c0Var;
        f27961m = a(Integer.TYPE, Integer.class, c0Var);
        f27962n = new d0();
        f27963o = new e0();
        f27964p = new a();
        b bVar = new b();
        f27965q = bVar;
        f27966r = b(Number.class, bVar);
        c cVar = new c();
        f27967s = cVar;
        f27968t = a(Character.TYPE, Character.class, cVar);
        d dVar = new d();
        f27969u = dVar;
        f27970v = new e();
        f27971w = new f();
        f27972x = b(String.class, dVar);
        g gVar = new g();
        f27973y = gVar;
        f27974z = b(StringBuilder.class, gVar);
        h hVar = new h();
        A = hVar;
        B = b(StringBuffer.class, hVar);
        i iVar = new i();
        C = iVar;
        D = b(URL.class, iVar);
        j jVar = new j();
        E = jVar;
        F = b(URI.class, jVar);
        C0166l c0166l = new C0166l();
        G = c0166l;
        H = d(InetAddress.class, c0166l);
        m mVar = new m();
        I = mVar;
        J = b(UUID.class, mVar);
        K = new n();
        o oVar = new o();
        L = oVar;
        M = c(Calendar.class, GregorianCalendar.class, oVar);
        p pVar = new p();
        N = pVar;
        O = b(Locale.class, pVar);
        q qVar = new q();
        P = qVar;
        Q = d(w5.g.class, qVar);
        R = new r();
    }

    public static w5.q a(Class cls, Class cls2, w5.p pVar) {
        return new t(cls, cls2, pVar);
    }

    public static w5.q b(Class cls, w5.p pVar) {
        return new s(cls, pVar);
    }

    public static w5.q c(Class cls, Class cls2, w5.p pVar) {
        return new v(cls, cls2, pVar);
    }

    public static w5.q d(Class cls, w5.p pVar) {
        return new w(cls, pVar);
    }
}
