package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class w01 implements ia0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f17947a;

    /* renamed from: b, reason: collision with root package name */
    private final dr f17948b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f17949c;

    public w01(Context context, dr drVar) {
        this.f17947a = context;
        this.f17948b = drVar;
        this.f17949c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.ia0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(a11 a11Var) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        fr frVar = a11Var.f4673f;
        if (frVar == null) {
            jSONObject = new JSONObject();
        } else {
            dr drVar = this.f17948b;
            if (drVar.c() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z7 = frVar.f8421a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", drVar.b()).put("activeViewJSON", drVar.c()).put("timestamp", a11Var.f4671d).put("adFormat", drVar.a()).put("hashCode", drVar.d()).put("isMraid", false).put("isStopped", false).put("isPaused", a11Var.f4669b).put("isNative", drVar.e()).put("isScreenOn", this.f17949c.isInteractive()).put("appMuted", r2.t.m().d()).put("appVolume", r2.t.m().b());
            Context context = this.f17947a;
            put.put("deviceVolume", v2.b.e(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put2 = jSONObject3.put("windowVisibility", frVar.f8422b).put("isAttachedToWindow", z7);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = frVar.f8423c;
            JSONObject put3 = put2.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = frVar.f8424d;
            JSONObject put4 = put3.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = frVar.f8425e;
            JSONObject put5 = put4.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", frVar.f8426f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = frVar.f8427g;
            JSONObject put6 = put5.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", frVar.f8428h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = frVar.f8429i;
            put6.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put("isVisible", a11Var.f4668a);
            if (((Boolean) s2.b0.c().d(uy.H1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = frVar.f8431k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(a11Var.f4672e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
