package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
final class yv3 {

    /* renamed from: c, reason: collision with root package name */
    private static final rw3 f19825c = new rw3("OverlayDisplayService");

    /* renamed from: d, reason: collision with root package name */
    private static final Intent f19826d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f19827e = 0;

    /* renamed from: a, reason: collision with root package name */
    final qw3 f19828a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19829b;

    yv3(Context context) {
        if (uw3.a(context)) {
            this.f19828a = new qw3(context.getApplicationContext(), f19825c, "OverlayDisplayService", f19826d, iv3.f10229a);
        } else {
            this.f19828a = null;
        }
        this.f19829b = context.getPackageName();
    }

    private static boolean h(String str) {
        return iy3.a(str).trim().isEmpty();
    }

    private static void i(String str, xv3 xv3Var) {
        if (h(str)) {
            return;
        }
        str.getClass();
        xv3Var.b(str.trim());
    }

    private static boolean j(dw3 dw3Var, String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!h((String) it.next())) {
                return true;
            }
        }
        f19825c.c(str, new Object[0]);
        bw3 d8 = cw3.d();
        d8.c(0);
        d8.a(8160);
        dw3Var.a(d8.d());
        return false;
    }

    final void a(final aw3 aw3Var, final dw3 dw3Var) {
        qw3 qw3Var = this.f19828a;
        if (qw3Var == null) {
            f19825c.c("error: %s", "Play Store not found.");
        } else if (j(dw3Var, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, aw3Var.b()))) {
            qw3Var.a(new Runnable() { // from class: com.google.android.gms.internal.ads.vv3
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    yv3.this.e(aw3Var, dw3Var);
                }
            });
        }
    }

    final void b(final ev3 ev3Var, final dw3 dw3Var) {
        qw3 qw3Var = this.f19828a;
        if (qw3Var == null) {
            f19825c.c("error: %s", "Play Store not found.");
        } else if (j(dw3Var, "Failed to apply OverlayDisplayDismissRequest: missing appId and sessionToken.", Arrays.asList(ev3Var.a(), ev3Var.b()))) {
            qw3Var.a(new Runnable() { // from class: com.google.android.gms.internal.ads.jv3
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    yv3.this.f(ev3Var, dw3Var);
                }
            });
        }
    }

    final void c(final fw3 fw3Var, final dw3 dw3Var, final int i7) {
        qw3 qw3Var = this.f19828a;
        if (qw3Var == null) {
            f19825c.c("error: %s", "Play Store not found.");
        } else if (j(dw3Var, "Failed to apply OverlayDisplayUpdateRequest: missing appId and sessionToken.", Arrays.asList(fw3Var.a(), fw3Var.b()))) {
            qw3Var.a(new Runnable() { // from class: com.google.android.gms.internal.ads.mv3
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    yv3.this.g(fw3Var, i7, dw3Var);
                }
            });
        }
    }

    final void d() {
        qw3 qw3Var = this.f19828a;
        if (qw3Var == null) {
            return;
        }
        f19825c.a("unbind LMD display overlay service", new Object[0]);
        qw3Var.b();
    }

    final /* synthetic */ void e(aw3 aw3Var, dw3 dw3Var) {
        try {
            qw3 qw3Var = this.f19828a;
            if (qw3Var == null) {
                throw null;
            }
            su3 su3Var = (su3) qw3Var.c();
            if (su3Var == null) {
                return;
            }
            String str = this.f19829b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putBinder("windowToken", aw3Var.a());
            i(aw3Var.j(), new xv3() { // from class: com.google.android.gms.internal.ads.nv3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i7 = yv3.f19827e;
                    bundle.putString("adFieldEnifd", str2);
                }
            });
            bundle.putInt("layoutGravity", aw3Var.c());
            bundle.putFloat("layoutVerticalMargin", aw3Var.d());
            bundle.putInt("displayMode", 0);
            bundle.putInt("triggerMode", 0);
            bundle.putInt("windowWidthPx", aw3Var.h());
            i(null, new xv3() { // from class: com.google.android.gms.internal.ads.ov3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i7 = yv3.f19827e;
                    bundle.putString("deeplinkUrl", str2);
                }
            });
            i(null, new xv3() { // from class: com.google.android.gms.internal.ads.pv3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i7 = yv3.f19827e;
                    bundle.putString("sessionToken", str2);
                }
            });
            i(aw3Var.b(), new xv3() { // from class: com.google.android.gms.internal.ads.qv3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i7 = yv3.f19827e;
                    bundle.putString("appId", str2);
                }
            });
            i(null, new xv3() { // from class: com.google.android.gms.internal.ads.rv3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i7 = yv3.f19827e;
                    bundle.putString("thirdPartyAuthCallerId", str2);
                }
            });
            bundle.putBoolean("stableSessionToken", true);
            su3Var.Y6(str, bundle, new wv3(this, dw3Var));
        } catch (RemoteException e8) {
            f19825c.d(e8, "show overlay display from: %s", this.f19829b);
        }
    }

    final /* synthetic */ void f(ev3 ev3Var, dw3 dw3Var) {
        try {
            qw3 qw3Var = this.f19828a;
            if (qw3Var == null) {
                throw null;
            }
            su3 su3Var = (su3) qw3Var.c();
            if (su3Var == null) {
                return;
            }
            String str = this.f19829b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            i(ev3Var.a(), new xv3() { // from class: com.google.android.gms.internal.ads.sv3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i7 = yv3.f19827e;
                    bundle.putString("sessionToken", str2);
                }
            });
            i(ev3Var.b(), new xv3() { // from class: com.google.android.gms.internal.ads.tv3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i7 = yv3.f19827e;
                    bundle.putString("appId", str2);
                }
            });
            su3Var.d3(bundle, new wv3(this, dw3Var));
        } catch (RemoteException e8) {
            f19825c.d(e8, "dismiss overlay display from: %s", this.f19829b);
        }
    }

    final /* synthetic */ void g(fw3 fw3Var, int i7, dw3 dw3Var) {
        try {
            qw3 qw3Var = this.f19828a;
            if (qw3Var == null) {
                throw null;
            }
            su3 su3Var = (su3) qw3Var.c();
            if (su3Var == null) {
                return;
            }
            String str = this.f19829b;
            final Bundle bundle = new Bundle();
            bundle.putString("callerPackage", str);
            bundle.putInt("displayMode", i7);
            i(fw3Var.a(), new xv3() { // from class: com.google.android.gms.internal.ads.uv3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i8 = yv3.f19827e;
                    bundle.putString("sessionToken", str2);
                }
            });
            i(fw3Var.b(), new xv3() { // from class: com.google.android.gms.internal.ads.lv3
                @Override // com.google.android.gms.internal.ads.xv3
                public final /* synthetic */ void b(String str2) {
                    int i8 = yv3.f19827e;
                    bundle.putString("appId", str2);
                }
            });
            su3Var.J3(bundle, new wv3(this, dw3Var));
        } catch (RemoteException e8) {
            f19825c.d(e8, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i7), this.f19829b);
        }
    }
}
