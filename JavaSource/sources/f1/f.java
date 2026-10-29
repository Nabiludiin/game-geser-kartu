package f1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import h1.l;
import java.util.Iterator;
import java.util.List;
import m1.p;
import m1.q;

/* compiled from: MyApplication */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f23590a = e1.j.f("Schedulers");

    static e a(Context context, j jVar) {
        l lVar = new l(context, jVar);
        n1.g.a(context, SystemJobService.class, true);
        e1.j.c().a(f23590a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        return lVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q B = workDatabase.B();
        workDatabase.c();
        try {
            List f8 = B.f(aVar.h());
            List t7 = B.t(200);
            if (f8 != null && f8.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = f8.iterator();
                while (it.hasNext()) {
                    B.b(((p) it.next()).f24709a, currentTimeMillis);
                }
            }
            workDatabase.r();
            workDatabase.g();
            if (f8 != null && f8.size() > 0) {
                p[] pVarArr = (p[]) f8.toArray(new p[f8.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (eVar.a()) {
                        eVar.e(pVarArr);
                    }
                }
            }
            if (t7 == null || t7.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) t7.toArray(new p[t7.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (!eVar2.a()) {
                    eVar2.e(pVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
