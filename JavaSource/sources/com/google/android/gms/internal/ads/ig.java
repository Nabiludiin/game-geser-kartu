package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class ig extends gf {
    private final Object C;
    private final kf D;

    public ig(int i7, String str, kf kfVar, jf jfVar) {
        super(i7, str, jfVar);
        this.C = new Object();
        this.D = kfVar;
    }

    protected void F(String str) {
        kf kfVar;
        synchronized (this.C) {
            kfVar = this.D;
        }
        kfVar.d(str);
    }

    @Override // com.google.android.gms.internal.ads.gf
    protected final lf x(cf cfVar) {
        String str;
        String str2;
        try {
            byte[] bArr = cfVar.f6404b;
            Map map = cfVar.f6405c;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] split = str2.split(";", 0);
                int i7 = 1;
                while (true) {
                    if (i7 >= split.length) {
                        break;
                    }
                    String[] split2 = split[i7].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i7++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(cfVar.f6404b);
        }
        return lf.a(str, cg.a(cfVar));
    }
}
