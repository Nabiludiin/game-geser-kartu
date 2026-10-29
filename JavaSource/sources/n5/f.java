package n5;

import android.content.Context;
import android.util.Base64OutputStream;
import f5.e0;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public class f implements i, j {

    /* renamed from: a, reason: collision with root package name */
    private final o5.b f25034a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f25035b;

    /* renamed from: c, reason: collision with root package name */
    private final o5.b f25036c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f25037d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f25038e;

    private f(final Context context, final String str, Set set, o5.b bVar, Executor executor) {
        this(new o5.b() { // from class: n5.c
            @Override // o5.b
            public final Object get() {
                return f.c(context, str);
            }
        }, set, executor, bVar, context);
    }

    public static /* synthetic */ String b(f fVar) {
        String byteArrayOutputStream;
        synchronized (fVar) {
            try {
                q qVar = (q) fVar.f25034a.get();
                List c8 = qVar.c();
                qVar.b();
                JSONArray jSONArray = new JSONArray();
                for (int i7 = 0; i7 < c8.size(); i7++) {
                    r rVar = (r) c8.get(i7);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", rVar.c());
                    jSONObject.put("dates", new JSONArray((Collection) rVar.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return byteArrayOutputStream;
    }

    public static /* synthetic */ q c(Context context, String str) {
        return new q(context, str);
    }

    public static /* synthetic */ f d(e0 e0Var, f5.e eVar) {
        return new f((Context) eVar.a(Context.class), ((c5.e) eVar.a(c5.e.class)).n(), eVar.g(g.class), eVar.d(u5.i.class), (Executor) eVar.b(e0Var));
    }

    public static /* synthetic */ Void e(f fVar) {
        synchronized (fVar) {
            ((q) fVar.f25034a.get()).g(System.currentTimeMillis(), ((u5.i) fVar.f25036c.get()).a());
        }
        return null;
    }

    public static f5.c f() {
        final e0 a8 = e0.a(e5.a.class, Executor.class);
        return f5.c.f(f.class, i.class, j.class).b(f5.r.i(Context.class)).b(f5.r.i(c5.e.class)).b(f5.r.k(g.class)).b(f5.r.j(u5.i.class)).b(f5.r.h(a8)).e(new f5.h() { // from class: n5.b
            @Override // f5.h
            public final Object a(f5.e eVar) {
                return f.d(e0.this, eVar);
            }
        }).c();
    }

    @Override // n5.i
    public w4.i a() {
        return !androidx.core.os.r.a(this.f25035b) ? w4.l.e("") : w4.l.c(this.f25038e, new Callable() { // from class: n5.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.b(f.this);
            }
        });
    }

    public w4.i g() {
        return this.f25037d.size() <= 0 ? w4.l.e(null) : !androidx.core.os.r.a(this.f25035b) ? w4.l.e(null) : w4.l.c(this.f25038e, new Callable() { // from class: n5.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return f.e(f.this);
            }
        });
    }

    f(o5.b bVar, Set set, Executor executor, o5.b bVar2, Context context) {
        this.f25034a = bVar;
        this.f25037d = set;
        this.f25038e = executor;
        this.f25036c = bVar2;
        this.f25035b = context;
    }
}
