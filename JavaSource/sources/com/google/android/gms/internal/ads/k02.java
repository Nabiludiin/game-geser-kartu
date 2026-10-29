package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class k02 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10834a;

    /* renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f10835b;

    /* renamed from: e, reason: collision with root package name */
    private String f10838e = "";

    /* renamed from: c, reason: collision with root package name */
    private final int f10836c = ((Integer) s2.b0.c().d(uy.ha)).intValue();

    /* renamed from: d, reason: collision with root package name */
    private final int f10837d = ((Integer) s2.b0.c().d(uy.ia)).intValue();

    public k02(Context context) {
        this.f10834a = context;
        this.f10835b = context.getApplicationInfo();
    }

    public final JSONObject a() {
        String str;
        String encodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.f10834a;
            String str2 = this.f10835b.packageName;
            of3 of3Var = v2.f2.f26746l;
            jSONObject.put("name", u3.e.a(context).d(str2));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f10835b.packageName);
        r2.t.g();
        Drawable drawable = null;
        try {
            str = v2.f2.f0(this.f10834a);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.f10838e.isEmpty()) {
            try {
                drawable = (Drawable) u3.e.a(this.f10834a).e(this.f10835b.packageName).f1816b;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                int i7 = this.f10836c;
                int i8 = this.f10837d;
                drawable.setBounds(0, 0, i7, i8);
                Bitmap createBitmap = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f10838e = encodeToString;
        }
        if (!this.f10838e.isEmpty()) {
            jSONObject.put("icon", this.f10838e);
            jSONObject.put("iconWidthPx", this.f10836c);
            jSONObject.put("iconHeightPx", this.f10837d);
        }
        return jSONObject;
    }
}
