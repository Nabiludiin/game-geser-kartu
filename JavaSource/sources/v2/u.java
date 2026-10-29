package v2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.b12;
import com.google.android.gms.internal.ads.cm0;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.x02;
import com.google.android.gms.internal.ads.z64;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26852a;

    /* renamed from: b, reason: collision with root package name */
    private final b12 f26853b;

    /* renamed from: c, reason: collision with root package name */
    private String f26854c;

    /* renamed from: d, reason: collision with root package name */
    private String f26855d;

    /* renamed from: e, reason: collision with root package name */
    private String f26856e;

    /* renamed from: f, reason: collision with root package name */
    private String f26857f;

    /* renamed from: g, reason: collision with root package name */
    private int f26858g;

    /* renamed from: h, reason: collision with root package name */
    private int f26859h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f26860i;

    /* renamed from: j, reason: collision with root package name */
    private PointF f26861j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f26862k;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f26863l;

    public u(Context context) {
        this.f26858g = 0;
        this.f26863l = new Runnable() { // from class: v2.t
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                u.this.g();
            }
        };
        this.f26852a = context;
        this.f26859h = ViewConfiguration.get(context).getScaledTouchSlop();
        r2.t.w().a();
        this.f26862k = r2.t.w().b();
        this.f26853b = r2.t.s().b();
    }

    private final boolean s(float f8, float f9, float f10, float f11) {
        return Math.abs(this.f26860i.x - f8) < ((float) this.f26859h) && Math.abs(this.f26860i.y - f9) < ((float) this.f26859h) && Math.abs(this.f26861j.x - f10) < ((float) this.f26859h) && Math.abs(this.f26861j.y - f11) < ((float) this.f26859h);
    }

    private final void t(Context context) {
        ArrayList arrayList = new ArrayList();
        int u7 = u(arrayList, "None", true);
        final int u8 = u(arrayList, "Shake", true);
        final int u9 = u(arrayList, "Flick", true);
        int ordinal = this.f26853b.g().ordinal();
        final int i7 = ordinal != 1 ? ordinal != 2 ? u7 : u9 : u8;
        r2.t.g();
        AlertDialog.Builder o7 = f2.o(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i7);
        o7.setTitle("Setup gesture");
        o7.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i7, new DialogInterface.OnClickListener() { // from class: v2.k
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i8) {
                atomicInteger.set(i8);
            }
        });
        o7.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: v2.l
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i8) {
                u.this.b();
            }
        });
        o7.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: v2.m
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i8) {
                u.this.i(atomicInteger, i7, u8, u9, dialogInterface, i8);
            }
        });
        o7.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: v2.n
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                u.this.b();
            }
        });
        o7.create().show();
    }

    private static final int u(List list, String str, boolean z7) {
        if (!z7) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f26858g = 0;
            this.f26860i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i7 = this.f26858g;
        if (i7 == -1) {
            return;
        }
        if (i7 == 0) {
            if (actionMasked == 5) {
                this.f26858g = 5;
                this.f26861j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f26862k.postDelayed(this.f26863l, ((Long) s2.b0.c().d(uy.f17235w5)).longValue());
                return;
            }
            return;
        }
        if (i7 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z7 = false;
                for (int i8 = 0; i8 < historySize; i8++) {
                    z7 |= !s(motionEvent.getHistoricalX(0, i8), motionEvent.getHistoricalY(0, i8), motionEvent.getHistoricalX(1, i8), motionEvent.getHistoricalY(1, i8));
                }
                if (s(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z7) {
                    return;
                }
            }
            this.f26858g = -1;
            this.f26862k.removeCallbacks(this.f26863l);
        }
    }

    public final void b() {
        try {
            Context context = this.f26852a;
            if (!(context instanceof Activity)) {
                int i7 = n1.f26802b;
                w2.p.e("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(r2.t.s().i())) {
                str = "Creative preview";
            }
            String str2 = true != r2.t.s().m() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int u7 = u(arrayList, "Ad information", true);
            final int u8 = u(arrayList, str, true);
            final int u9 = u(arrayList, str2, true);
            boolean booleanValue = ((Boolean) s2.b0.c().d(uy.ja)).booleanValue();
            final int u10 = u(arrayList, "Open ad inspector", booleanValue);
            final int u11 = u(arrayList, "Ad inspector settings", booleanValue);
            r2.t.g();
            AlertDialog.Builder o7 = f2.o(context);
            o7.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: v2.e
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i8) {
                    u.this.h(u7, u8, u9, u10, u11, dialogInterface, i8);
                }
            });
            o7.create().show();
        } catch (WindowManager.BadTokenException e8) {
            n1.l("", e8);
        }
    }

    public final void c(String str) {
        this.f26855d = str;
    }

    public final void d(String str) {
        this.f26856e = str;
    }

    public final void e(String str) {
        this.f26854c = str;
    }

    public final void f(String str) {
        this.f26857f = str;
    }

    final /* synthetic */ void g() {
        this.f26858g = 4;
        b();
    }

    final /* synthetic */ void h(int i7, int i8, int i9, int i10, int i11, DialogInterface dialogInterface, int i12) {
        if (i12 != i7) {
            if (i12 == i8) {
                int i13 = n1.f26802b;
                w2.p.a("Debug mode [Creative Preview] selected.");
                cm0.f6500a.execute(new Runnable() { // from class: v2.g
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        u.this.o();
                    }
                });
                return;
            }
            if (i12 == i9) {
                int i14 = n1.f26802b;
                w2.p.a("Debug mode [Troubleshooting] selected.");
                cm0.f6500a.execute(new Runnable() { // from class: v2.h
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        u.this.p();
                    }
                });
                return;
            }
            if (i12 == i10) {
                b12 b12Var = this.f26853b;
                final z64 z64Var = cm0.f6505f;
                z64 z64Var2 = cm0.f6500a;
                if (b12Var.t()) {
                    z64Var.execute(new Runnable() { // from class: v2.r
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            u.this.l();
                        }
                    });
                    return;
                } else {
                    z64Var2.execute(new Runnable() { // from class: v2.q
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            u.this.k(z64Var);
                        }
                    });
                    return;
                }
            }
            if (i12 == i11) {
                b12 b12Var2 = this.f26853b;
                final z64 z64Var3 = cm0.f6505f;
                z64 z64Var4 = cm0.f6500a;
                if (b12Var2.t()) {
                    z64Var3.execute(new Runnable() { // from class: v2.f
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            u.this.n();
                        }
                    });
                    return;
                } else {
                    z64Var4.execute(new Runnable() { // from class: v2.s
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            u.this.m(z64Var3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        Context context = this.f26852a;
        if (!(context instanceof Activity)) {
            int i15 = n1.f26802b;
            w2.p.e("Can not create dialog without Activity Context");
            return;
        }
        String str = this.f26854c;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            r2.t.g();
            Map u7 = f2.u(build);
            for (String str3 : u7.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) u7.get(str3));
                sb.append("\n\n");
            }
            String trim = sb.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        r2.t.g();
        AlertDialog.Builder o7 = f2.o(context);
        o7.setMessage(str2);
        o7.setTitle("Ad Information");
        o7.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: v2.o
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface2, int i16) {
                u.this.j(str2, dialogInterface2, i16);
            }
        });
        o7.setNegativeButton("Close", p.f26805q);
        o7.create().show();
    }

    final /* synthetic */ void i(AtomicInteger atomicInteger, int i7, int i8, int i9, DialogInterface dialogInterface, int i10) {
        if (atomicInteger.get() != i7) {
            if (atomicInteger.get() == i8) {
                this.f26853b.f(x02.SHAKE);
            } else if (atomicInteger.get() == i9) {
                this.f26853b.f(x02.FLICK);
            } else {
                this.f26853b.f(x02.NONE);
            }
        }
        b();
    }

    final /* synthetic */ void j(String str, DialogInterface dialogInterface, int i7) {
        r2.t.g();
        f2.z(this.f26852a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    final /* synthetic */ void k(z64 z64Var) {
        y s7 = r2.t.s();
        Context context = this.f26852a;
        if (s7.e(context, this.f26855d, this.f26856e)) {
            z64Var.execute(new Runnable() { // from class: v2.j
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    u.this.r();
                }
            });
        } else {
            r2.t.s().f(context, this.f26855d, this.f26856e);
        }
    }

    final /* synthetic */ void l() {
        r2.t.s().c(this.f26852a);
    }

    final /* synthetic */ void m(z64 z64Var) {
        y s7 = r2.t.s();
        Context context = this.f26852a;
        if (s7.e(context, this.f26855d, this.f26856e)) {
            z64Var.execute(new Runnable() { // from class: v2.i
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    u.this.q();
                }
            });
        } else {
            r2.t.s().f(context, this.f26855d, this.f26856e);
        }
    }

    final /* synthetic */ void n() {
        t(this.f26852a);
    }

    final /* synthetic */ void o() {
        y s7 = r2.t.s();
        Context context = this.f26852a;
        String str = this.f26855d;
        String str2 = this.f26856e;
        if (!s7.d(context, str, str2)) {
            s7.n(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(s7.f26891f)) {
            int i7 = n1.f26802b;
            w2.p.a("Creative is not pushed for this device.");
            s7.n(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(s7.f26891f)) {
            int i8 = n1.f26802b;
            w2.p.a("The app is not linked for creative preview.");
            s7.f(context, str, str2);
        } else if ("0".equals(s7.f26891f)) {
            int i9 = n1.f26802b;
            w2.p.a("Device is linked for in app preview.");
            s7.n(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    final /* synthetic */ void p() {
        y s7 = r2.t.s();
        String str = this.f26855d;
        String str2 = this.f26856e;
        String str3 = this.f26857f;
        boolean m7 = s7.m();
        Context context = this.f26852a;
        s7.l(s7.e(context, str, str2));
        if (!s7.m()) {
            s7.f(context, str, str2);
            return;
        }
        if (!m7 && !TextUtils.isEmpty(str3)) {
            s7.h(context, str2, str3, str);
        }
        int i7 = n1.f26802b;
        w2.p.a("Device is linked for debug signals.");
        s7.n(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    final /* synthetic */ void q() {
        t(this.f26852a);
    }

    final /* synthetic */ void r() {
        r2.t.s().c(this.f26852a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f26854c);
        sb.append(",DebugSignal: ");
        sb.append(this.f26857f);
        sb.append(",AFMA Version: ");
        sb.append(this.f26856e);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f26855d);
        sb.append("}");
        return sb.toString();
    }

    public u(Context context, String str) {
        this(context);
        this.f26854c = str;
    }
}
