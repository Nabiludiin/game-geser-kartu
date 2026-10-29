package n5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
class q {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f25039a;

    public q(Context context, String str) {
        this.f25039a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private synchronized void a() {
        try {
            long j7 = this.f25039a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f25039a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f25039a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f25039a.edit().putStringSet(str, hashSet).putLong("fire-count", j7 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized String d(long j7) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j7));
        }
        instant = new Date(j7).toInstant();
        zoneOffset = ZoneOffset.UTC;
        atOffset = instant.atOffset(zoneOffset);
        localDateTime = atOffset.toLocalDateTime();
        dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(dateTimeFormatter);
        return format;
    }

    private synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f25039a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    private synchronized void f(String str) {
        try {
            String e8 = e(str);
            if (e8 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f25039a.getStringSet(e8, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f25039a.edit().remove(e8).commit();
            } else {
                this.f25039a.edit().putStringSet(e8, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f25039a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f25039a.edit().putStringSet(str, hashSet).commit();
    }

    synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f25039a.edit();
            int i7 = 0;
            for (Map.Entry<String, ?> entry : this.f25039a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d8 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d8)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d8);
                        i7++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i7 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i7);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized List c() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f25039a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(r.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            h(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    synchronized void g(long j7, String str) {
        String d8 = d(j7);
        if (this.f25039a.getString("last-used-date", "").equals(d8)) {
            String e8 = e(d8);
            if (e8 == null) {
                return;
            }
            if (e8.equals(str)) {
                return;
            }
            i(str, d8);
            return;
        }
        long j8 = this.f25039a.getLong("fire-count", 0L);
        if (j8 + 1 == 30) {
            a();
            j8 = this.f25039a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f25039a.getStringSet(str, new HashSet()));
        hashSet.add(d8);
        this.f25039a.edit().putStringSet(str, hashSet).putLong("fire-count", j8 + 1).putString("last-used-date", d8).commit();
    }

    synchronized void h(long j7) {
        this.f25039a.edit().putLong("fire-global", j7).commit();
    }
}
