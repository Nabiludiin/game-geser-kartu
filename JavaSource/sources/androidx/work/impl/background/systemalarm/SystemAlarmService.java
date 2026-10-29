package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.m;
import androidx.work.impl.background.systemalarm.e;
import e1.j;
import n1.n;

/* compiled from: MyApplication */
public class SystemAlarmService extends m implements e.c {

    /* renamed from: t, reason: collision with root package name */
    private static final String f3021t = j.f("SystemAlarmService");

    /* renamed from: r, reason: collision with root package name */
    private e f3022r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f3023s;

    private void f() {
        e eVar = new e(this);
        this.f3022r = eVar;
        eVar.m(this);
    }

    @Override // androidx.work.impl.background.systemalarm.e.c
    public void a() {
        this.f3023s = true;
        j.c().a(f3021t, "All commands completed in dispatcher", new Throwable[0]);
        n.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.f3023s = false;
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f3023s = true;
        this.f3022r.j();
    }

    @Override // androidx.lifecycle.m, android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        super.onStartCommand(intent, i7, i8);
        if (this.f3023s) {
            j.c().d(f3021t, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f3022r.j();
            f();
            this.f3023s = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f3022r.a(intent, i8);
        return 3;
    }
}
