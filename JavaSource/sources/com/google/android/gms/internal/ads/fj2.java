package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* compiled from: MyApplication */
public final class fj2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8282a;

    /* renamed from: b, reason: collision with root package name */
    public final s2.g5 f8283b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8284c;

    public fj2(Context context, s2.g5 g5Var, List list) {
        this.f8282a = context;
        this.f8283b = g5Var;
        this.f8284c = list;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        ComponentName componentName2;
        x81 x81Var = (x81) obj;
        if (((Boolean) z00.f19933a.e()).booleanValue()) {
            Bundle bundle = new Bundle();
            r2.t.g();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f8282a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null) {
                    componentName = runningTaskInfo.topActivity;
                    if (componentName != null) {
                        componentName2 = runningTaskInfo.topActivity;
                        str = componentName2.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", str);
            Bundle bundle2 = new Bundle();
            s2.g5 g5Var = this.f8283b;
            bundle2.putInt("width", g5Var.f26099u);
            bundle2.putInt("height", g5Var.f26096r);
            bundle.putBundle("size", bundle2);
            List list = this.f8284c;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            x81Var.f18664a.putBundle("view_hierarchy", bundle);
        }
    }
}
