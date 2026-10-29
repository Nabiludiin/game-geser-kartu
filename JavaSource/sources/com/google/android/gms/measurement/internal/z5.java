package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.cf;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22922a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f22923b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f22924c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d6 f22925d;

    public z5(d6 d6Var, String str, Bundle bundle) {
        Objects.requireNonNull(d6Var);
        this.f22925d = d6Var;
        p3.o.g(str);
        this.f22922a = str;
        this.f22923b = new Bundle();
    }

    public final Bundle a() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        if (this.f22924c == null) {
            d6 d6Var = this.f22925d;
            String string3 = d6Var.p().getString(this.f22922a, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i7);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            this.f22925d.f22928a.a().o().a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            cf.a();
                                            if (d6Var.f22928a.w().H(null, c5.R0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i8 = 0; i8 < length; i8++) {
                                                    jArr[i8] = jSONArray2.optLong(i8);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        cf.a();
                                        if (d6Var.f22928a.w().H(null, c5.R0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i9 = 0; i9 < length2; i9++) {
                                                iArr[i9] = jSONArray3.optInt(i9);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        d6Var.f22928a.a().o().b("Unrecognized persisted bundle type. Type", string2);
                    }
                    this.f22924c = bundle;
                } catch (JSONException unused2) {
                    this.f22925d.f22928a.a().o().a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.f22924c == null) {
                this.f22924c = this.f22923b;
            }
        }
        return new Bundle((Bundle) p3.o.m(this.f22924c));
    }

    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        d6 d6Var = this.f22925d;
        SharedPreferences.Editor edit = d6Var.p().edit();
        if (bundle2.size() == 0) {
            edit.remove(this.f22922a);
        } else {
            String str = this.f22922a;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        cf.a();
                        w6 w6Var = d6Var.f22928a;
                        if (!w6Var.w().H(null, c5.R0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                w6Var.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            w6Var.a().o().b("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e8) {
                        this.f22925d.f22928a.a().o().b("Cannot serialize bundle value to SharedPreferences", e8);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.f22924c = bundle2;
    }
}
