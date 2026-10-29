package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import e1.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m1.g;
import m1.h;
import m1.k;
import m1.p;
import m1.q;
import m1.t;

/* compiled from: MyApplication */
public class DiagnosticsWorker extends Worker {

    /* renamed from: w, reason: collision with root package name */
    private static final String f3134w = j.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f24709a, pVar.f24711c, num, pVar.f24710b.name(), str, str2);
    }

    private static String c(k kVar, t tVar, h hVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", "Job Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g b8 = hVar.b(pVar.f24709a);
            sb.append(a(pVar, TextUtils.join(",", kVar.b(pVar.f24709a)), b8 != null ? Integer.valueOf(b8.f24687b) : null, TextUtils.join(",", tVar.b(pVar.f24709a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase o7 = f1.j.k(getApplicationContext()).o();
        q B = o7.B();
        k z7 = o7.z();
        t C = o7.C();
        h y7 = o7.y();
        List e8 = B.e(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List i7 = B.i();
        List t7 = B.t(200);
        if (e8 != null && !e8.isEmpty()) {
            j c8 = j.c();
            String str = f3134w;
            c8.d(str, "Recently completed work:\n\n", new Throwable[0]);
            j.c().d(str, c(z7, C, y7, e8), new Throwable[0]);
        }
        if (i7 != null && !i7.isEmpty()) {
            j c9 = j.c();
            String str2 = f3134w;
            c9.d(str2, "Running work:\n\n", new Throwable[0]);
            j.c().d(str2, c(z7, C, y7, i7), new Throwable[0]);
        }
        if (t7 != null && !t7.isEmpty()) {
            j c10 = j.c();
            String str3 = f3134w;
            c10.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            j.c().d(str3, c(z7, C, y7, t7), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
