package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: MyApplication */
public abstract class cg {
    public static pe a(cf cfVar) {
        long j7;
        boolean z7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        long j13;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = cfVar.f6405c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long b8 = str != null ? b(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i7 = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z7 = false;
            j8 = 0;
            j9 = 0;
            while (i7 < split.length) {
                String trim = split[i7].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j9 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j8 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z7 = true;
                }
                i7++;
            }
            j7 = 0;
            i7 = 1;
        } else {
            j7 = 0;
            z7 = false;
            j8 = 0;
            j9 = 0;
        }
        String str3 = (String) map.get("Expires");
        long b9 = str3 != null ? b(str3) : j7;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j10 = currentTimeMillis;
            j11 = b(str4);
        } else {
            j10 = currentTimeMillis;
            j11 = j7;
        }
        String str5 = (String) map.get("ETag");
        if (i7 != 0) {
            long j14 = (j9 * 1000) + j10;
            if (z7) {
                j13 = j14;
            } else {
                Long.signum(j8);
                j13 = (j8 * 1000) + j14;
            }
            j12 = j14;
        } else {
            j12 = (b8 <= j7 || b9 < b8) ? j7 : (b9 - b8) + j10;
            j13 = j12;
        }
        pe peVar = new pe();
        peVar.f13843a = cfVar.f6404b;
        peVar.f13844b = str5;
        peVar.f13848f = j12;
        peVar.f13847e = j13;
        peVar.f13845c = b8;
        peVar.f13846d = j11;
        peVar.f13849g = map;
        peVar.f13850h = cfVar.f6406d;
        return peVar;
    }

    public static long b(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e8) {
            if ("0".equals(str) || "-1".equals(str)) {
                rf.a("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            rf.d(e8, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static String c(long j7) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j7));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
