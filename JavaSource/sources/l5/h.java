package l5;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import l5.h;

/* compiled from: MyApplication */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final Map f24652a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f24653b;

    /* renamed from: c, reason: collision with root package name */
    private final i5.d f24654c;

    /* compiled from: MyApplication */
    public static final class a implements j5.b {

        /* renamed from: d, reason: collision with root package name */
        private static final i5.d f24655d = new i5.d() { // from class: l5.g
            @Override // i5.d
            public final void a(Object obj, Object obj2) {
                h.a.b(obj, (i5.e) obj2);
            }
        };

        /* renamed from: a, reason: collision with root package name */
        private final Map f24656a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private final Map f24657b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private i5.d f24658c = f24655d;

        public static /* synthetic */ void b(Object obj, i5.e eVar) {
            throw new i5.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f24656a), new HashMap(this.f24657b), this.f24658c);
        }

        public a d(j5.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // j5.b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a a(Class cls, i5.d dVar) {
            this.f24656a.put(cls, dVar);
            this.f24657b.remove(cls);
            return this;
        }
    }

    h(Map map, Map map2, i5.d dVar) {
        this.f24652a = map;
        this.f24653b = map2;
        this.f24654c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f24652a, this.f24653b, this.f24654c).p(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
