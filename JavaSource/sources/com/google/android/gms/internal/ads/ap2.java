package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class ap2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f5194a;

    /* renamed from: b, reason: collision with root package name */
    private final ViewGroup f5195b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f5196c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f5197d;

    public ap2(z64 z64Var, ViewGroup viewGroup, Context context, Set set) {
        this.f5194a = z64Var;
        this.f5197d = set;
        this.f5195b = viewGroup;
        this.f5196c = context;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return this.f5194a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.zo2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return ap2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 22;
    }

    final /* synthetic */ bp2 c() {
        if (((Boolean) s2.b0.c().d(uy.f17236w6)).booleanValue() && this.f5195b != null && this.f5197d.contains("banner")) {
            return new bp2(Boolean.valueOf(this.f5195b.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) s2.b0.c().d(uy.f17244x6)).booleanValue() && this.f5197d.contains("native")) {
            Context context = this.f5196c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        bool = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new bp2(bool);
            }
        }
        return new bp2(null);
    }
}
