package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2566a = new a(null);

    /* compiled from: MyApplication */
    public static final class a {

        /* compiled from: MyApplication */
        /* renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        static final class C0042a extends q6.j implements p6.l {

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ Context f2567r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0042a(Context context) {
                super(1);
                this.f2567r = context;
            }

            @Override // p6.l
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final d g(Context context) {
                q6.i.e(context, "it");
                return new d(this.f2567r);
            }
        }

        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        public final b a(Context context) {
            q6.i.e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            o0.a aVar = o0.a.f25040a;
            sb.append(aVar.a());
            Log.d("MeasurementManager", sb.toString());
            if (aVar.a() >= 5) {
                return new g(context);
            }
            if (aVar.b() >= 9) {
                return (b) o0.b.f25043a.a(context, "MeasurementManager", new C0042a(context));
            }
            return null;
        }

        private a() {
        }
    }

    public abstract Object a(androidx.privacysandbox.ads.adservices.measurement.a aVar, g6.e eVar);

    public abstract Object b(g6.e eVar);

    public abstract Object c(Uri uri, InputEvent inputEvent, g6.e eVar);

    public abstract Object d(m mVar, g6.e eVar);

    public abstract Object e(Uri uri, g6.e eVar);

    public abstract Object f(n nVar, g6.e eVar);

    public abstract Object g(o oVar, g6.e eVar);
}
