package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract class hb3 {

    /* renamed from: a, reason: collision with root package name */
    private static WindowManager f9411a;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f9412b = {"x", "y", "width", "height"};

    /* renamed from: c, reason: collision with root package name */
    static float f9413c = Resources.getSystem().getDisplayMetrics().density;

    public static void a(Context context) {
        if (context != null) {
            f9413c = context.getResources().getDisplayMetrics().density;
            f9411a = (WindowManager) context.getSystemService("window");
        }
    }

    public static JSONObject b(int i7, int i8, int i9, int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i7 / f9413c);
            jSONObject.put("y", i8 / f9413c);
            jSONObject.put("width", i9 / f9413c);
            jSONObject.put("height", i10 / f9413c);
            return jSONObject;
        } catch (JSONException e8) {
            ib3.a("Error with creating viewStateObject", e8);
            return jSONObject;
        }
    }

    public static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e8) {
            StringBuilder sb = new StringBuilder(str.length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            ib3.a(sb.toString(), e8);
        }
    }

    public static void d(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e8) {
            ib3.a("Error with setting ad session id", e8);
        }
    }

    public static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static void f(JSONObject jSONObject) {
        float f8;
        float f9;
        if (f9411a != null) {
            Point point = new Point(0, 0);
            f9411a.getDefaultDisplay().getRealSize(point);
            float f10 = point.x;
            float f11 = f9413c;
            f8 = f10 / f11;
            f9 = point.y / f11;
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        try {
            jSONObject.put("width", f8);
            jSONObject.put("height", f9);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    public static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f9412b;
            int i7 = 0;
            while (true) {
                if (i7 < 4) {
                    String str = strArr[i7];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i7++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (h(optJSONArray, optJSONArray2)) {
                            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                                if (!optJSONArray.optString(i8, "").equals(optJSONArray2.optString(i8, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (h(optJSONArray3, optJSONArray4)) {
                            for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                                if (g(optJSONArray3.optJSONObject(i9), optJSONArray4.optJSONObject(i9))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean h(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
