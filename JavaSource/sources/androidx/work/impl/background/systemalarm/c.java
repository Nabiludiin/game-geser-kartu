package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.e;
import e1.j;
import java.util.ArrayList;
import java.util.List;
import m1.p;

/* compiled from: MyApplication */
class c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f3029e = j.f("ConstraintsCmdHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f3030a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3031b;

    /* renamed from: c, reason: collision with root package name */
    private final e f3032c;

    /* renamed from: d, reason: collision with root package name */
    private final i1.d f3033d;

    c(Context context, int i7, e eVar) {
        this.f3030a = context;
        this.f3031b = i7;
        this.f3032c = eVar;
        this.f3033d = new i1.d(context, eVar.f(), null);
    }

    void a() {
        List<p> g8 = this.f3032c.g().o().B().g();
        ConstraintProxy.a(this.f3030a, g8);
        this.f3033d.d(g8);
        ArrayList arrayList = new ArrayList(g8.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (p pVar : g8) {
            String str = pVar.f24709a;
            if (currentTimeMillis >= pVar.a() && (!pVar.b() || this.f3033d.c(str))) {
                arrayList.add(pVar);
            }
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String str2 = ((p) obj).f24709a;
            Intent b8 = b.b(this.f3030a, str2);
            j.c().a(f3029e, String.format("Creating a delay_met command for workSpec with id (%s)", str2), new Throwable[0]);
            e eVar = this.f3032c;
            eVar.k(new e.b(eVar, b8, this.f3031b));
        }
        this.f3033d.e();
    }
}
