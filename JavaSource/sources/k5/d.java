package k5;

import i5.f;
import i5.g;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: MyApplication */
public final class d implements j5.b {

    /* renamed from: e, reason: collision with root package name */
    private static final i5.d f24531e = new i5.d() { // from class: k5.a
        @Override // i5.d
        public final void a(Object obj, Object obj2) {
            d.c(obj, (i5.e) obj2);
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private static final f f24532f = new f() { // from class: k5.b
        @Override // i5.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).b((String) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final f f24533g = new f() { // from class: k5.c
        @Override // i5.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).c(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final b f24534h = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Map f24535a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f24536b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private i5.d f24537c = f24531e;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24538d = false;

    /* compiled from: MyApplication */
    class a implements i5.a {
        a() {
        }

        @Override // i5.a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f24535a, d.this.f24536b, d.this.f24537c, d.this.f24538d);
            eVar.f(obj, false);
            eVar.m();
        }
    }

    /* compiled from: MyApplication */
    private static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        private static final DateFormat f24540a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f24540a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // i5.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.b(f24540a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f24532f);
        m(Boolean.class, f24533g);
        m(Date.class, f24534h);
    }

    public static /* synthetic */ void c(Object obj, i5.e eVar) {
        throw new i5.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public i5.a i() {
        return new a();
    }

    public d j(j5.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z7) {
        this.f24538d = z7;
        return this;
    }

    @Override // j5.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public d a(Class cls, i5.d dVar) {
        this.f24535a.put(cls, dVar);
        this.f24536b.remove(cls);
        return this;
    }

    public d m(Class cls, f fVar) {
        this.f24536b.put(cls, fVar);
        this.f24535a.remove(cls);
        return this;
    }
}
