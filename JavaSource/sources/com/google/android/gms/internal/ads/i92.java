package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: MyApplication */
public final class i92 extends ue0 {

    /* renamed from: q, reason: collision with root package name */
    final Map f9894q = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    private final Context f9895r;

    /* renamed from: s, reason: collision with root package name */
    private final rx1 f9896s;

    /* renamed from: t, reason: collision with root package name */
    private final w2.v f9897t;

    /* renamed from: u, reason: collision with root package name */
    private final v82 f9898u;

    /* renamed from: v, reason: collision with root package name */
    private String f9899v;

    /* renamed from: w, reason: collision with root package name */
    private String f9900w;

    public i92(Context context, v82 v82Var, w2.v vVar, rx1 rx1Var) {
        this.f9895r = context;
        this.f9896s = rx1Var;
        this.f9897t = vVar;
        this.f9898u = v82Var;
    }

    private final String A8() {
        n82 n82Var = (n82) this.f9894q.get(this.f9899v);
        return n82Var == null ? "" : n82Var.a();
    }

    public static void l8(Context context, rx1 rx1Var, v82 v82Var, String str, String str2) {
        m8(context, rx1Var, v82Var, str, str2, new HashMap());
    }

    public static void m8(Context context, rx1 rx1Var, v82 v82Var, String str, String str2, Map map) {
        String str3;
        String str4 = true != r2.t.l().u(context) ? "offline" : "online";
        if (rx1Var != null) {
            qx1 a8 = rx1Var.a();
            a8.c("gqi", str);
            a8.c("action", str2);
            a8.c("device_connectivity", str4);
            a8.c("event_timestamp", String.valueOf(r2.t.o().a()));
            for (Map.Entry entry : map.entrySet()) {
                a8.c((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = a8.g();
        } else {
            str3 = "";
        }
        v82Var.h(new z82(r2.t.o().a(), str, str3, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void r() {
        /*
            r7 = this;
            r2.t.g()     // Catch: android.os.RemoteException -> L20
            android.content.Context r0 = r7.f9895r     // Catch: android.os.RemoteException -> L20
            v2.q0 r1 = v2.f2.d(r0)     // Catch: android.os.RemoteException -> L20
            w3.a r2 = w3.b.C1(r0)     // Catch: android.os.RemoteException -> L20
            t2.a r3 = new t2.a     // Catch: android.os.RemoteException -> L20
            java.lang.String r4 = r7.f9900w     // Catch: android.os.RemoteException -> L20
            java.lang.String r5 = r7.f9899v     // Catch: android.os.RemoteException -> L20
            java.util.Map r6 = r7.f9894q     // Catch: android.os.RemoteException -> L20
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.internal.ads.n82 r6 = (com.google.android.gms.internal.ads.n82) r6     // Catch: android.os.RemoteException -> L20
            if (r6 != 0) goto L22
            java.lang.String r6 = ""
            goto L26
        L20:
            r0 = move-exception
            goto L40
        L22:
            java.lang.String r6 = r6.b()     // Catch: android.os.RemoteException -> L20
        L26:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L20
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L20
            if (r2 != 0) goto L3e
            w3.a r0 = w3.b.C1(r0)     // Catch: android.os.RemoteException -> L3c
            java.lang.String r3 = r7.f9900w     // Catch: android.os.RemoteException -> L3c
            java.lang.String r4 = r7.f9899v     // Catch: android.os.RemoteException -> L3c
            boolean r0 = r1.zze(r0, r3, r4)     // Catch: android.os.RemoteException -> L3c
            goto L49
        L3c:
            r0 = move-exception
            goto L41
        L3e:
            r0 = 1
            goto L49
        L40:
            r2 = 0
        L41:
            int r1 = v2.n1.f26802b
            java.lang.String r1 = "Failed to schedule offline notification poster."
            w2.p.d(r1, r0)
            r0 = r2
        L49:
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.v82 r0 = r7.f9898u
            java.lang.String r1 = r7.f9899v
            r0.g(r1)
            java.lang.String r0 = r7.f9899v
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.z04 r2 = com.google.android.gms.internal.ads.z04.a()
            r7.x8(r0, r1, r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i92.r():void");
    }

    public static final PendingIntent t8(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return pu3.b(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return pu3.a(context, 0, intent, 201326592);
    }

    private final void u8(final Activity activity, final u2.a0 a0Var) {
        r2.t.g();
        if (androidx.core.app.l.b(activity).a()) {
            r();
            v8(activity, a0Var);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                x8(this.f9899v, "asnpdi", z04.a());
                return;
            }
            r2.t.g();
            AlertDialog.Builder o7 = v2.f2.o(activity);
            o7.setTitle(y8(p2.d.f25096f, "Allow app to send you notifications?")).setPositiveButton(y8(p2.d.f25094d, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.d92
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i7) {
                    i92.this.q8(activity, a0Var, dialogInterface, i7);
                }
            }).setNegativeButton(y8(p2.d.f25095e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.e92
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i7) {
                    i92.this.r8(a0Var, dialogInterface, i7);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.f92
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    i92.this.s8(a0Var, dialogInterface);
                }
            });
            o7.create().show();
            x8(this.f9899v, "rtsdi", z04.a());
        }
    }

    private final void v8(Activity activity, u2.a0 a0Var) {
        AlertDialog w8 = w8(activity, a0Var);
        w8.show();
        Timer timer = new Timer();
        timer.schedule(new a92(this, w8, timer, a0Var), 3000L);
    }

    private final AlertDialog w8(Activity activity, final u2.a0 a0Var) {
        r2.t.g();
        AlertDialog.Builder onCancelListener = v2.f2.o(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.g92
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                u2.a0 a0Var2 = u2.a0.this;
                if (a0Var2 != null) {
                    a0Var2.b();
                }
            }
        });
        XmlResourceParser z8 = z8(p2.c.f25090a);
        if (z8 == null) {
            onCancelListener.setMessage(y8(p2.d.f25097g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View inflate = activity.getLayoutInflater().inflate(z8, (ViewGroup) null);
            onCancelListener.setView(inflate);
            String A8 = A8();
            if (!TextUtils.isEmpty(A8)) {
                TextView textView = (TextView) inflate.findViewById(p2.b.f25088a);
                textView.setVisibility(0);
                textView.setText(A8);
            }
            n82 n82Var = (n82) this.f9894q.get(this.f9899v);
            Drawable c8 = n82Var != null ? n82Var.c() : null;
            if (c8 != null) {
                ((ImageView) inflate.findViewById(p2.b.f25089b)).setImageDrawable(c8);
            }
            AlertDialog create = onCancelListener.create();
            create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return create;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(y8(p2.d.f25097g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void x8(String str, String str2, Map map) {
        m8(this.f9895r, this.f9896s, this.f9898u, str, str2, map);
    }

    private static String y8(int i7, String str) {
        Resources h8 = r2.t.l().h();
        if (h8 == null) {
            return str;
        }
        try {
            return h8.getString(i7);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private static XmlResourceParser z8(int i7) {
        Resources h8 = r2.t.l().h();
        if (h8 == null) {
            return null;
        }
        try {
            return h8.getLayout(i7);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void L0(w3.a aVar) {
        k92 k92Var = (k92) w3.b.r0(aVar);
        final Activity a8 = k92Var.a();
        final u2.a0 b8 = k92Var.b();
        this.f9899v = k92Var.c();
        this.f9900w = k92Var.d();
        if (((Boolean) s2.b0.c().d(uy.q9)).booleanValue()) {
            u8(a8, b8);
            return;
        }
        x8(this.f9899v, "dialog_impression", z04.a());
        r2.t.g();
        AlertDialog.Builder o7 = v2.f2.o(a8);
        o7.setTitle(y8(p2.d.f25103m, "Open ad when you're back online.")).setMessage(y8(p2.d.f25102l, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(y8(p2.d.f25100j, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.h92
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i7) {
                i92.this.n8(a8, b8, dialogInterface, i7);
            }
        }).setNegativeButton(y8(p2.d.f25101k, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.b92
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i7) {
                i92.this.o8(b8, dialogInterface, i7);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.c92
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                i92.this.p8(b8, dialogInterface);
            }
        });
        o7.create().show();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:3)(1:28)|4|(9:8|9|(2:21|22)|11|12|13|14|15|16)|27|(0)|11|12|13|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d8, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d9, code lost:
    
        r11.put("notification_not_shown_reason", r10.getMessage());
        r10 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ve0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O3(w3.a r10, t2.a r11) {
        /*
            r9 = this;
            java.lang.Object r10 = w3.b.r0(r10)
            android.content.Context r10 = (android.content.Context) r10
            java.lang.String r0 = r11.f26390q
            java.lang.String r1 = r11.f26391r
            java.lang.String r11 = r11.f26392s
            java.lang.String r2 = r9.A8()
            v2.x2 r3 = r2.t.j()
            java.lang.String r4 = "offline_notification_channel"
            java.lang.String r5 = "AdMob Offline Notifications"
            r3.f(r10, r4, r5)
            java.lang.String r3 = "offline_notification_clicked"
            android.app.PendingIntent r3 = t8(r10, r3, r1, r0)
            java.lang.String r5 = "offline_notification_dismissed"
            android.app.PendingIntent r0 = t8(r10, r5, r1, r0)
            androidx.core.app.i$e r5 = new androidx.core.app.i$e
            r5.<init>(r10, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r6 = 1
            if (r4 != 0) goto L48
            int r4 = p2.d.f25099i
            java.lang.String r7 = "You are back online! Continue learning about %s"
            java.lang.String r4 = y8(r4, r7)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r8 = 0
            r7[r8] = r2
            java.lang.String r2 = java.lang.String.format(r4, r7)
            r5.j(r2)
            goto L53
        L48:
            int r2 = p2.d.f25098h
            java.lang.String r4 = "You are back online! Let's pick up where we left off"
            java.lang.String r2 = y8(r2, r4)
            r5.j(r2)
        L53:
            androidx.core.app.i$e r2 = r5.f(r6)
            androidx.core.app.i$e r0 = r2.k(r0)
            androidx.core.app.i$e r0 = r0.h(r3)
            android.content.pm.ApplicationInfo r2 = r10.getApplicationInfo()
            int r2 = r2.icon
            androidx.core.app.i$e r0 = r0.p(r2)
            com.google.android.gms.internal.ads.ly r2 = com.google.android.gms.internal.ads.uy.r9
            com.google.android.gms.internal.ads.sy r3 = s2.b0.c()
            java.lang.Object r2 = r3.d(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.o(r2)
            com.google.android.gms.internal.ads.ly r0 = com.google.android.gms.internal.ads.uy.t9
            com.google.android.gms.internal.ads.sy r2 = s2.b0.c()
            java.lang.Object r0 = r2.d(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 0
            if (r0 == 0) goto La7
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto La7
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> La7
            r0.<init>(r11)     // Catch: java.io.IOException -> La7
            java.net.URLConnection r11 = r0.openConnection()     // Catch: java.io.IOException -> La7
            java.io.InputStream r11 = r11.getInputStream()     // Catch: java.io.IOException -> La7
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r11)     // Catch: java.io.IOException -> La7
            goto La8
        La7:
            r11 = r2
        La8:
            if (r11 == 0) goto Lbe
            androidx.core.app.i$e r0 = r5.m(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.i$b r3 = new androidx.core.app.i$b     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r3.<init>()     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.i$b r11 = r3.i(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            androidx.core.app.i$b r11 = r11.h(r2)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
            r0.q(r11)     // Catch: android.content.res.Resources.NotFoundException -> Lbe
        Lbe:
            java.lang.String r11 = "notification"
            java.lang.Object r10 = r10.getSystemService(r11)
            android.app.NotificationManager r10 = (android.app.NotificationManager) r10
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            android.app.Notification r0 = r5.b()     // Catch: java.lang.IllegalArgumentException -> Ld8
            r2 = 54321(0xd431, float:7.612E-41)
            r10.notify(r1, r2, r0)     // Catch: java.lang.IllegalArgumentException -> Ld8
            java.lang.String r10 = "offline_notification_impression"
            goto Le4
        Ld8:
            r10 = move-exception
            java.lang.String r0 = "notification_not_shown_reason"
            java.lang.String r10 = r10.getMessage()
            r11.put(r0, r10)
            java.lang.String r10 = "offline_notification_failed"
        Le4:
            r9.x8(r1, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.i92.O3(w3.a, t2.a):void");
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void c1(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.f9895r;
                boolean u7 = r2.t.l().u(context);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r9 = true == u7 ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        hashMap.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        hashMap.put("olaa", "olaf");
                    }
                } else {
                    hashMap.put("offline_notification_action", "offline_notification_dismissed");
                }
                x8(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = this.f9898u.getWritableDatabase();
                    if (r9 == 1) {
                        this.f9898u.c(writableDatabase, this.f9897t, stringExtra2);
                    } else {
                        v82.m(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e8) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e8.toString());
                    int i7 = v2.n1.f26802b;
                    w2.p.c(concat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void c6(String[] strArr, int[] iArr, w3.a aVar) {
        for (int i7 = 0; i7 < strArr.length; i7++) {
            if (strArr[i7].equals("android.permission.POST_NOTIFICATIONS")) {
                k92 k92Var = (k92) w3.b.r0(aVar);
                Activity a8 = k92Var.a();
                u2.a0 b8 = k92Var.b();
                HashMap hashMap = new HashMap();
                if (iArr[i7] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    r();
                    v8(a8, b8);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (b8 != null) {
                        b8.b();
                    }
                }
                x8(this.f9899v, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void f() {
        final w2.v vVar = this.f9897t;
        this.f9898u.a(new j43() { // from class: com.google.android.gms.internal.ads.t82
            @Override // com.google.android.gms.internal.ads.j43
            public final /* synthetic */ Object d(Object obj) {
                v82.j(w2.v.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ve0
    public final void f3(w3.a aVar, String str, String str2) {
        O3(aVar, new t2.a(str, str2, ""));
    }

    public final void k8(String str, pn1 pn1Var) {
        String q7 = pn1Var.q();
        String b8 = pn1Var.b();
        String str2 = "";
        if (TextUtils.isEmpty(q7)) {
            q7 = b8 != null ? b8 : "";
        }
        l20 d8 = pn1Var.d();
        if (d8 != null) {
            try {
                str2 = d8.d().toString();
            } catch (RemoteException unused) {
            }
        }
        l20 p7 = pn1Var.p();
        Drawable drawable = null;
        if (p7 != null) {
            try {
                w3.a b9 = p7.b();
                if (b9 != null) {
                    drawable = (Drawable) w3.b.r0(b9);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f9894q.put(str, new k82(q7, str2, drawable));
    }

    final /* synthetic */ void n8(Activity activity, u2.a0 a0Var, DialogInterface dialogInterface, int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        x8(this.f9899v, "dialog_click", hashMap);
        u8(activity, a0Var);
    }

    final /* synthetic */ void o8(u2.a0 a0Var, DialogInterface dialogInterface, int i7) {
        this.f9898u.g(this.f9899v);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        x8(this.f9899v, "dialog_click", hashMap);
        if (a0Var != null) {
            a0Var.b();
        }
    }

    final /* synthetic */ void p8(u2.a0 a0Var, DialogInterface dialogInterface) {
        this.f9898u.g(this.f9899v);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        x8(this.f9899v, "dialog_click", hashMap);
        if (a0Var != null) {
            a0Var.b();
        }
    }

    final /* synthetic */ void q8(Activity activity, u2.a0 a0Var, DialogInterface dialogInterface, int i7) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        x8(this.f9899v, "rtsdc", hashMap);
        activity.startActivity(r2.t.j().h(activity));
        r();
        if (a0Var != null) {
            a0Var.b();
        }
    }

    final /* synthetic */ void r8(u2.a0 a0Var, DialogInterface dialogInterface, int i7) {
        this.f9898u.g(this.f9899v);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        x8(this.f9899v, "rtsdc", hashMap);
        if (a0Var != null) {
            a0Var.b();
        }
    }

    final /* synthetic */ void s8(u2.a0 a0Var, DialogInterface dialogInterface) {
        this.f9898u.g(this.f9899v);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        x8(this.f9899v, "rtsdc", hashMap);
        if (a0Var != null) {
            a0Var.b();
        }
    }
}
