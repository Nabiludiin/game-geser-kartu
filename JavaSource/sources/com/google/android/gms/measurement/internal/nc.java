package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    private final Map f22413a;

    nc(Map map) {
        HashMap hashMap = new HashMap();
        this.f22413a = hashMap;
        hashMap.putAll(map);
    }

    private final Bundle f() {
        int g8;
        Map map = this.f22413a;
        if ("1".equals(map.get("GoogleConsent")) && (g8 = g()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(t4.v.AD_STORAGE.f26428q, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(t4.v.AD_PERSONALIZATION.f26428q, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && g8 >= 4) {
                    String str3 = t4.v.AD_USER_DATA.f26428q;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    private final int g() {
        try {
            String str = (String) this.f22413a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    final String a() {
        StringBuilder sb = new StringBuilder();
        z4.i iVar = pc.f22486a;
        int size = iVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            String str = (String) iVar.get(i7);
            Map map = this.f22413a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0062, code lost:
    
        if (r0.get("Version") != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        return f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
    
        if (g() >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
    
        r1 = new android.os.Bundle();
        r2 = t4.v.AD_STORAGE.f26428q;
        r6 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
    
        if (true == java.util.Objects.equals(r0.get("AuthorizePurpose1"), "1")) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        r4 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
    
        r1.putString(r2, r4);
        r2 = t4.v.AD_PERSONALIZATION.f26428q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose3"), "1") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose4"), "1") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        r4 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        r1.putString(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        if (g() < 4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
    
        r2 = t4.v.AD_USER_DATA.f26428q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c6, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose1"), "1") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (java.util.Objects.equals(r0.get("AuthorizePurpose7"), "1") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d6, code lost:
    
        r1.putString(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        r6 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        r4 = "denied";
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        r4 = "granted";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        return f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x004c, code lost:
    
        if ("1".equals(r2.get("EnableAdvertiserConsentMode")) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
    
        if ("1".equals(r2.get("EnableAdvertiserConsentMode")) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0058, code lost:
    
        if (((java.lang.Boolean) r0.b(null)).booleanValue() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005a, code lost:
    
        r0 = r9.f22413a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle b() {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.b5 r0 = com.google.android.gms.measurement.internal.c5.f21935a1
            r1 = 0
            java.lang.Object r2 = r0.b(r1)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.String r3 = "EnableAdvertiserConsentMode"
            java.lang.String r4 = "gdprApplies"
            java.lang.String r5 = "1"
            if (r2 == 0) goto L2c
            java.util.Map r2 = r9.f22413a
            java.lang.Object r4 = r2.get(r4)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Ldf
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Ldf
            goto L4e
        L2c:
            java.util.Map r2 = r9.f22413a
            java.lang.String r6 = "GoogleConsent"
            java.lang.Object r6 = r2.get(r6)
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Ldf
            java.lang.Object r4 = r2.get(r4)
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Ldf
            java.lang.Object r2 = r2.get(r3)
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto Ldf
        L4e:
            java.lang.Object r0 = r0.b(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lda
            java.util.Map r0 = r9.f22413a
            java.lang.String r1 = "Version"
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L69
            android.os.Bundle r0 = r9.f()
            return r0
        L69:
            int r1 = r9.g()
            if (r1 >= 0) goto L71
            goto Ldf
        L71:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            t4.v r2 = t4.v.AD_STORAGE
            java.lang.String r2 = r2.f26428q
            java.lang.String r3 = "AuthorizePurpose1"
            java.lang.Object r4 = r0.get(r3)
            boolean r4 = java.util.Objects.equals(r4, r5)
            java.lang.String r6 = "granted"
            java.lang.String r7 = "denied"
            r8 = 1
            if (r8 == r4) goto L8d
            r4 = r7
            goto L8e
        L8d:
            r4 = r6
        L8e:
            r1.putString(r2, r4)
            t4.v r2 = t4.v.AD_PERSONALIZATION
            java.lang.String r2 = r2.f26428q
            java.lang.String r4 = "AuthorizePurpose3"
            java.lang.Object r4 = r0.get(r4)
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto Laf
            java.lang.String r4 = "AuthorizePurpose4"
            java.lang.Object r4 = r0.get(r4)
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 == 0) goto Laf
            r4 = r6
            goto Lb0
        Laf:
            r4 = r7
        Lb0:
            r1.putString(r2, r4)
            int r2 = r9.g()
            r4 = 4
            if (r2 < r4) goto Ld9
            t4.v r2 = t4.v.AD_USER_DATA
            java.lang.String r2 = r2.f26428q
            java.lang.Object r3 = r0.get(r3)
            boolean r3 = java.util.Objects.equals(r3, r5)
            if (r3 == 0) goto Ld5
            java.lang.String r3 = "AuthorizePurpose7"
            java.lang.Object r0 = r0.get(r3)
            boolean r0 = java.util.Objects.equals(r0, r5)
            if (r0 == 0) goto Ld5
            goto Ld6
        Ld5:
            r6 = r7
        Ld6:
            r1.putString(r2, r6)
        Ld9:
            return r1
        Lda:
            android.os.Bundle r0 = r9.f()
            return r0
        Ldf:
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.nc.b():android.os.Bundle");
    }

    public final String c() {
        String str = (String) this.f22413a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String d(nc ncVar) {
        Map map = ncVar.f22413a;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle b8 = b();
        Bundle b9 = ncVar.b();
        return str.concat((b8.size() == b9.size() && Objects.equals(b8.getString("ad_storage"), b9.getString("ad_storage")) && Objects.equals(b8.getString("ad_personalization"), b9.getString("ad_personalization")) && Objects.equals(b8.getString("ad_user_data"), b9.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int i7 = -1;
        try {
            String str = (String) this.f22413a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i7 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i7 < 0 || i7 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i7 & 63));
        }
        int g8 = g();
        if (g8 < 0 || g8 > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(g8));
        }
        p3.o.a(true);
        Map map = this.f22413a;
        int i8 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean equals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i9 = i8 | 4;
        if (equals) {
            i9 = i8 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i9));
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nc) {
            return a().equalsIgnoreCase(((nc) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
